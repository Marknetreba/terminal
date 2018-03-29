<template>
  <div class="registration">
    <div class="registration-half">
      <card no-body
            header="Выберите удобный вам способ аутентификации"
            header-text-variant="white"
            header-bg-variant="info">
        <tabs card>

          <tab title="Идентификация по номеру телефона">
              <label>Введите номер телефона: </label>
              <form-input v-model="num" type="tel" class="registration-half_phone-label" placeholder="Мобильный номер телефона"/>
              <keyboard class="registration-half_keyboard" v-model="num" layouts="123|456|789|+0{Удалить:backspace}"></keyboard>
              <button class="btn btn-info btn-lg" @click="searchByNum">Поиск</button>
          </tab>

          <tab title="Идентификация по ФИО пациента">
              <label>Введите ФИО пациента: </label>
              <form-input v-model="text" type="text" class="registration-half_fio-label" placeholder="Иванов Иван Иванович" />

              <keyboard class="registration-half_keyboard" v-model="text"
                                  :layouts="[
                  'ЙЦУКЕНГШЩЗХЪ|ФЫВАПРОЛДЖЭ|ЯЧСМИТЬБЮ|{Очистить:clear}{Пробел:space}{Удалить:backspace}'
              ]"></keyboard>
              <button class="btn btn-info btn-lg" @click="searchByText">Поиск</button>
          </tab>

        </tabs>
      </card>
      <div class="registration-iframe"><img src="../photo/55/main.jpg" style="width: 100%; height: 100%"/></div>
    </div>

    <loading :show="progress" :label="label"></loading>

    <modal v-model="show" size="lg" centered title="Выберите пациента из списка">
      <b_table striped hover :items="items" :fields="fields" @row-clicked="goDetails">
      </b_table>
      <div slot="modal-footer" class="modal-footer">
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
  import Keyboard from "vue-keyboard";
  import router from '../router/index';
  import loading from 'vue-full-loading';
  import moment from 'moment';
  import b_img from "bootstrap-vue/es/components/image/img";
  import config from '../config.json';

  export default {
    data() {
      return {
        macAddress: '',
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
          fullname:{label: "Имя пациента", sortable: true},
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
    created() {
      this.id = window.location.href;
      this.macAddress = config[this.id.substring(this.id.indexOf('=')+1,this.id.indexOf('#'))];
      console.log(window.location)
    },
    methods: {
      searchByText() {
        this.progress=true;
        this.$http.get('/pacient/{name}/{date}/{filial}', {params: {name: this.text, date: this.time, filial: this.macAddress}}).then(response => {
          if (response) {
            this.show = true;
            this.progress = false;
            this.items = response.data;
            console.log(this.items)
          }
          else if (response.data.length === 0) {
            this.progress=false;
          }
        })
          .catch(error => {
            this.progress = false;
            console.log(error)
        })
      },

      searchByNum() {
        this.progress = true;
        this.pacients = [];
        this.$http.get('/schedulePhone/{phone}', {params: {phone: this.num}}).then(response => {
          console.log(response);
          if (response) {
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
                }
              })
            })
          }
          else {
            this.progress=false;
          }
        })
          .catch (error=> {
            this.progress = false;
            console.log(error)
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
  button {
    margin-top: 5px;
    font-size: 30px;
  }

  label {
    font-size: 20px;
  }

  .registration-half_phone-label {
    margin-left: 80px;
    width: 70%;
    font-size: 20px;
  }

  .registration-half_fio-label {
    font-size: 20px;
  }

  .registration-half_keyboard {
    margin-top: 10px;
    margin-bottom: 5px;
    font-size: 25px;
  }

  .registration {
    height: 100%;
  }

  /*.tab-content>.active {*/
    /*display: flex;*/
  /*}*/

  .registration-half {
    display: flex;
    height: 100%;
  }

  .registration-iframe {
    height: 100%;
    flex: 1;
  }
</style>
