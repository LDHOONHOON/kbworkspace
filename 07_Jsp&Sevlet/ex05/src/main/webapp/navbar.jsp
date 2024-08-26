<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 7. 31.
  Time: 오후 5:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<hr>
<%-- 세션 쪽에 user 정보 넣어줘야 user 값 받아오기가 가능 --%>
<%-- user 값이 null이면 로그인, 회원가입, 화면 보여주기 --%>
<c:if test="${empty user}">
    <a href="/login_form.jsp">로그인</a> | <a href="#">회원가입</a>
</c:if>
<%-- user 값이 null이 아니면 user 이름, 로그아웃 화면 보여주기 --%>
<c:if test="${!empty user}">
    ${user.name} | <a href="/logout">로그아웃</a>
</c:if>

<%--c:if - test에 있는 조건이 true일 경우 해당 요소가 보여진다--%>
<%--권한이 관리자인 경우--%>
<c:if test="${role == 'ADMIN'}">관리자</c:if>
<%--권한이 관리자가 아닌 경우--%>
<c:if test="${role != 'ADMIN'}">일반회원</c:if>
<hr>
</body>
</html>
