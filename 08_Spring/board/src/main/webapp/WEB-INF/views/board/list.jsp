<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 12.
  Time: 오전 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ include file="../layouts/header.jsp" %>

<h1 class="page-header my-4"><i class="fas fa-list"></i> 글 목록</h1>

<table class="table table-hover">
    <thead>
    <tr>
        <th style="width: 60px">No</th>
        <th>제목</th>
        <th style="width: 100px">작성자</th>
        <th style="width: 130px">등록일</th>
    </tr>
    </thead>

    <tbody>
<%--    service의 getlist 호출 -> mapper의 getlist 호출 -> 테이블 전체의 리스트로 조회--%>
    <c:forEach var="board" items="${list}">
        <tr>
<%--            속성을 가져올때는 getter로 접근--%>

            <td>${board.no}</td>
<%--    쿼리 스트링으로 no값이 들어가도록 링크 설정--%>
            <td><a href="get?no=${board.no}">${board.title}</a></td>
            <td>${board.writer}</td>
<%--    원하는 형식으로 날짜를 출력하기 위해 fmt 사용--%>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regDate}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<%-- 개별 페이지 --%>
<%--<h1>목록 보기</h1>--%>

<div class="text-right">
    <a href="create" class="btn btn-primary">
        <i class="far fa-edit"></i>
        글쓰기
    </a>
</div>

<%@ include file="../layouts/footer.jsp" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
