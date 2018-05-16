<template>
    <div>
      <h1 style="color: #009800; font-size: 40px; position: relative; top: 300px; text-transform: uppercase"><strong>{{ goodbye }}</strong></h1><br/>
      <b_img class="logo" width="375" src="../photo/55/start.png"></b_img>
    </div>
</template>

<script>
  import b_img from "bootstrap-vue/es/components/image/img";

  export default {
      components: {b_img},
      name: "final",
      data() {
        return {
          goodbye: 'Благодарим вас за регистрацию посещения'
        }
      }
    }
</script>

<style scoped>
  .logo{
    position: relative;
    top: 400px;
  }
</style>
