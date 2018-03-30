<template>
  <div class="reservation">
    <b_img class="logo" src="../photo/55/start.png"></b_img>
    <div class="reservation_details">

      <card header="Детали приема"
            header-text-variant="white"
            header-bg-variant="info" style="background: #ffd310; width: 49%">

        <b_img class="mb-3" height="375" rounded src="../photo/55/chname/doktor.png"/>

        <list-group>
          <list_group_item><strong>Имя пациента:</strong> {{table.fullname}}</list_group_item>
          <list_group_item><strong>Дата рождения:</strong> {{table.bdate}}</list_group_item>
          <list_group_item><strong>Ф.И.О врача:</strong> {{table.docname}}</list_group_item>
          <list_group_item><strong>Номер кабинета:</strong> {{table.chname}}</list_group_item>
          <list_group_item><strong>Посетил(а):</strong> {{(table.clvisit==null || table.clvisit == 0) ? 'нет' : 'да' }}</list_group_item>
        </list-group>

        <button class="btn btn-info btn-lg mt-3" @click="goBack">Назад</button>
        <button class="btn btn-warning btn-lg mt-3" @click="takeImage">Фото</button>

      </card>

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
          table: []
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
            console.log("Photo",response)
          })
        }
      }
    }
</script>

<style scoped>
  button {
    border-radius: 10px;
    box-shadow: 0px 4px 0px #666, 0px 3px 15px rgba(0,0,0,.4);
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
    top:-140px;
  }
  .logo {
    position: relative;
    right: 40%;
    margin-top: 15px;
    margin-bottom: 10px;
  }
</style>
