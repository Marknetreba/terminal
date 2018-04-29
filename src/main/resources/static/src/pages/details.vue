<template xmlns="http://www.w3.org/1999/html">
  <div class="main_details">
    <b_img class="logo" src="../photo/55/start.png"></b_img>
    <loading :show="progress" :label="label"></loading>
    <p style="position: relative; right: 335px; color: #009800; font-size: 30px" class="mt-3 mb-4"><strong>{{msg}}</strong></p>
    <div class="options">

      <div style="background: #ffd310; width: 49%">

        <a><strong>{{items[0].fullname}}, Вам сегодня предстоит прием у специалистов</strong></a><br/><a><strong>{{items[0].webname}}!</strong></a><br/>

        <b_table class="mt-3" striped hover :items="items" :fields="fields" style="background-color: white" @row-clicked="itemClick">
          <template slot="time" slot-scope="data">
            {{data.item.bhour}}:{{data.item.bmin}}
          </template>
          <template slot="chname" slot-scope="data">
            {{data.item.chname}}
          </template>
          <template slot="clvisit" slot-scope="data">
            {{data.item.clvisit==1? "Да":"Нет"}}
          </template>
        </b_table>

        <alert variant="success" :show="check">Благодарим вас за регистрацию посещения</alert>
        <button class="btn btn-lg mt-3" @click="goBack">Назад</button>
        <button v-bind:disabled="disabled" class="btn btn-lg mt-3" @click="checkIncome">Я пришел(ла)</button>
      </div>

      <div class="details_iframe"><b_img src="../photo/55/sales/55.png" style="width: 100%; height: 100%"/></div>
    </div>

  </div>

</template>

<script>
    import Card from "bootstrap-vue/es/components/card/card";
    import b_checkbox from "bootstrap-vue/es/components/form-checkbox/form-checkbox"
    import Button from "bootstrap-vue/es/components/button/button";
    import router from '../router/index';
    import b_table from "bootstrap-vue/src/components/table/_table";
    import modal from "bootstrap-vue/es/components/modal/_modal";
    import b_img from "bootstrap-vue/es/components/image/img";
    import loading from 'vue-full-loading';
    import moment from 'moment';
    import alert from "bootstrap-vue/es/components/alert/alert";
    import config from "../config.json";

    export default {
      components: {modal, Button, Card, b_table, b_checkbox, b_img, loading, alert, config},
      name: "Details",
      data() {
        return {
          items: [],
          disabled: false,
          fields:{
            time:{label: 'Время приема', sortable: true},
            chname:{label: 'Кабинет врача', sortable: true},
            docname:{label: 'ФИО врача', sortable: true},
            clvisit:{label: 'Пришел(ла)', sortable: true}
          },
          table:[],
          show: false,
          label: "Пожалуйста, подождите...",
          progress: false,
          msg: "ДЕТАЛИ ПРИЕМА",
          check: false,
          macAddress: ''
        }
      },
      beforeRouteEnter: (to, from, next) => {
          next(vm => { vm.items = vm.$store.getters['registration/getData']; }
        )
      },
      created() {
        this.id = window.location.href;
        this.macAddress = config[this.id.substring(this.id.indexOf('=')+1,this.id.indexOf('#'))];
      },
      methods: {

        goBack() {
          router.push("Registration")
        },

        itemClick(item) {
          router.push('Reservation');
          this.$store.dispatch('reservation/data', item);
        },

        takePhoto() {
          this.$http.get('/photo').then(response => {
            console.log(response);
            this.imagePath = location.origin+"/images/";
          })
        },

        notify() {

          console.log(this.imagePath);

          let bodyNotification = { "notification": {"title": "К вам пациент!", "body": "К вам пришел(ла): "+this.table.fullname},
            "to":"/topics/"+"55"
          };

          this.$http.post('https://fcm.googleapis.com/fcm/send', bodyNotification, {headers: {"Content-Type":"application/json", "Authorization": 'key=AAAAdArWtQU:APA91bEBGdgYLIUuX0_9H7MITtswX8Eu4YYMfNDUoVMfInHz0ueCtIL1JBtPRRbzievC3JhLApscOsx7zhpSNkxkJ5He8QjnXJFB5MQ6tQuhjv2zW6jUqhmBLuT7QYs0brG_73vJt5iT'}})
            .then(response => {
              console.log("Notification: ",response)
            })
        },

        checkIncome() {
          this.progress = true;
          this.$http.get('/submit/{dcode}/{pcode}/{bhour}/{bmin}/{fhour}/{fmin}/{schedid}/{cashid}/{chid}/{date}/{filial}', {params: {dcode:this.items[0].dcode, pcode:this.items[0].pcode, bhour:this.items[0].bhour, bmin:this.items[0].bmin,
            fhour:this.items[0].fhour, fmin:this.items[0].fmin, schedid:this.items[0].schedid, cashid:this.items[0].cashid, chid: this.items[0].chid, date: moment().format('DD.MM.YYYY'), filial: this.macAddress}})
            .then(response => {
              this.progress = false;
              this.check = true;
              this.disabled=true;
            });

          this.takePhoto();
          this.notify();
        }
      }
    }
</script>

<style scoped>

  button {
    border-radius: 10px;
    color: white;
    background-color: #ff6a13;
    background-image: linear-gradient(340deg, #ff6a13, rgba(255, 237, 226, 0.34));
    box-shadow: 0px 5px 0px #b44813, 0px 3px 15px rgba(0,0,0,.4);
  }

  .main_details {
    height: 100%;
  }

  .options {
    display: flex;
    height: 100%;
  }
  .details_iframe{
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
