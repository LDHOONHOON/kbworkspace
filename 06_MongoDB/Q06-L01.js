//다음 형태의 문서 20,000 건을 추가하세요
use test;
for(let i = 0; i < 20000; i++){
    db.product.insert({
       num:i,
       name: '스마트'+i,
       })
}

//product 컬렉션의 전체 문자수를 출력하세요
db.product.count()

//product 컬렉션의 문서를 num의 내림 차순으로 정렬하여 출력하세요.
//sort로 문서를 정렬 가능 (mysql : order by)
// sort({키값 : 오름차순(1)/내림차순(-1)})
db.numbers.find().sort({'num' : -1})

//product 컬렉션의 문서를 num의 내림 차순으로 정렬하여 상위 10건을 출력하세요.
//limit : 데이터를 원하는 갯수만큼만 출력해준
//limit(출력할 데이터 갯수)
db.product.find().sort({'nem' : -1}).limit(10)       

//product 컬렉션의 문서를 num의 내림 차순으로 정렬한 상태에서 다음을 처리하세요.
//메소드 체이닝의 순서는 중요하지 않다
//skip : 건너뛸 데이터의 개수, 페이징에 주료 사용
//skip 할 페이지 공식 (페이지 쪽수 -1)* 한페이지에 보여줄데이터 개
db.product.find().sort({'nem' : -1}).limit(10).skip((page_number -1)*12)

//product 컬렉션에서 num이 15미만 이거나 19995 초과인 것을 출력하세요.
//$or : 배열 중 하나라도 True라면 일치
db.product.find({$or:[
    {num:{$lt:15}},
    {num:{$gt:19995}}
    ]
    })
//product 컬렉션에서 name이 '스마트폰10', '스마트폰100','스마트폰1000'중에 하나이면 출력하세요.
//$in : 어떤 인수든 하나라도 해당 배열에 있으면 검색
db.product.find({name:
{$in:['스마트폰10','스마트폰100','스마트폰1000']}
})

//product 컬렉션에서 num이 5보다 작은 문서를 출력하는데, name만 출력하세요.(id 출력하면 안됨
//해당 컬럼에 0을 주면 해당 데이터 숨기기,1을 주면 해당 데이터 보이
//find({조건문서}, {프로젝트 문서})
db.product.find({num:{$lt:5}},{_id:0,name:1})

