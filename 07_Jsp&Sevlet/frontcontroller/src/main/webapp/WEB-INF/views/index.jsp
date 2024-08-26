<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP - Hello World</title>
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
        .button {
            display: inline-block;
            margin-top: 1rem;
            padding: 0.75rem 1.5rem;
            color: #fff;
            background-color: #ff7e5f;
            text-decoration: none;
            border-radius: 50px;
            transition: background-color 0.3s, transform 0.3s;
            font-weight: bold;
        }
        .button:hover {
            background-color: #eb5757;
            transform: translateY(-3px);
        }
    </style>
</head>
<body>
<div class="container">
    <header>
        <h1>FrontController</h1>
    </header>
    <main>
        <a class="button" href="/todo/list">Todo 목록보기</a>
    </main>
</div>
</body>
</html>
