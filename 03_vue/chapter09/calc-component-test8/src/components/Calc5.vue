<template>
  <div>
    X :
    <input type="text" v-model.number="x" /><br />
    <!-- computed 함수로 인해 바뀌는 값에 따라 바로  result 변경 -->
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
// composition API내에 함수를 사용할려면 import 필수
import { ref, watch } from 'vue';

export default {
  name: 'Calc5',
  setup() {
    const x = ref(0);
    const result = ref(0);
    // 기존 옵션 API의 watch 옵션과 동일한 역할
    // 첫번째 인자 : 감시하고 싶은 데이터(반응성 데이터)
    // 두번째 인자 : 현재 값과 전의 값을 받아서 실행할 함수
    watch(x, (current, old) => {
      console.log(`${old} -> ${current}`);
      result.value = current * 2;
    });
    return { x, result };
  },
};
</script>
