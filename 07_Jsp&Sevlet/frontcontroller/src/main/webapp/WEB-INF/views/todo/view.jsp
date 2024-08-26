<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 1.
  Time: 오전 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo 보기</title>
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
        .actions {
            margin-bottom: 2rem;
            font-size: 1.2rem;
        }
        .actions a {
            display: inline-block;
            margin: 0 0.5rem;
            padding: 0.75rem 1.5rem;
            color: #fff;
            background-color: #007bff;
            text-decoration: none;
            border-radius: 8px;
            transition: background-color 0.3s, transform 0.3s;
            font-weight: bold;
        }
        .actions a:hover {
            background-color: #0056b3;
            transform: translateY(-3px);
        }
        form {
            margin-top: 1rem;
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
    <h1>Todo 보기</h1>
    <div class="actions">
        <a href="list">목록보기</a>
        <a href="update">수정하기</a>
    </div>
    <form action="delete" method="POST">
        <input type="submit" value="삭제">
    </form>
</div>
</body>
</html>
