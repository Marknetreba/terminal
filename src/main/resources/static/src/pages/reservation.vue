<template>
  <div class="reservation">
    <b_img class="logo" src="../photo/55/start.png"></b_img>
    <p style="position: relative; right: 335px; color: #009800; font-size: 30px" class="mt-3 mb-4"><strong>{{msg}}</strong></p>
    <div class="reservation_details">
        <div style="background: #ffd310; width: 49%">

          <p><strong>{{table.fullname}},</strong></p>
          <p>ВАШ ПРИЕМ СОСТОИТСЯ</p>
          <p>{{table.workdate}} В {{table.bhour}}:{{table.bmin}}</p>
          <p>ДОКТОР {{table.docname}}</p>
          <p>ПРИГЛАСИТ ВАС В КАБИНЕТ {{table.chname}}</p>

        <b_img class="mb-3" height="375" rounded src="../photo/55/chname/doktor.png"/> <br/>

        <button class="btn btn-lg mt-3" @click="goBack">Назад</button>
        <!--<button class="btn btn-warning btn-lg mt-3" @click="takeImage">Фото</button>-->
        <!--<button class="btn btn-warning btn-lg mt-3" @click="notify">Уведомление</button>-->

        </div>

      <div class="reservation_iframe"><b_img src="../photo/55/sales/55.png" style="width: 100%; height: 100%"/></div>

    </div>

  </div>
</template>

<script>
    import list_group from "bootstrap-vue/es/components/list-group/list-group";
    import list_group_item from "bootstrap-vue/es/components/list-group/list-group-item";
    import Button from "bootstrap-vue/es/components/button/button";
    import Card from "bootstrap-vue/es/components/card/card";
    import moment from 'moment';
    import router from '../router/index';
    import b_img from "bootstrap-vue/es/components/image/img";

    export default {
      name: "Reservation",
      components: {list_group, list_group_item, Button, Card, b_img},

      data() {
        return {
          table: [],
          msg: "ДЕТАЛИ ПРИЕМА"
        }
      },

      beforeRouteEnter: (to, from, next) => {
        next(vm => {
            vm.table = vm.$store.getters['reservation/getData'];
            console.log(vm.table);
          }
        )
      },

      methods: {
        goBack() {
          router.push("Details")
        },
        takeImage() {
          this.$http.get('/photo').then(response => {
            console.log(response);
          })
        },
        notify() {
          let bodyNotification = { "notification": {"title": "К вам пациент!", "body": "К вам пришел: "+this.table.fullname},
            "to":":"
          };

          this.$http.post('https://fcm.googleapis.com/fcm/send', bodyNotification, {headers: {"Authorization": 'key=AAAAdArWtQU:APA91bEBGdgYLIUuX0_9H7MITtswX8Eu4YYMfNDUoVMfInHz0ueCtIL1JBtPRRbzievC3JhLApscOsx7zhpSNkxkJ5He8QjnXJFB5MQ6tQuhjv2zW6jUqhmBLuT7QYs0brG_73vJt5iT'}})
            .then(response => {
            console.log("Notification: ",response)
          })
        }
      }
    }
</script>

<style scoped>

  p {
    text-transform: uppercase;
  }

  button {
    border-radius: 10px;
    color: white;
    background-color: #ff6a13;
    background-image: linear-gradient(340deg, #ff6a13, rgba(255, 237, 226, 0.34));
    box-shadow: 0px 5px 0px #b44813, 0px 3px 15px rgba(0,0,0,.4);
  }

  .reservation {
    height: 100%;
  }

  .reservation_details {
    display:flex;
    height:100%;
  }
  .reservation_iframe{
    width: 51%;
    height:100%;
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
