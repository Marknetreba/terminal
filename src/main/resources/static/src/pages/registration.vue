<template>
  <div class="registration">
    <b_img class="logo" src="../photo/55/start.png"></b_img>
    <p style="position: relative; right: 335px; color: #009800; font-size: 30px" class="mt-3 mb-4"><strong>{{msg}}</strong></p>
    <div class="registration-half">

        <tabs pills card v-model="tabIndex" style="width: 49%;font-weight: bold">

          <tab id="phone" title="ПОИСК ПО НОМЕРУ ТЕЛЕФОНА" :title-link-class="tabTitle(0)">
            <label><strong>Введите ваш номер телефона: </strong></label>
              <form-input v-model="num" type="tel" class="registration-half_phone-label" placeholder="Мобильный номер телефона"/>
              <keyboard class="registration-half_keyboard" v-model="num" :maxlength="11" layouts="123|456|789|0{Удалить:backspace}">
              </keyboard>

              <button class="btn btn-lg" @click="searchByNum">Поиск</button>
          </tab>

          <tab id="fio" :active="activeTab" title="ПОИСК ПО ФИО" :title-link-class="tabTitle(1)">
            <label><strong>Введите ваши ФИО: </strong></label>
              <form-input :formatter="nameFormat"
                          :state="nameLength"
                          v-model="text"
                          type="text"
                          class="registration-half_fio-label"
                          aria-describedby="inputFeedback"
                          placeholder="Фамилия Имя Отчество" />

              <form-invalid-feedback id="inputFeedback">
                Введите минимум 3 символа
              </form-invalid-feedback>

              <keyboard class="registration-half_keyboard" v-model="text"
                                  :layouts="[
                  'ЙЦУКЕНГШЩЗХЪ|ФЫВАПРОЛДЖЭ|ЯЧСМИТЬБЮ|{Очистить:clear}{Пробел:space}{Удалить:backspace}'
              ]"></keyboard>

              <button :disabled="!nameLength" class="btn btn-lg" @click="searchByText">Поиск</button>

          </tab>

          <alert dismissible variant="primary" :show="dismissCountDown" class="no_records" @dismissed="dismissCountDown=false"><strong>ЗАПИСЕЙ НЕ НАЙДЕНО</strong></alert>

        </tabs>

      <div class="registration-iframe"><img src="../photo/55/sales/55.png" style="width: 100%; height: 100%"/></div>
    </div>

    <loading :show="progress" :label="label"></loading>


    <modal v-model="show" size="lg" centered headerBgVariant="warning" footerBgVariant="warning">
      <b_table empty-text="ЗАПИСЕЙ НЕ НАЙДЕНО" striped hover :items="items" :fields="fields" @row-clicked="goDetails">

        <template slot="fullname" slot-scope="data">
          {{data.item.fullname.substr(0, data.item.fullname.indexOf(" ")) + data.item.fullname.substr(data.item.fullname.indexOf(" "),2)+'.'}}
        </template>

      </b_table>
      <div slot="modal-footer">
        <button class="btn btn-dark" @click="show = false">Закрыть</button>
      </div>
    </modal>

    <div class="fixed-bottom" style="right: unset!important;">
      <a>ID филиала: {{macAddress}}</a>
    </div>

  </div>
</template>

