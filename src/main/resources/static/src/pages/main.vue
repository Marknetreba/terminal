<template>
  <div class="main">
    <div class="button_half">
      <img class="img_half" src="../photo/55/main.png">
      <card style="background: #ffd310; border: none; margin-top: 10%">
        <h1 style="color: #009800; font-size: 80px"><strong>{{ msg }}</strong></h1><br/>
        <h1 style="color: #009800; font-size: 45px"><strong>{{ patr }}</strong></h1><br/>
        <h1 style="color: #009800; font-size: 40px"><strong>{{ regMsg }}</strong></h1><br/>
        <h1 style="font-size: 30px"><strong>{{ choose }}</strong></h1><br/>

        <div class="d-flex flex-column-reverse">
          <button class="btn btn-lg" @click="onClick"><strong> ПО НОМЕРУ ТЕЛЕФОНА </strong></button><br/>
          <button class="btn btn-lg" style="" @click="onClick"><strong> ПО ФИО ПАЦИЕНТА </strong></button>
        </div>
      </card>
    </div>
  </div>
</template>

<script>
  import Button from "bootstrap-vue/es/components/button/button";
  import router from '../router/index';
  import config from '../config.json';
  import Card from "bootstrap-vue/es/components/card/card";
  export default {
    components: {Card, Button, config},
    name: 'main',
    data() {
      return {
        msg: 'Я пришёл!',
        regMsg: 'РЕГИСТРАЦИЯ ПРИЕМА',
        patr: 'СЕРВИС ДЛЯ ПАТРОНАЖНЫХ ПАЦИЕНТОВ',
        choose: 'ВЫБЕРИТЕ УДОБНЫЙ ДЛЯ ВАС СПОСОБ ИДЕНТИФИКАЦИИ'
      }
    },
    methods: {
      onClick(item) {
        this.$store.dispatch('registration/tabAction', item.srcElement.innerHTML);
        router.push('Registration')
      }
    }
  }
</script>

<style scoped>
  .button_half {
    display: flex;
  }
  .img_half {
    height: 1025px;
    width: 950px;
  }
  button {
    position: relative;
    left: 60px;
    height: 90px;
    width: 80%;
    color: white;
    background-color: #ff6a13;
    background-image: linear-gradient(340deg, #ff6a13, rgba(255, 237, 226, 0.34));
    font-size: 25px;
    margin-top: 20px;
    border-radius: 20px;
    box-shadow: 0px 5px 0px #b44813, 0px 3px 15px rgba(0,0,0,.4);
  }
  h1 {
    margin-top: 20px;
    font-weight: normal;
  }

</style>
