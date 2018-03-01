<template>

  <div class="main_details">
    <div class="options">

      <card header="Детали приема"
            header-text-variant="white"
            header-bg-variant="info">
        <b_table striped hover :items="items" :fields="fields" @row-clicked="show = true">
          <template slot="time" slot-scope="data">
            {{data.item.bhour}}:{{data.item.bmin}}
          </template>
          <template slot="chname" slot-scope="data">
            {{data.item.chname.substring(7)}}
          </template>
        </b_table>
      </card>

      <button class="btn btn-info btn-lg" @click="goBack">Назад</button>
      <button class="btn btn-success btn-lg" @click="checkIncome">Отметиться на все приемы</button>
    </div>

    <div class="details_iframe"><img src="../assets/akciya-pensionery_0.jpg" style="width: 100%"></div>

    <modal v-model="show" size="lg" centered title="Детали приема">
      <div slot="modal-footer" class="modal-footer">
        <button class="btn btn-success btn-lg" @click="checkIncome">Отметиться на прием</button>
        <button class="btn btn-dark" @click="show = false">Закрыть</button>
      </div>
    </modal>
  </div>

</template>

<script>
    import Card from "bootstrap-vue/es/components/card/card";
    import b_checkbox from "bootstrap-vue/es/components/form-checkbox/form-checkbox"
    import Button from "bootstrap-vue/es/components/button/button";
    import router from '../router/index';
    import b_table from "bootstrap-vue/src/components/table/_table";
    import modal from "bootstrap-vue/es/components/modal/_modal";

    export default {
      components: {
        modal, Button, Card, b_table, b_checkbox},
      name: "Details",
      data() {
        return {
          items: [],
          fields:{
            fullname:{label: 'Имя пациенат', sortable: true},
            time:{label: 'Время приема', sortable: true},
            chname:{label: 'Кабинет врача', sortable: true},
            docname:{label: 'ФИО врача', sortable: true}
          },
          show: false
        }
      },
      created() {
          this.items = this.$store.getters['registration/getData'];
          console.log(this.items);
      },
      methods: {
        goBack() {
          router.push("Registration")
        },
        checkIncome() {
          this.$http.post('/submit').then(response => {
            console.log("Пришел нах")
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
