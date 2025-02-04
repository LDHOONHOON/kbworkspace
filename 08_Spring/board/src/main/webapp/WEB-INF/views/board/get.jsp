<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 12.
  Time: 오전 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<%@include file="../layouts/header.jsp"%>

<h1 class="page-header my-4"><i class="far fa-file-alt"></i> ${board.title}</h1>

<div class="d-flex justify-content-between">
    <div><i class="fas fa-user"></i> ${board.writer}</div>
    <div>
        <i class="fas fa-clock"></i>
        <fmt:formatDate pattern="yyyy-MM-dd" value="${board.regDate}"/>
    </div>
</div>

<div class="text-end">
    <c:forEach var="file" items="${board.attaches}">
        <div class="attach-file-item">
<%--            //board/download/${file.no} -> 파일 다운로드 링크--%>
            <a href="/board/download/${file.no}" class="file-link">
                <i class="fa-solid fa-floppy-disk"></i>
                    ${file.filename} (${file.fileSize})<br>
            </a>
        </div>
    </c:forEach>
</div>

<hr>

<div>
    ${board.content}
</div>

<div class="mt-4">
    <a href="list" class="btn btn-primary"><i class="fas fa-list"></i> 목록</a>
    <a href="update?no=${board.no}" class="btn btn-primary"><i class="far fa-edit"></i> 수정</a>
    <a href="#" class="btn btn-primary delete"><i class="fas fa-trash-alt"></i> 삭제</a>
</div>

<%--    눈에 보이지는 않지만 post 메소드를 호출하는 용도로 사용된다--%>
<form action="delete" method="post" id="deleteForm">
    <input type="hidden" name="no" value="${board.no}"/>
</form>

<%--삭제 버튼과 form을 연결시켜주는 역할--%>
<script src="/resources/js/board.js"></script>

<%@include file="../layouts/footer.jsp"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
