<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-16
  Time: 오후 3:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>글 쓰기라는 공간</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">

</head>
<body>

    <div class="container">
        <div class="header clearfix">
            <nav>
                <ul class="nav nav-pills pull-right">
                    <li role="presentation" class="active"><a href="#">Home</a></li>
                    <li role="presentation"><a href="#">About</a></li>
                    <li role="presentation"><a href="#">Contact</a></li>
                </ul>
            </nav>
            <h3 class="text-muted">글을 쓴다 이곳에서</h3>
        </div>

        <div class="jumbotron">
            <form action="/post/write" method="post">
                <p>글 제목  <input type="text" name="title"></p>
                <p>글 내용  <input type="text" name="content"></p>
                <p>글 작성자  <input type="text" name="memberId"></p>

                <p><input type="submit" value="글을 쓰고 포인트를 얻자" class="btn btn-lg btn-success"></input></p>
            </form>
        </div>

        <footer class="footer">
            <p>2017 Learning Spring</p>
        </footer>

    </div> <!-- /container -->

</body>
</html>
