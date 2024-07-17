package org.scoula.jdbx_ex.test;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.junit.jupiter.api.*;
import org.scoula.jdbc_ex.common.JDBCUtil;
import java.sql.*;

// 테스트 메소드의 실행 순서를 지정해주는 어노테이션
@TestMethodOrder (MethodOrderer.OrderAnnotation.class)
public class CrudTest {
    // JDBC 연결 객체를 생성하여 초기화
    Connection conn = JDBCUtil.getConnection();

    @AfterAll

    static void tearDown() {
        // 모든 데스트가 완료된 후 JDBC 연결 종료
        JDBCUtil.close();
    }

    @Test
    @DisplayName("새로운 user를 등록한다.")
    @Order(1)
    public void insertUser() throws SQLException {
        String sql = "insert into users (id, password, name, role) values(?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "scoula");
            pstmt.setString(2, "scoula3");
            pstmt.setString(3, "스콜라");
            pstmt.setString(4, "USER");
//            SQL 쿼리 실행 및 삽입된 행의 수를 반환
//            INSERT, UPDATE, DELETE문은 excuteUpdate를 사용하며 return값은 int다
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }

    @Test
    @DisplayName("uesr 목록을 추출한다.")
    @Order(2)
    public void selectUser() throws SQLException {
        // 모든 사용자 정보를 조회하는 SQL 쿼리
        String sql = "select * from users";
        try (Statement stmt = conn.createStatement();
//            SELECT 문은 executeQuency를 사용하면 return값은 테이블이다(ResultSet)
             ResultSet rs = stmt.executeQuery(sql);
//            결과 집합(ResultSet)에서 데이터를 읽어와서 출력
//                next()로 다음 데이터가 있는 체크해서 있을 때까지 while문으로 반복한다
        ) {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        }
    }

    @Test
    @DisplayName("특정 user 검색한다.")
    @Order(3)
    public void selectUserById() throws SQLException {
//        검색할 사용자 ID
        String userid = "scoula";
        //        특정 사용자 정보를 조회하는 SQL 쿼리
        String sql = "select * from users where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            SQL 쿼리의 매개변수 설정
            pstmt.setString(1, userid);
            try (ResultSet rs = pstmt.executeQuery()) {
//                결과 집합(Result Set)에서 해당 데이터를 하나 읽어와서 출력
//                결과가 하나기 때문에 while문이 아니라 if문으로 체크해줌
                if (rs.next()) {
                    System.out.println(rs.getString("name"));
                } else {
//                    사용자가 존재하지 않으면 예외를 발생시킴
                    throw new SQLException("scoula not found");
                }
            }
        }
    }

    @Test
    @DisplayName("특정 user 수정한다.")
    @Order (4)
    public void updateUser() throws SQLException {
//        수정할 사용자 ID
        String userid = "scoula";
//        해당 ID의 사용자 이름을 수정하는 SQL 쿼리
        String sql = "update users set name= ? where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            SQL 쿼리의 매개변수 설정
            pstmt.setString(1, "스콜라 수정");
            pstmt.setString(2, userid);
//            SQL 쿼리 실행 및 수정된 행의 수 반환
            int count = pstmt.executeUpdate();
            Assertions.assertEquals(1, count);
        }
    }
    @Test
    @DisplayName("지정한 사용자를 삭제한다.")
    @Order(5)
    public void deleteUser() throws SQLException {
//        삭제할 사용자 ID
        String userid = "scoula";
//        해당 아이디의 사용자를 삭제하는 SQL 쿼리
        String sql ="delete from users where id = ?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, userid);
            int count = stmt.executeUpdate();
            Assertions.assertEquals (1, count);
        }
    }
}