<script>
  import alert from 'bootstrap-vue/es/components/alert/alert'
  import Card from "bootstrap-vue/es/components/card/card";
  import Tabs from "bootstrap-vue/src/components/tabs/tabs";
  import Tab from "bootstrap-vue/es/components/tabs/tab";
  import formInput from "bootstrap-vue/es/components/form-input/_form-input";
  import Row from "bootstrap-vue/es/components/layout/row";
  import Container from "bootstrap-vue/es/components/layout/container";
  import Col from "bootstrap-vue/src/components/layout/col";
  import Button from "bootstrap-vue/es/components/button/button";
  import modal from "bootstrap-vue/es/components/modal/_modal";
  import b_table from "bootstrap-vue/src/components/table/_table";
  import Img from "bootstrap-vue/es/components/image/img";
  import Keyboard from "../utils/keyboard";
  import router from '../router/index';
  import loading from 'vue-full-loading';
  import moment from 'moment';
  import b_img from "bootstrap-vue/es/components/image/img";
  import config from '../config.json';

  export default {
    data() {
      return {
        tabIndex: 0,
        noRecords: false,
        macAddress: '',
        dismissCountDown: false,
        activeTab: false,
        msg: "РЕГИСТРАЦИЯ ПРИЕМА",
        label: "Пожалуйста, подождите...",
        progress: false,
        response: [],
        time: moment().format('DD.MM.YYYY'),
        num: '',
        text: '',
        show: false,
        items: [
          {fullname: ''},
          {bdate: ''}
          ],
        fields:{
          fullname:{label: "Имя", sortable: true},
          bdate:{label: "Дата рождения", sortable: true}
          },
        }
    },

    components: {
      moment,
      alert,
      Keyboard,
      Img,
      b_table,
      modal,
      Button,
      Col,
      Container,
      Row,
      formInput,
      Tab,
      Tabs,
      Card,
      loading,
      b_img,
      config
    },

    name: "Registration",
    computed: {
      nameLength() {
        return this.text.length > 2
      }
    },
    created() {
      this.tab = this.$store.getters['registration/getTab'];
      if (this.tab.toString() !== "[object Object]") {
        this.tab.includes("ФИО") ? this.activeTab = true : this.activeTab = false;
      }

      this.id = window.location.href;
      this.macAddress = config[this.id.substring(this.id.indexOf('=')+1,this.id.indexOf('#'))];
      this.$store.dispatch('registration/filial', this.macAddress);
    },
    methods: {
      tabTitle(idx) {
        if (this.tabIndex === idx) {
          return ['bg-info', 'text-light']
        } else {
          return ['', 'text-primary']
        }
      },
      nameFormat(value) {
        return value.toUpperCase();
      },
      searchByText() {
        this.progress=true;
        this.$http.get('/pacient/{name}/{date}/{filial}', {params: {name: this.text, date: this.time, filial: this.macAddress}}).then(response => {
          if (response.data.length>0) {
            this.show = true;
            this.progress = false;
            this.items = response.data;
          }
          else {
            this.dismissCountDown = true;
            this.progress=false;
          }
        })
          .catch(error => {
            this.dismissCountDown = true;
            this.progress = false;
        })
      },

      searchByNum() {
        this.progress = true;
        this.pacients = [];
        this.$http.get('/schedulePhone/{phone}', {params: {phone: this.num}}).then(response => {
          if (response.data.length>0) {
            response.data.forEach(i => {
              this.$http.get('/pacient/{name}/{date}/{filial}', {params: {name: i.fullname, date: this.time, filial: this.macAddress}}).then(response => {

                if (response.data.length>0) {
                  this.show = true;
                  this.progress = false;
                  this.pacients.push(response.data[0]);
                  this.items = this.pacients;
                }
                else {
                  this.progress=false;
                  this.dismissCountDown = true;
                }
              })
            })
          }
          else {
            this.dismissCountDown = true;
            this.progress=false;
          }
        })
          .catch (error=> {
            this.progress = false;
            this.dismissCountDown = true;
        })
      },

      goDetails(item) {
        this.progress = true;
        this.$http.get('/schedule/{name}/{date}/{filial}', {params: {name: item.fullname, date: this.time, filial: this.macAddress}}).then(response => {
          if(response){
            this.$store.dispatch('registration/data', response.data);
            this.progress = false;
          }
        }).then ( () => {
          router.push("Details");
        })
      }
    }
  }
</script>
<style scoped>

  .no_records {
    border-radius: 20px;
    margin: 15px 80px;
  }


  button {
    margin-top: 5px;
    font-size: 30px;
    border-radius: 10px;
    color: white;
    background: #ff6a13 linear-gradient(340deg, #ff6a13, rgba(255, 237, 226, 0.34));
    box-shadow: 0px 5px 0px #b44813, 0px 3px 15px rgba(0,0,0,.4);
  }

  label {
    font-size: 20px;
  }

  .registration-half_phone-label {
    margin-left: 80px;
    width: 70%;
    font-size: 20px;
    font-weight: bold;
  }

  .registration-half_fio-label {
    font-size: 20px;
    font-weight: bold;
  }

  .registration-half_keyboard {
    margin-top: 20px;
    margin-bottom: 5px;
    font-size: 21px;
    font-weight: bold;
  }

  .registration {
    height: 100%;
  }

  .registration-half {
    display: flex;
    height: 100%;
  }

  .registration-iframe {
    height: 100%;
    width: 51%;
    position: relative;
    top:-225px;
  }

  .logo {
    position: relative;
    right: 40%;
    margin-top: 15px;
    margin-bottom: 10px;
  }
</style>
