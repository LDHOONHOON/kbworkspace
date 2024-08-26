<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 1.
  Time: 오전 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>404 - 페이지를 찾을 수 없습니다</title>
    <style>
        body {
            font-family: 'Helvetica Neue', Arial, sans-serif;
            background: linear-gradient(to right, #f8f9fa 0%, #e9ecef 100%);
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        .container {
            text-align: center;
            background-color: #fff;
            padding: 2rem 3rem;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            max-width: 600px;
            width: 100%;
        }
        h1 {
            font-size: 5rem;
            margin: 0;
            color: #dc3545;
        }
        h3 {
            font-size: 1.5rem;
            color: #495057;
        }
        .back-link {
            display: inline-block;
            margin-top: 1rem;
            padding: 0.75rem 1.5rem;
            color: #fff;
            background-color: #007bff;
            text-decoration: none;
            border-radius: 50px;
            transition: background-color 0.3s, transform 0.3s;
            font-weight: bold;
        }
        .back-link:hover {
            background-color: #0056b3;
            transform: translateY(-3px);
        }
    </style>
</head>
<body>
<div class="container">
    <h1>404</h1>
    <h3>요청하신 페이지가 존재하지 않습니다</h3>
    <a href="/" class="back-link">홈으로 돌아가기</a>
</div>
</body>
</html>
