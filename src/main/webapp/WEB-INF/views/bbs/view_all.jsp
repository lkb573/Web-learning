
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>bbs</title>

    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">--%>

    <link rel="stylesheet" href="/client/css/bootstrap.css">
    <%--<link rel="stylesheet" href="/asset/css/main.css"/>--%>


</head>
<body>

    <h1>view all pages.</h1>

    <c:forEach var="article" items="${list}">
        <ul>
            <li>번호 - ${article.aid}</li>
            <li>제목 -
                <a href="/bbs/${article.aid}">${article.title}</a>
                (${article.author})
            </li>
            <%--<li>ID - ${article.author}</li>
            <li>내용 - ${article.content}</li>--%>
        </ul>
    </c:forEach>

    <a href="/bbs/write">글 작성~~~</a>

    <script src="/client/js/jquery-3.2.1.js"></script>
    <script src="/client/js/bootstrap.js"></script>

</body>
</html>
