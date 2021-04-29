import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios';
import VueRouter from 'vue-router';
import VueMaterial from 'vue-material'

import 'vue-material/dist/vue-material.min.css'
import 'vue-material/dist/theme/default.css'

Vue.config.productionTip = false
Vue.prototype.$axios = axios;
axios.defaults.baseURL = "http://localhost:8080"

Vue.use(VueRouter);
Vue.use(VueMaterial);

new Vue({
  el: "#app",
  router,
  render: h => h(App)
})
