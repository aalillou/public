import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { createI18n } from './i18n'
import moment from 'moment';
import 'moment/locale/fr'
import 'moment/locale/nl'
import vuetify from './plugins/vuetify'
import LightTimeline from 'vue-light-timeline';


const i18n = createI18n()

Vue.config.productionTip = false
Vue.use(LightTimeline);

const EventBus = new Vue()

Object.defineProperties(Vue.prototype, {
  $bus: {
    get: function () {
      return EventBus
    }
  },
  $moment: {
    get: function () {
      return moment
    }
  }
})
new Vue({
  router,
  store,
  i18n,
  vuetify,
  render: h => h(App)
}).$mount('#app')
