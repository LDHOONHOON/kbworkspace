import { fileURLToPath, URL } from 'node:url';
import { defineConfig } from 'vite';
import vue from '@vitejs/plugin-vue';
// https://vitejs.dev/config/
export default defineConfig({
  plugins: [vue()],
  resolve: {
    alias: {
      '@': fileURLToPath(
        new URL('./src', import.meta.url)
      ),
    },
  },
  server: {
    proxy: {
      '/api': {
        target: 'http://localhost:3000',
        //다른 서버주소가 들어와도 proxy 객체로 우회
        changeOrigin: true,
        // "/api"를 주소에서 제거
        rewrite: (path) =>
          path.replace(/^\/api/, ''),
      },
    },
  },
});
