// 비동기 방식 : 순서대로가 아닌 급한 순으로 처리해준다
function displayA() {
  console.log('A');
}

// 콜백함수를 이용하면 원하는대로 순서를 보장할 수 있다
// 하지만 콜백함수를 계속 쓰면 콜백지옥에 도착한다..
// => 그래서 등장한 것이 Promis , async/await
function displayB(callback) {
  setTimeout(() => {
    console.log('B');
    callback();
  }, 2000);
}

function displayC() {
  console.log('C');
}

displayA();
displayB(displayC);
