<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 8. 1.
  Time: 오전 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>새 Todo 생성</title>
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
        }
        header h1 {
            font-size: 2.5rem;
            margin-bottom: 1rem;
            color: #444;
        }
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        label {
            font-weight: bold;
            margin-top: 1rem;
            margin-bottom: 0.5rem;
            color: #444;
        }
        input[type="text"], textarea {
            width: 100%;
            max-width: 400px;
            padding: 0.75rem;
            margin-bottom: 1rem;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.1);
            font-size: 1rem;
            color: #333;
        }
        input[type="submit"] {
            padding: 0.75rem 1.5rem;
            color: #fff;
            background-color: #ff7e5f;
            border: none;
            border-radius: 50px;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.3s;
            font-weight: bold;
        }
        input[type="submit"]:hover {
            background-color: #eb5757;
            transform: translateY(-3px);
        }
    </style>
</head>
<body>
<div class="container">
    <header>
        <h1>새 Todo 생성</h1>
    </header>
    <main>
        <form method="post">
            <label for="title">제목 :</label>
            <input type="text" id="title" name="title">
            <label for="content">내용 :</label>
            <textarea id="content" name="content" cols="30" rows="10"></textarea>
            <input type="submit" value="생성">
        </form>
    </main>
</div>
</body>
</html>
