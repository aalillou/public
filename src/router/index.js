import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/home.vue'
import Resume from '../views/resume.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/cv',
    name: 'Resume',
    component: Resume
  }
]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
