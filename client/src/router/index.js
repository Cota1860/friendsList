import Vue from 'vue'
import VueRouter from 'vue-router'
import ListView from '../views/ListView.vue'
import DetailView from '../views/DetailView.vue'
import AddView from '../views/AddView.vue'
import EditView from '../views/EditView'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'listPage',
    component: ListView,
  },
  {
    path: '/detail/:friendId/:length',
    name: 'detailPage',
    component: DetailView,
    props: true
  },
  {
    path: '/detail/add',
    name: 'addPage',
    component: AddView,
  },
  {
    path: '/detail/:friendId/:length/edit',
    name: 'editPage',
    component: EditView,
    props: true
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
