<template>
  <!-- 가운데 정렬을 위해 부트스트랩의 container 클래스 삽입 -->
  <div id="app" class="container">
    <!-- 타이틀 부분 부트스트랩으로 추카 -->
    <div class="card card-body bg-light">
      <div class="title">:: TodoList App</div>
    </div>
    <div
      class="card card-default card-borderless"
    >
      <div class="card-body">
        <InputTodo />
        <TodoList />
      </div>
    </div>
  </div>
</template>

<script>
import TodoList from './components/TodoList.vue';
import InputTodo from './components/InputTodo.vue';

let ts = new Date().getTime(); //ts 변수 정의 아니면 ts를 Date.now()로 변경

export default {
  name: 'App',
  // improt와 짝꿍! 컴포넌트로 등록해줘야 함
  components: { InputTodo, TodoList }, //지역 컴포넌트
  data() {
    return {
      todolist: [
        {
          id: ts,
          todo: '자전거 타기',
          completed: false,
        },
        {
          id: ts + 1,
          todo: '운동하기',
          completed: true,
        },
        {
          id: ts + 2,
          todo: '밥먹기',
          completed: false,
        },
        {
          id: ts + 3,
          todo: '책읽기',
          completed: false,
        },
      ],
    };
  },
  methods: {
    addTodo(todo) {
      // todo로 받아온 문자열의 길이가 2 이상일 경우에만 todoList 맨 끝에 추가
      // push : 리스트의 맨 끝에 요소 추가
      if (todo.length >= 2) {
        this.todoList.push({
          id: new Date().getTime(),
          todo: todo,
          completed: false,
        });
      }
    },
    deleteTodo(id) {
      // todoList 돌면서 받아온 id와 꺼내온 아이템의 id가 같을 때 해당 인덱스 반환
      // findIndex : 해당 조건과 만족하는 아이템의 인덱스 반환
      let index = this.todoList.findIndex(
        (item) => id === item.id
      );
      // splice : index 자리에 있는 1개 삭제 (세번째 인지부터 추가)
      this.todoList.splice(index, 1);
    },
    toggleCompleted(id) {
      let index = this.todoList.findIndex(
        (item) => id === item.id
      );
      // true일 땐 false, false일땐 true, 무조건 반대값이 들어가도록 : 붙여줌
      // 토글이란 껐다켰다 하는 기능
      this.todoList[index].completed =
        !this.todoList[index].completed;
    },
  },
};
</script>
