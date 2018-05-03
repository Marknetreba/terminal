

const registration = {

  namespaced: true,

  state: {
    registration: {},
    activeTab: {},
    filial: {}
  },

  mutations: {
    setData(state, data) {
      state.registration = data
    },

    setActiveTab(state, data) {
      state.activeTab = data
    },

    setFilial(filial, data) {
      state.filial = data
    }

  },

  getters:{
    getData: state => {
      return state.registration
    },

    getTab: state => {
      return state.activeTab
    },

    getFilial: state => {
      return state.filial
    }
  },

  actions: {
    data({commit}, data) {
      commit('setData', data)
    },

    tabAction({commit}, data) {
      commit('setActiveTab', data)
    },

    filial({commit}, data) {
      commit('setFilial', data)
    }
  }

};

export default registration
