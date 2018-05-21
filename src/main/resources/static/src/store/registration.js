

const registration = {

  namespaced: true,

  state: {
    registration: {},
    activeTab: {},
    filial: {},
    camera: {}
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
    },

    setFilial(camera, data) {
      state.camera = data
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
    },

    getCamera: camera => {
      return state.camera
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
    },

    camera({commit}, data) {
      commit('setCamera', data)
    }
  }

};

export default registration
