import {
  createRouter,
  createWebHistory,
} from 'vue-router';
// ../와 @/ 모두 src 폴더 내를 가리킴
import Home from '@/pages/Home.vue';
import About from '@/pages/About.vue';
import Members from '@/pages/Members.vue';
import Videos from '@/pages/Videos.vue';
import NotFound from '@/pages/NotFound.vue';

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/',
      // name: 'home', //name 속성은 필수가 아니다.
      // 무조건 로딩되어야 하는 페이지기 때문에 정적으로 처리
      component: Home,
    },

    {
      path: '/about',
      // name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      // 해당 경로가 방문됐을 때만 로딩되게 만들어둠, 화살표함수로 처리
      // component: () => import('../views/AboutView.vue'),
      component: About,
    },
    {
      path: '/members',
      component: Members,
    },
    {
      path: '/videos',
      component: Videos,
    },
    // 어떤 문자든지 위에서 해당하지 않는 경로는 다 여기서 처리
    // 404 라우트
    {
      path: '/:paths(.*)*',
      name: 'NotFound',
      component: NotFound,
    },
  ],
});

// router 만든후 내보내기
export default router;
