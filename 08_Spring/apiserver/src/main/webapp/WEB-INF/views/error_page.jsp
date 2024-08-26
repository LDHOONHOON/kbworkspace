<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-06
  Time: 오후 3:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--모델에서 받아온 exception의 메시지를 출력--%>
<h4><c:out value="${exception.getMessage()}"></c:out></h4>

<ul>
    <%--exception의 stacktrace를 돌면서 stack이란 이름으로 가져와서 하나씩 출력한다--%>
    <c:forEach items="${exception.getStackTrace() }" var="stack">
        <li><c:out value="${stack}"></c:out></li>
    </c:forEach>
</ul>
</body>
</html>
