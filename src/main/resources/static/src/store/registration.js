

const registration = {

  namespaced: true,

  state: {
    registration: {},
    activeTab: {}
  },

  mutations: {
    setData(state, data) {
      state.registration = data
    },

    setActiveTab(state, data) {
      state.activeTab = data
    }

  },

  getters:{
    getData: state => {
      return state.registration
    },

    getTab: state => {
      return state.activeTab
    }
  },

  actions: {
    data({commit}, data) {
      commit('setData', data)
    },

    tabAction({commit}, data) {
      commit('setActiveTab', data)
    }
  }

};

export default registration
