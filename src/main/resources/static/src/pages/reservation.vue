<template>
  <div class="reservation">

    <loading :show="progress" :label="label"></loading>

    <div class="reservation_details">

      <card header="Детали приема"
            header-text-variant="white"
            header-bg-variant="info">

        <b_img class="mb-3" height="375" rounded src="../assets/vrach.jpg"/>

        <list-group>
          <list_group_item><strong>Имя пациента:</strong> {{table.fullname}}</list_group_item>
          <list_group_item><strong>Дата рождения:</strong> {{table.bdate}}</list_group_item>
          <list_group_item><strong>Ф.И.О врача:</strong> {{table.docname}}</list_group_item>
          <list_group_item><strong>Номер кабинета:</strong> {{table.chname}}</list_group_item>
          <list_group_item><strong>Посетил(а):</strong> {{(table.clvisit==null || table.clvisit == 0) ? 'нет' : 'да' }}</list_group_item>
        </list-group>

      </card>

      <button class="btn btn-info btn-lg mt-3" @click="goBack">Назад</button>
      <button class="btn btn-success btn-lg mt-3" @click="checkIncome">Я пришел(ла)</button>
      <button class="btn btn-warning btn-lg mt-3" @click="takeImage">Фото</button>

    </div>

    <div class="reservation_iframe"><img src="../assets/akciya-pensionery_0.jpg" style="width: 100%"></div>

  </div>
</template>

<script>
    import list_group from "bootstrap-vue/es/components/list-group/list-group";
    import list_group_item from "bootstrap-vue/es/components/list-group/list-group-item";
    import loading from 'vue-full-loading';
    import Button from "bootstrap-vue/es/components/button/button";
    import Card from "bootstrap-vue/es/components/card/card";
    import moment from 'moment';
    import router from '../router/index';
    import b_img from "bootstrap-vue/es/components/image/img"

    export default {
      name: "Reservation",
      components: {list_group, list_group_item, loading, Button, Card, b_img},

      data() {
        return {
          table: [],
          label: "Пожалуйста, подождите...",
          progress: false
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
        checkIncome() {
          this.progress = true;
          this.$http.get('/submit/{dcode}/{pcode}/{bhour}/{bmin}/{fhour}/{fmin}/{schedid}/{cashid}/{chid}/{date}', {params: {dcode:this.table.dcode, pcode:this.table.pcode, bhour:this.table.bhour, bmin:this.table.bmin,
            fhour:this.table.fhour, fmin:this.table.fmin, schedid:this.table.schedid, cashid:this.table.cashid, chid: this.table.chid, date: moment().format('DD.MM.YYYY')}})
            .then(response => {
              this.progress = false;
              console.log("Пришел ", response);
          });
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
  .reservation {
    display: flex;
  }
  .reservation_details {
    flex:1;
  }
</style>
