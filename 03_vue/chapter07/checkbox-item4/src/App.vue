<template>
  <div>
    <h2>관심있는 K-POP가수?</h2>
    <br />
    <ul>
      <!-- idlo은 idols 배열을 돌면서 객체 하나씩 접근 -->
      <!-- 자식에 등록된  props와 동일한 이름으로 넘겨줘야 한다 -->
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :id="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
    <!-- name과 checked는 자식한테 props로 전달해주는 속성 (사용자 정의) -->
    <!-- idols 배열을 돌면서 idol이라는 이름으로 객체 하나씩 접근 -->
  </div>
</template>

<script>
import CheckboxItem from './components/CheckboxItem2.vue';
export default {
  name: 'App',
  data() {
    return {
      // idols를 객체배열로 만들어줌
      // props 부분에서 checkde의 기본값을 false로 정해줬기 때문에 생략 가능
      idols: [
        {
          id: 1,
          name: 'NEW JEANS',
          checked: true,
        },
        { id: 2, name: 'BTS', checked: false },
        {
          id: 3,
          name: 'Black Pink',
          checked: false,
        },
        { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};
</script>
