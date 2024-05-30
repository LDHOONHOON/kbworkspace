// 값 두개를 받아올 때는 객체 구조 분해 할당을 통해 받아온다
const { user1, user2 } = require('./users-1'); // users-1.js에서 가져오기
const hello = require('./hello'); // hello.js에서 가져오기

hello(user1);
hello(user2);
