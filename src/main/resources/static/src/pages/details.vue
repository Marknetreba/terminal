<template>
  <div class="main_details">
    <div class="options">
      <card header="Детали пациента"
            header-text-variant="white"
            header-bg-variant="info">
        <b_table striped hover :items="items" :fields="fields" @row-clicked="">
        </b_table>
      </card>
      <button class="btn btn-info btn-lg" @click="goBack">Назад</button>
      <button class="btn btn-success btn-lg" @click="checkIncome">Отметиться о приеме</button>
      <button class="btn btn-success btn-lg" @click="checkIncome">Отметиться на все приемы</button>
    </div>
    <div class="details_iframe"><img src="../assets/akciya-pensionery_0.jpg"></div>
  </div>
</template>

<script>
    import Card from "bootstrap-vue/es/components/card/card";
    import b_checkbox from "bootstrap-vue/es/components/form-checkbox/form-checkbox"
    import Button from "bootstrap-vue/es/components/button/button";
    import router from '../router/index';
    import b_table from "bootstrap-vue/src/components/table/_table";

    export default {
      components: {Button, Card, b_table, b_checkbox},
      name: "Details",
      data() {
        return {
          items:[
            {time:''},
            {chname:''},
            {doc:''}
          ],
          fields:{
            time:{label: 'Время приема', sortable: true},
            chname:{label: 'Кабинет врача', sortable: true},
            doc:{label: 'ФИО врача', sortable: true}
          }
        }
      },
      methods: {
        goBack(){
          router.push("Registration")
        },
        checkIncome() {
          console.log("Пришел нах")
        }
      }
    }
</script>

<style scoped>
  .main_details {
    display: flex;
  }
</style>
