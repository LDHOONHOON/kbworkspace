<template>
  <div>
    <h3>
      당신이 경험한 프론트 엔드 기술은?
      (두번째:slot 사용)
    </h3>
    <!-- items 배열을 순회하면서 자식의 props에 해당 값들을 넘겨준다 -->
    <!-- 자식에서 보낸 check-changed 이벤트에 CheckBoxChanged 함수 연결 -->
    <CheckBox1
      v-for="item in items"
      :key="item.id"
      :id="item.id"
      :label="item.label"
      @check-changed="CheckBoxChanged"
      ><span
        v-if="item.checked"
        style="
          color: blue;
          text-decoration: underline;
        "
      >
        <i>{{ item.label }}</i>
        <!--이탤릭체로 보여질 경우 label 출력-->
      </span>
      <!-- 체크 해제됐을 경우 랜더링되는 span -->
      <span v-else style="color: gray">{{
        item.label
      }}</span>
    </CheckBox1>
  </div>
</template>

<script>
import CheckBox1 from './CheckBox1.vue';

export default {
  name: 'SlotTest',
  components: { CheckBox1 },
  data() {
    return {
      items: [
        { id: 'V', checked: true, label: 'Vue' },
        {
          id: 'A',
          checked: false,
          label: 'Angular',
        },
        {
          id: 'R',
          checked: false,
          label: 'React',
        },
        {
          id: 'S',
          checked: false,
          label: 'Svelte',
        },
      ],
    };
  },
  methods: {
    CheckBoxChanged(e) {
      // 변경된 체크박스의 id로 현재 items 배열에서 해당 요소를 찾는다
      let item = this.item.find(
        (item) => item.id === e.id
      );
      item.checked = e.checked; //해당 아이템의 checked 값을 받아온 값으로 변경
    },
  },
};
</script>
