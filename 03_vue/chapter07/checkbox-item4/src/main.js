import { createApp } from 'vue';
import App from './App.vue';
// 전역 컨포넌트 등록 방법
import CheckboxItem from './components/CheckboxItem2.vue';

createApp(App)
  .component('CheckboxItem', CheckboxItem)
  .mount('#app');
