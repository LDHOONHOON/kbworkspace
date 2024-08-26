<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 1.
  Time: 오전 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo 수정</title>
    <style>
        body {
            font-family: 'Helvetica Neue', Arial, sans-serif;
            background: linear-gradient(to right, #e2e2e2 0%, #ffffff 100%);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        .container {
            background-color: #fff;
            padding: 2rem;
            border-radius: 12px;
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.1);
            text-align: center;
            width: 100%;
            max-width: 500px;
        }
        h1 {
            font-size: 2.2rem;
            margin-bottom: 1.5rem;
            color: #222;
        }
        form {
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
        }
        input[type="submit"] {
            padding: 0.75rem 1.5rem;
            color: #fff;
            background-color: #dc3545;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.3s;
            font-weight: bold;
        }
        input[type="submit"]:hover {
            background-color: #c82333;
            transform: translateY(-3px);
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Todo 수정</h1>
    <form method="post">
        <input type="submit" value="수정 완료">
    </form>
</div>
</body>
</html>
