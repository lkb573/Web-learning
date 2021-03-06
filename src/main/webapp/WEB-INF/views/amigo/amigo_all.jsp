
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Amigo All</title>
</head>
<body>

    <h1>Amigo View All</h1>

    <c:forEach var="amigo" items="${list}">
        <ul>
            <li>이름 - ${amigo.name}</li>
            <li>번호 -
                <a href="/amigo/${amigo.name}">${amigo.phoneNum}</a>
                (${amigo.eMail})
            </li>
            <li>EMail - ${amigo.eMail}</li>
        </ul>
    </c:forEach>

    <a href="/amigo/regist">친구 확인!</a>

    <script src="/client/js/jquery-3.2.1.js"></script>
    <script src="/client/js/bootstrap.js"></script>

</body>
</html>
