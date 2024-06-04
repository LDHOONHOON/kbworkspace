import {
  createRouter,
  createWebHistory,
} from 'vue-router';
import Home from '@/Pages/Home.vue';
import About from '@/Pages/About.vue';
import TodoList from '@/Pages/TodoList.vue';
import AddTodo from '@/Pages/AddTodo.vue';
import EditTodo from '@/Pages/EditTodo.vue';
import NotFound from '@/Pages/NotFound.vue';

const router = createRouter({
  history: createWebHistory(
    import.meta.env.BASE_URL
  ),
  routes: [
    {
      path: '/',
      component: Home,
    },
    {
      path: '/about',
      component: About,
    },
    {
      path: '/todos',
      component: TodoList,
    },
    {
      path: '/todos/add',
      component: AddTodo,
    },
    {
      path: '/todos/edit/id',
      component: EditTodo,
    },
    {
      path: '/:paths(.*)*',
      component: NotFound,
    },
  ],
});

export default router;
