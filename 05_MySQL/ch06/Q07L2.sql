-- USE : 기본 데이터베이스 설정
USE sqldb;
-- CREATE TABLE : 테이블 생성
CREATE TABLE stdtbl (
stdName VARCHAR(10) NOT NULL PRIMARY KEY, 
addr CHAR(4) NOT NULL 
);
-- NOT NULL : NULL값이 될 수 없다
-- PRIMARY KEY : 기본키(식별자), 중복되지않고 NULL이 될 수 없다.
CREATE TABLE clubtbl (
clubName VARCHAR(10) NOT NULL PRIMARY KEY, 
roomNo CHAR(4) NOT NULL
);

CREATE TABLE stdclubtbl(
num int AUTO_INCREMENT NOT NULL PRIMARY KEY,
stdName VARCHAR(10) NOT NULL,
clubName VARCHAR(10) NOT NULL,
FOREIGN KEY(stdName) REFERENCES stdtbl(stdName),
FOREIGN KEY(clubName) REFERENCES clubtbl(clubName)
);

-- INSERT INTO 테이블명 VALUES 실제 값들 : 테이블의 컬럼들에 실제 값들을 추가함 (행추가)
INSERT INTO stdtbl VALUES ('김범수', '경남'), ('성시경','서울'), ('조용필', '경기'), ('은지원', '경북'), ('바비킴','서울');
INSERT INTO clubtbl VALUES ('수영', '101호'), ('바둑','102호'), ('축구','103호'), ('봉사','104호');
INSERT INTO stdclubtbl
VALUES (NULL, '김범수','바둑'), (NULL, '김범수', '축구'), (NULL,'조용필', '축구'), (NULL, '은지원', '축구'), (NULL, '은지원', '봉사'), (NULL, '바비킴', '봉사');

-- 학생 테이블, 동아리 테이블, 학생 동아리 테이블을 이용해서 학생기준으로 학생 이름/지역/가입한 동아리/동아리방을 출력하세요
SELECT s.stdName, s.addr, sc.clubName, c.roomNo
FROM stdtbl s INNER JOIN stdclubtbl sc
ON s.stdName = sc.stdName
INNER JOIN clubtbl c 
ON c.clubName = sc.clubName
ORDER BY s.stdName;