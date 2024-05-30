<template>
  <div>
    <!-- 체크박스 변경시 id값과 현재 체크박스의 체크상태값을 check-changed 이벤트에 담아서 부모로 보냄 -->
    <input
      type="checkbox"
      :value="id"
      :checked="checked"
      @change="
        $emit('check-changed', {
          id,
          checked: $event.target.checked,
        })
      "
    />
    <slot>Item</slot>
  </div>
</template>

<script>
export default {
  name: 'CheckBox1',
  props: ['id', 'checked'], // 부모 컴포넌트로부터 받을 속성들
};
</script>
