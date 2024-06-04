<template>
  <div>
    <h2>최신 인기곡</h2>
    <!-- songs를 props로 SongList에게 넘겨줌 -->
    <SongList :songs="songs" />
  </div>
</template>
<script>
import { computed } from 'vue';
import SongList from './components/SongList.vue';

export default {
  name: 'App',
  components: { SongList },
  data() {
    return {
      // 노래 목록이 들어있는 객체 배열
      songs: [
        { id: 1, title: 'Blueming', done: true },
        { id: 2, title: 'Dynamite', done: true },
        {
          id: 3,
          title: 'Lovesick Girls',
          done: false,
        },
        {
          id: 4,
          title: '마리아(Maria)',
          done: false,
        },
      ],
    };
  },
  // providefh 하위 컴포넌트에 속성이나 함수를 전달할 수 있음
  // 부모 컴포넌트에서 제공해야됨
  provide() {
    return {
      icons: {
        checked: 'far fa-check-circle',
        unchecked: 'far fa-circle',
      },
      doneCount: computed(() => {
        return this.songs.filter(
          (s) => s.done === true
        ).length;
      }),
    };
  },
};
</script>
<style>
@import url('https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css');
</style>
