<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 7. 29.
  Time: 오후 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
        session.invalidate();
        response.sendRedirect("loginform.html");
        %>
</body>
</html>
