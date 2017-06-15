<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 4:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>${article.aid} 번 글을 확인!</h1>

    <ul>
        <li>${article.aid}</li>
        <li>${article.title}</li>
        <li>${article.author}</li>
        <li>${article.content}</li>
    </ul>

    <a href="/bbs">초기화면</a>
    <a href="/bbs/write">글쓰기</a>

</body>
</html>
