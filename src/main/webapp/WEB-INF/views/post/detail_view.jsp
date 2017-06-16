<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 5:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>글 자세히 보기</title>
</head>
<body>
    <h1>${post.memberId}의 글을 확인!</h1>

    <ul>
        <li>${post.post_seq}</li>
        <li>${post.title}</li>
        <li>${post.content}</li>
        <li>${post.write_date}</li>
        <li>${post.memberId}</li>
    </ul>

    <a href="/post">초기화면</a>
    <a href="/post/write">글쓰기</a>
</body>
</html>
