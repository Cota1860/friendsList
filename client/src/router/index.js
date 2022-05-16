import Vue from 'vue'
import VueRouter from 'vue-router'
import ListView from '../views/ListView.vue'
import DetailView from '../views/DetailView.vue'
import AddView from '../views/AddView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'listPage',
    component: ListView,
  },
  {
    path: '/detail/:id/:length',
    name: 'detailPage',
    component: DetailView,
    props: true
  },
  {
    path: '/detail/add',
    name: 'addPage',
    component: AddView,
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
