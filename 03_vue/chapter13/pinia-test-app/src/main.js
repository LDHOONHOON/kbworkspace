import './assets/main.css';

import { createApp } from 'vue';
// pinia 모듈에서 createpinia 함수 갸져오기
import { createPinia } from 'pinia';
import App from './App.vue';

const app = createApp(App);

// pinia 생성 후 연결
app.use(createPinia());

app.mount('#app');
