<template>

  <div class="main_details">
    <div class="options">

      <card header="Детали приема"
            header-text-variant="white"
            header-bg-variant="info">

        <a>{{items[0].fullname}}, Вам сегодня
          предстоит несколько приемов у
          специалистов Здоровенка!</a><br/>

        <b_table class="mt-3" striped hover :items="items" :fields="fields" @row-clicked="itemClick">
          <template slot="time" slot-scope="data">
            {{data.item.bhour}}:{{data.item.bmin}}
          </template>
          <template slot="chname" slot-scope="data">
            {{data.item.chname}}
          </template>
          <!--<template slot="top_row" slot-scope="data">-->
            <!--<button class="btn btn-primary btn-lg" @click.stop="checkIncome(data.item)">Отметиться о приходе</button>-->
          <!--</template>-->
        </b_table>

      </card>

      <button class="btn btn-info btn-lg mt-3" @click="goBack">Назад</button>
      <button class="btn btn-success btn-lg mt-3" @click="checkIncome">Отметиться на все приемы</button>
      <button class="btn btn-warning btn-lg mt-3" @click="takeImage">Фото</button>
    </div>

    <div class="details_iframe"><img src="../assets/akciya-pensionery_0.jpg" style="width: 100%"></div>

    <!--<loading :show="progress" :label="label"></loading>-->

    <modal v-model="show" size="lg" centered title="Детали приема">
      <list-group>
        <list_group_item><strong>Имя пациента:</strong> {{table.fullname}}</list_group_item>
        <list_group_item><strong>Дата рождения:</strong> {{table.bdate}}</list_group_item>
        <list_group_item><strong>Ф.И.О врача:</strong> {{table.docname}}</list_group_item>
        <list_group_item><strong>Номер кабинета:</strong> {{table.chname}}</list_group_item>
        <list_group_item><strong>Посетил(а):</strong> {{(table.clvisit==null || table.clvisit == 0) ? 'нет' : 'да' }}</list_group_item>
      </list-group>
      <div slot="modal-footer" class="modal-footer">
        <button class="btn btn-success btn-lg" @click="checkIncome">Я пришел(ла)</button>
        <button class="btn btn-warning btn-lg" @click="show = false">Закрыть</button>
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
    import list_group from "bootstrap-vue/es/components/list-group/list-group";
    import list_group_item from "bootstrap-vue/es/components/list-group/list-group-item";
    import moment from 'moment';
    import loading from 'vue-full-loading';


    export default {
      components: {
        modal, Button, Card, b_table, b_checkbox, list_group, list_group_item, loading},
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
          progress: false
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
          console.log(this.table);
          this.progress = true;
          this.$http.get('/submit/{dcode}/{pcode}/{bhour}/{bmin}/{fhour}/{fmin}/{schedid}/{cashid}/{chid}/{date}', {params: {dcode:this.table.dcode, pcode:this.table.pcode, bhour:this.table.bhour, bmin:this.table.bmin,
            fhour:this.table.fhour, fmin:this.table.fmin, schedid:this.table.schedid, cashid:this.table.cashid, chid: this.table.chid, date: moment().format('DD.MM.YYYY')}})
            .then(response => {
              this.progress = false;
              //console.log("Пришел ", response);
              router.push('Reservation')
          });
        },
        takeImage() {
          this.$http.get('/photo').then(response => {
            console.log("Photo",response)
          })
        },
        itemClick(item) {
          this.table = item;
          console.log(this.table);
          this.show = true;
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
