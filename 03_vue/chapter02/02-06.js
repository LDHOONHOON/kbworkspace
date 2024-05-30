function foodReport(
  name,
  age = '16',
  ...favoriteFoods
) //   파라미터 순서 : 일반 파라미터 > 디폴트 파라미터 >
{
  console.log(name + ',' + age);
  console.log(favoriteFoods);
}

foodReport(
  '이몽룡',
  20,
  '짜장면',
  '냉면',
  '불고기'
);
foodReport('홍길동', 16, '초밥');
