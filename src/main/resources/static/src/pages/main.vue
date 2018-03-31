<template>
  <div class="main">
    <div class="button_half">
      <img class="img_half" src="../photo/55/main.png">
      <card style="background: #ffd310; border: none; margin-top: 10%">
        <h1>{{ msg }}</h1>
        <div class="d-flex flex-column-reverse">
        <button class="btn btn-lg" @click="onClick"> Поиск по номеру телефона </button>
        <button class="btn btn-lg" @click="onClick"> Поиск по ФИО </button>
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
        msg: 'Я пришел'
      }
    },
    methods: {
      onClick() {
        router.push('Registration')
      }
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .button_half {
    display: flex;
  }

  .img_half {
    height: 100%;
    width: 40%;
  }

  button {
    background-color: #ff6a13;
    font-size: 40px;
    margin-top: 20px;
    border-radius: 10px;
    box-shadow: 0px 5px 0px #666, 0px 3px 15px rgba(0,0,0,.4);
  }

  h1 {
    margin-top: 20px;
    font-weight: normal;
  }

  img {
    width: 25%;
    margin-top: 10%;
  }

</style>
