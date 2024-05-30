<template>
  <div>
    X :
    <input
      type="text"
      v-model.number="state.x"
    /><br />
    Y :<input
      type="text"
      v-model.number="state.y"
    /><br />
    <!-- computed 함수로 인해 바뀌는 값에 따라 바로  result 변경 -->
    <div>결과 : {{ result }}</div>
  </div>
  s
</template>

<script>
// composition API내에 함수를 사용할려면 import 필수
import { reactive, computed } from 'vue';

export default {
  name: 'Calc4',
  setup() {
    // computed로 계산해주기 때문에 result 초기화 필요 없어짐
    const state = reactive({
      x: 10,
      y: 200,
    });
    const result = computed(() => {
      // 참조형 데이터는 .value가 필요 없다
      return state.x + state.y;
    });
    // return을 해줘야 template쪽에서 사용 가능
    return { state, result };
  },
};
</script>
