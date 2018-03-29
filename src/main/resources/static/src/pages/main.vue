<template>
  <div class="main">
    <img src="../photo/55/logo.jpg">
    <h1>{{ msg }}</h1>
    <button class="btn btn-info btn-lg" @click="onClick"> Я пришел </button>
  </div>
</template>

<script>
  import Button from "bootstrap-vue/es/components/button/button";
  import router from '../router/index';
  import config from '../config.json';

  export default {
    components: {Button, config},
    name: 'main',
    data() {
      return {
        msg: 'Добро пожаловать в Инфокиоск'
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
  button {
    font-size: 40px;
    margin-top: 20px;
  }

  h1 {
    margin-top: 20px;
    font-weight: normal;
  }

</style>
