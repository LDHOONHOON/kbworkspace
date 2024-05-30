<template>
  <div>
    <NoSlotTest />
    <SlotTest />
    <NamedSlotTest />
    <ScopedSlotTest />
  </div>
</template>
<script>
import ScopedSlotTest from './components/ScopedSlotTest.vue';
export default {
  name: 'App',
  components: {
    ScopedSlotTest,
  },
};
</script>
