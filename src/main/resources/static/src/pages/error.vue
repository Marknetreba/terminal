<template>
  <div class="error_page">
    <a>Упс, ошибка!</a>
    <button class="btn btn-info btn-lg mt-lg-3" @click="goHome">Вернуться на главную</button>
  </div>
</template>
<script>
  import Button from "bootstrap-vue/es/components/button/button";
  import router from '../router/index';

  export default {
    name: 'Error',
    components:[
      Button
    ],
    methods:{
      goHome(){
        router.push("/")
      }
    }
  }
</script>
<style scoped>
  .error_page {
    display: inline-grid;
  }
</style>
