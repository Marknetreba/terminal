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
                  'йцукенгшщзъ|фывапролджэ|{Shift:goto:1}ячсмитьбю|{Пробел:space}{Удалить:backspace}',
                  'ЙЦУКЕНГШЩЗХЪ|ФЫВАПРОЛДЖЭ|{Shift:goto:0}ЯЧСМИТЬБЮ|{Пробел:space}{Удалить:backspace}'
              ]"></keyboard>
              <button class="btn btn-info btn-lg" @click="searchByText">Поиск</button>
          </tab>

        </tabs>
      </card>
      <div class="registration-iframe"><img src="../assets/akciya-pensionery_0.jpg" style="width: 100%"/></div>
    </div>

    <modal v-model="show" size="lg" centered title="Выберите пациента из списка">

      <b_table striped hover :items="items" :fields="fields" @row-clicked="goDetails">
      </b_table>
      <div slot="modal-footer" class="modal-footer">
        <button class="btn btn-info">Ок</button><button class="btn btn-dark" @click="show = false">Закрыть</button>
      </div>
    </modal>

  </div>
</template>

<script>
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

  export default {
    data() {
      return {
        response: [],
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
          }
        }
    },

    components: {
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
    },

    name: "Registration",
    computed: {
    },
    methods: {

      searchByText() {
        this.show = true;
        this.$http.get('/schedule/{name}', {params: {name: this.text}}).then(response => {
          this.items = response.data
          console.log(this.items)
        })
      },

      searchByNum(){
        this.show = true
        this.$http.get('/schedulePhone/{phone}', {params: {phone: this.num}}).then(response => {
          this.items = response.data
          console.log(this.items)
        })
      },

      goDetails(){
        router.push("Details")
      }
    }
  }
</script>
<style scoped>
  button {
    margin-top: 5px
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
    margin-top: 5px;
    font-size: 25px;
  }

  /*.tab-content>.active {*/
    /*display: flex;*/
  /*}*/

  .registration-half {
    display: flex;
  }

  .registration-iframe {
    flex: 1;
  }
</style>
