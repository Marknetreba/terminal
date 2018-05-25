<template>
  <div class="reservation">
    <b_img class="logo" src="../photo/55/start.png"></b_img>
    <p style="position: relative; right: 335px; color: #009800; font-size: 30px" class="mt-3 mb-4">
      <strong>{{msg}}</strong></p>
    <div class="reservation_details">
      <div style="background: #ffd310; width: 49%">

        <p><strong>{{table.fullname.substr(0, table.fullname.indexOf(" ")) + table.fullname.substr(table.fullname.indexOf(" "),2)+'.'}},</strong></p>
        <p><strong>ВАШ ПРИЕМ СОСТОИТСЯ</strong></p>
        <p><strong>{{table.workdate.substring(0,11)}} В {{table.bhour}}:{{table.bmin}}</strong></p>
        <p><strong>ДОКТОР {{table.docname}}</strong></p>
        <p><strong>ПРИГЛАСИТ ВАС В КАБИНЕТ {{table.chname}}</strong></p>

        <b_img class="mb-3" height="375" rounded src="../photo/55/chname/doktor.png"/>
        <br/>

        <button class="btn btn-lg mt-3" @click="goBack">Назад</button>

      </div>

      <div class="reservation_iframe">
        <b_img src="../photo/55/sales/55.png" style="width: 100%; height: 100%"/>
      </div>

    </div>

  </div>
</template>

<script>
  import list_group from "bootstrap-vue/es/components/list-group/list-group";
  import list_group_item from "bootstrap-vue/es/components/list-group/list-group-item";
  import Button from "bootstrap-vue/es/components/button/button";
  import Card from "bootstrap-vue/es/components/card/card";
  import router from '../router/index';
  import b_img from "bootstrap-vue/es/components/image/img";

  export default {
    name: "Reservation",
    components: {list_group, list_group_item, Button, Card, b_img},

    data() {
      return {
        table: [],
        msg: "ДЕТАЛИ ПРИЕМА",
        filial: ''
      }
    },

    beforeRouteEnter: (to, from, next) => {
      next(vm => {
          vm.table = vm.$store.getters['reservation/getData'];
          vm.filial = vm.$store.getters['registration/getFilial'];
          console.log(vm.filial);
          console.log(vm.table);
        }
      )
    },

    created() {
      setTimeout(function(){
        router.push("/")
      }, 90000)
    },

    methods: {
      goBack() {
        router.push("Details")
      },
      takeImage() {
        this.$http.get('/photo').then(response => {
          console.log(response);

          this.imagePath = location.origin+"/images/";
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
    box-shadow: 0px 5px 0px #b44813, 0px 3px 15px rgba(0, 0, 0, .4);
  }

  .reservation {
    height: 100%;
  }

  .reservation_details {
    display: flex;
    height: 100%;
  }

  .reservation_iframe {
    width: 51%;
    height: 100%;
    position: relative;
    top: -225px;
  }

  .logo {
    position: relative;
    right: 40%;
    margin-top: 15px;
    margin-bottom: 10px;
  }
</style>
