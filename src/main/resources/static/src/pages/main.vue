<template>
  <div class="main">
    <img src="../photo/55/main.png">
    <h1>{{ msg }}</h1>
    <button class="btn btn-lg" @click="onClick"> Я пришел </button>
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
        msg: ''
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
    width: 22%;
    margin-top: 8%;
  }

</style>
