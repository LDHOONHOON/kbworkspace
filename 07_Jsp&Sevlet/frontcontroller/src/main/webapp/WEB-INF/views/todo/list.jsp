<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 1.
  Time: 오전 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todo 목록 보기</title>
    <style>
        body {
            font-family: 'Helvetica Neue', Arial, sans-serif;
            background: linear-gradient(to right, #ffecd2 0%, #fcb69f 100%);
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
            padding: 2rem 3rem;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 600px;
            width: 100%;
        }
        header h1 {
            font-size: 2.5rem;
            margin-bottom: 1rem;
            color: #444;
        }
        .todo-list {
            margin-bottom: 2rem;
            font-size: 1.2rem;
            text-align: left;
        }
        .todo-list ul {
            list-style-type: none;
            padding: 0;
        }
        .todo-list li {
            background-color: #f7f7f7;
            margin: 0.5rem 0;
            padding: 0.75rem;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .buttons a {
            display: inline-block;
            margin: 0.5rem;
            padding: 0.75rem 1.5rem;
            color: #fff;
            background-color: #ff7e5f;
            text-decoration: none;
            border-radius: 50px;
            transition: background-color 0.3s, transform 0.3s;
            font-weight: bold;
        }
        .buttons a:hover {
            background-color: #eb5757;
            transform: translateY(-3px);
        }
    </style>
</head>
<body>
<div class="container">
    <header>
        <h1>Todo 목록 보기</h1>
    </header>
    <main class="todo-list">
        <ul>
            <c:forEach var="todo" items="${todoList}">
                <li>${todo}</li>
            </c:forEach>
        </ul>
    </main>
    <div class="buttons">
        <a href="view">상세보기</a>
        <a href="create">새 Todo</a>
    </div>
</div>
</body>
</html>
