// let getTringle = function (base, heigt) {
//   return (base * heigt) / 2;
// };

let getTringle = (base, heigt) =>
  (base * heigt) / 2;

// 객체 return 시에는 소괄호로 한번더 감싸준다
// (구현부와 차이점을 두기 위해)
let Object = () => ({
  이름: 'donghun',
});

console.log(
  `삼각형의 면적 : ${getTringle(5, 2)}`
);
