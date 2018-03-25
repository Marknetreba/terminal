import Vue from 'vue';
import Vuex from 'vuex';
import registration from './registration';
import reservation from './reservation';

Vue.use(Vuex);

const store = new Vuex.Store({
  modules:{
    registration,
    reservation
  }
});

export default store
