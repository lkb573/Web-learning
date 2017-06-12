<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-12
  Time: 오후 2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>친구 주소록 등록</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
</head>
<body>

    <h1>test</h1>

    <div class="container">
        <form action="/amigo/regist" method="post">
            <label class="col-2">Name</label>
            <div class="col-10">
                <input type="text" name="name">
            </div>
            <%--<p>친구 이름 <input type="text" name="name"></p>--%>

            <br><label class="col-2">PhoneNum</label>
            <div class="col-10">
                <input type="text" name="phoneNum">
            </div>
            <%--<p>Phone <input type="text" name="phoneNum"></p>--%>

            <br><label class="col-2">E-Mail</label>
            <div class="col-10">
                <input type="text" name="eMail">
            </div>
            <%--<p>E-Mail  <input type="text" name="eMail"></p>--%>

            <br>
            <p><input type="submit" value="등록!" class="btn btn-lg btn-success"></input></p>


        </form>
    </div>

</body>
</html>
