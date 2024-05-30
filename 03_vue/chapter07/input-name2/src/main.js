import { createApp } from 'vue';
import App from './App.vue';
// 전역 컨포넌트 등록 방법
import CheckboxItem from './components/inputName.vue';

createApp(App)
  .component('CheckboxItem', CheckboxItem)
  .mount('#app');
