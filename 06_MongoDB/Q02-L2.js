use tutorial;

// users 컬렉션에 {username: "smith"} 문서를 추가하세요
db.users.insert({username: "smith"})

// 위의 문서를 다음과 같이 되도록 수정하세요
db.users.update({username: "smith"},
{
    $set:{
        favorites:{
            cities:["Chicago","Cheyenne"],
            movies:["Casablanca","For a Few Dollars More", "The Sting"]
        }
    }
})

//users 컬렉션에 {username: "jones"} 문서를 추가하세요
db.users.insert({username:"jones"})

// 위의 문서를 다음과 같이 되도록 수정하세요
db.users.update({username: "jones"},
{
    $set:{
        favorites:{
            favorites:{    
                movies:["Casablanca","Rocky"]
            }
        }
    }
})

// users 컬렉션의 "Casabalnca" 영화를 좋아하는 사용자들을 출력하세요
// favorites.movies : 부모키.자식키, 문자열 표시 필수
// pretty() : 코드를 보기 좋게 들여쓰기 해줌
db.users.find({"favorites.movies":"Casablanca"}).pretty()