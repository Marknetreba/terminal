<template>
  <div class="main_details">

    <loading :show="progress" :label="label"></loading>

    <div class="options">

      <card header="Детали приема"
            header-text-variant="white"
            header-bg-variant="info">

        <a>{{items[0].fullname}}, Вам сегодня предстоит прием у специалистов</a><br/><a>{{items[0].webname}}!</a><br/>

        <b_table class="mt-3" striped hover :items="items" :fields="fields" @row-clicked="itemClick">
          <template slot="time" slot-scope="data">
            {{data.item.bhour}}:{{data.item.bmin}}
          </template>
          <template slot="chname" slot-scope="data">
            {{data.item.chname}}
          </template>
        </b_table>

      </card>

      <alert variant="success" :show="check">Благодарим вас за регистрацию посещения</alert>

      <button class="btn btn-info btn-lg mt-3" @click="goBack">Назад</button>
      <button class="btn btn-success btn-lg mt-3" @click="checkIncome">Я пришел(ла)</button>
    </div>

    <div class="details_iframe"><b_img src="../assets/akciya-pensionery_0.jpg"/></div>

  </div>

</template>

<script>
    import Card from "bootstrap-vue/es/components/card/card";
    import b_checkbox from "bootstrap-vue/es/components/form-checkbox/form-checkbox"
    import Button from "bootstrap-vue/es/components/button/button";
    import router from '../router/index';
    import b_table from "bootstrap-vue/src/components/table/_table";
    import modal from "bootstrap-vue/es/components/modal/_modal";
    import b_img from "bootstrap-vue/es/components/image/img";
    import loading from 'vue-full-loading';
    import moment from 'moment';
    import alert from "bootstrap-vue/es/components/alert/alert";

    export default {
      components: {
        modal, Button, Card, b_table, b_checkbox, b_img, loading, alert},
      name: "Details",
      data() {
        return {
          items: [],
          fields:{
            time:{label: 'Время приема', sortable: true},
            chname:{label: 'Кабинет врача', sortable: true},
            docname:{label: 'ФИО врача', sortable: true}
          },
          table:[],
          show: false,
          label: "Пожалуйста, подождите...",
          progress: false,
          check: false
        }
      },
      beforeRouteEnter: (to, from, next) => {
        next(vm => {
          vm.items = vm.$store.getters['registration/getData'];
          console.log(vm.items);
          }
        )
      },
      methods: {
        goBack() {
          router.push("Registration")
        },
        itemClick(item) {
          router.push('Reservation');
          this.$store.dispatch('reservation/data', item);
        },
        checkIncome() {
          this.progress = true;
          this.$http.get('/submit/{dcode}/{pcode}/{bhour}/{bmin}/{fhour}/{fmin}/{schedid}/{cashid}/{chid}/{date}', {params: {dcode:this.table.dcode, pcode:this.table.pcode, bhour:this.table.bhour, bmin:this.table.bmin,
            fhour:this.table.fhour, fmin:this.table.fmin, schedid:this.table.schedid, cashid:this.table.cashid, chid: this.table.chid, date: moment().format('DD.MM.YYYY')}})
            .then(response => {
              this.progress = false;
              this.check = true;
              console.log("Пришел ", response);
            });
        }
      }
    }
</script>

<style scoped>
  .main_details {
    display: flex;
  }
  .options {
    flex:1
  }
</style>
