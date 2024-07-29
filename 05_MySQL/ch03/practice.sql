-- 데이터 읽어오기 
SELECT * FROM tbl;
-- 데이터의 일부만 읽기
SELECT 컬럼명 from 테이블명;
-- 데이터 삽입
INSERT into 테이블명 (컬럼1, 컬럼2) values ('넣을 내용1', '넣을 내용2');
-- 데이터 수정
UPDATE 테이블명 set 컬럼명 = '바꿀내용' WHERE 컬럼명 = '원래 내용'
-- 데이터 삭제
DELETE FROM 테이블명;
DROP table IF EXISTS 테이블명; -- >혹시나 있으면 삭제  
-- 테이블 생성 
CREATE table 테이블명 -- (컬럼명, 타입, 추가적으로 PK나 NULL, NOT NULL)
-- 조인
SELECT 별칭.컬럼명 from 테이블명 별칭 join 테이블명 별칭 on 별칭.컬럼명 = 별칭.컬럼
-- 외래키 제거 
ALTER TABLE 테이블명 DROP FOREIGN KEY 외래키명;

