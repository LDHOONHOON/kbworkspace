let likepizza = false;
const pizza = new Promise((resolve, reject) => {
  // if(likepizza === true) 와 동일한 코드
  //   resolve : 작업이 성공했을 때 실행되는 함수
  if (likepizza) resolve('파자를 주문합니다.');
  //   reject : 작업이 실패했을 때 실행되는 함수
  else reject('피자를 주문하지 않습니다.');
});

pizza
  // then : 작업이 성공했을 때 실행되는 코드(resolve 값을 받아옴)
  .then((result) => console.log(result))
  //   catch : 작업이 실패했을 때 실행되는 코드(reject 값을 받아옴)
  .catch((err) => console.log(err))
  //   finally : 실패하든 성공하든 실행되는 코드
  .finally(() => console.log());
