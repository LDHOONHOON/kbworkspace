<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 6.
  Time: 오전 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http
          -equiv="Content
-Type" content="text/html; charset=UTF
-8" />
    <title>Insert title here</title>
</head>
<body>
<%--파일 업로드를 위해 enctype 설정 필수--%>
<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data">
    <div>
<%--        해당 input의 name이 받아주는 메소드의 매개변수로 연결된다--%>

        <input type="file" name="files" />
    </div>
    <div>
        <input type="file" name="files" />
    </div>
    <div>
        <input type="file" name="files" />
    </div>
    <div>
        <input type="file" name="files" />
    </div>
    <div>
        <input type="file" name="files" />
    </div>
    <div>
        <input type="submit" />
    </div>
</form>
</body>
</html>
