<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>메인화면</title>
</head>
<body>

    <h1>메인화면 확인 창</h1>

    <c:forEach var="post" items="${list}">
        <ul>
            <li>번호 - ${post.post_seq}</li>
            <li>제목 -
                <a href="/post/${post.memberId}">${post.title}</a>
                (${post.write_date})
            </li>
                        </ul>
    </c:forEach>

    <a href="/post/write">글 작성</a>

</body>
</html>
