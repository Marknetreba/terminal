

const registration = {

  namespaced: true,

  state: {
    registration: {}
  },

  mutations: {
    setData(state, data) {
      state.registration = data
    }
  },

  getters:{
    getData: state => {
      return state.registration
    }
  },

  actions: {
    data({commit}, data) {
      commit('setData', data)
    },
    getPacients({commit}, data, time) {
      this.$http.get('/schedule/{name}/{date}', {params: {name: data.fullname, date: time}}).then(response => {
        commit('setData', response.data)
      })
    }
  }

};

export default registration
