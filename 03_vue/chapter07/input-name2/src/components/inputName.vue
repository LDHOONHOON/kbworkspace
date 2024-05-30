<template>
  <div
    style="border: solid 1x gray; padding: 5px"
  >
    이름:
    <!-- name 속성을 input과 양방향 바인딩시킴 -->
    <input type="text" v-model="name" />
    <!-- 버튼 클릭시 nameChanged라는 이벤트에 name 값을 객체로 담아서 부모에게 전송 -->
    <button
      @click="$emit('nameChanged', { name })"
    >
      이벤트 발신
    </button>
  </div>
</template>

<script>
export default {
  name: 'InputName',
  // emits: [ 'nameChanged1' ], //nameChanged1이 아닌 이벤트가 발생했으므로 경고창 출력
  emits: {
    nameChanged: (e) => {
      // name이 비어있지 않고, type이 string이며, 앞뒤 공백을 제거하고 길이가 3이상일 경우 true 리턴
      return e.name &&
        typeof e.name === 'string' &&
        e.name.trim().length >= 3
        ? true
        : false;
    },
  },
  data() {
    return { name: '' };
  },
};
</script>
