
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>어떤 친구?</title>
</head>
<body>

    <h1>${name} 를(을) 확인!</h1>

    <ul>
        <li>${amigo.name}</li>
        <li>${amigo.phoneNum}</li>
        <li>${amigo.eMail}</li>
    </ul>

    <a href="/amigo">초기화면</a>
    <a href="/amigo/regist">글쓰기</a>

</body>
</html>
