

const registration = {

  namespaced: true,

  state: {
    registration: []
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

  actions:{
    data({commit}, data){
      commit('setData', data)
    }
  }

};

export default registration
