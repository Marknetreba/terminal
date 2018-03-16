import Vue from 'vue'
import Router from 'vue-router'
import main from '../pages/main'
import registration from '../pages/registration'
import details from '../pages/details'
import error from '../pages/error.vue'
import reservation from '../pages/reservation'

Vue.use(Router);

export default new Router({
  routes: [
    { path: '/', name: 'main', component: main },
    { path: '/registration', name: 'Registration', component: registration },
    { path: '/details', name: 'Details', component: details},
    { path: '/reservation', name: 'Reservation', component: reservation},
    { path: '/error', nmae: 'Error', component: error}
  ]
})
