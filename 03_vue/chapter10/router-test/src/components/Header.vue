<template>
  <nav
    class="navbar navbar-expand-md bg-dark navbar-dark mt-2"
  >
    <span class="navbar-brand">(classD)</span>
    <!-- 버튼 클릭시 changeIsNavShow 함수 호출 -->
    <button
      class="navbar-toggler"
      type="button"
      @click="changeIsNavShow"
    >
      <span class="navbar-toggler-icon"></span>
    </button>

    <!-- navClass 데이터 내에 있는 클래스 이름 바인딩 -->
    <div :class="navClass">
      <ul class="navbar-nav">
        <!-- 메뉴에 4개의 링크 생성 -->
        <li class="nav-item">
          <router-link class="nam-link" to="/"
            >홈</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nam-link" to="/"
            >소개</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nam-link" to="/"
            >멤버</router-link
          >
        </li>
        <li class="nav-item">
          <router-link class="nam-link" to="/"
            >영상</router-link
          >
        </li>
      </ul>
    </div>
  </nav>
</template>

<script>
import { reactive, computed } from 'vue';

export default {
  setup() {
    const state = reactive({ isNavShow: false });

    // navClass에 state의 isNavShow가 true면 앞의 클래스명을 넣고, false면 뒤의 클래스 명을 넣는다
    const navClass = computed(() =>
      state.isNavShow
        ? 'collapse navbar-collapse show'
        : 'collapse navbar-collapse'
    );

    // 버튼 클릭시 state의 isNavShow를 반대로 바꿔줌 (true-> false, false-> true)
    const changeIsNavShow = () => {
      state.isNavShow = !state.isNavShow;
    };
    return { state, changeIsNavShow, navClass };
    // script setup 사용시 return 필요없음
  },
};
</script>
