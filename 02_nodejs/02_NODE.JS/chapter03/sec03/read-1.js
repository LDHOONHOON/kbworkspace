fs = require('fs');
// 기본 리턴 값은 Buffer 객체기 때문에 인코딩을 해야 제대로 볼 수 있다

const data = fs.readFileSync(
  './02_NODE.JS/chapter03/sec03/example.txt'
); //   인코딩 지정
console.log(data);
