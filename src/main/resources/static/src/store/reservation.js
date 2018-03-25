const reservation = {

  namespaced: true,

  state: {
    reservation: {}
  },

  mutations: {
    setData(state, data) {
      state.reservation = data
    }
  },

  getters:{
    getData: state => {
      return state.reservation
    }
  },

  actions: {
    data({commit}, data) {
      commit('setData', data)
    }
  }

};

export default reservation;
