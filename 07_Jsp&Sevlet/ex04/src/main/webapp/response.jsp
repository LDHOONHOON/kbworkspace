<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 7. 30.
  Time: 오후 4:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--response.jsp를 바로 띄우면 request를 제대로 받아오지 못하기 때문에 null로 표시된다--%>
    username 값: <%=request.getAttribute("username") %><br>
    useraddress 값: <%=request.getAttribute("useraddress") %><br>
</body>
</html>
