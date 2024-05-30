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
    <button @click="calcAdd">계산</button><br />
    <div>결과 : {{ state.result }}</div>
  </div>
</template>

<script>
// composition ATI내dp 함수를 사용할려면 import 필수
import { reactive } from 'vue';

export default {
  name: 'Calc3',
  setup() {
    // reactive로 참조형 데이터를 감싸줘야 반응형으로 동작한다
    // 기존 옵션 API의  data와 같은 역할
    const state = reactive({
      x: 10,
      y: 0,
      result: 30,
    });
    const calcAdd = () => {
      // 참조형 데이터는 .value가 필요 없다
      state.value = state.x + state.y;
    };
    // return을 해줘야 template쪽에서 사용 가능
    return { state, calcAdd };
  },
};
</script>
