<template>
  <div class="details">
    <p>Детали пациента</p>
    <button class="btn btn-info btn-lg" @click="goBack">Назад</button>
  </div>
</template>

<script>
    import Button from "bootstrap-vue/es/components/button/button";
    import router from '../router/index';

    export default {
      components: {Button},
      name: "Details",
      methods: {
        goBack(){
          router.push("Registration")
        }
      }
    }
</script>

<style scoped>

</style>
