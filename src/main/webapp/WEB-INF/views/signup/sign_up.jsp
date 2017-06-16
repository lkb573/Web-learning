
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>가입 한다</title>

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
            <form action="/sign/up_id" method="post">
                <p>ID 입력  <input type="text" name="userId"></p>
                <p>PW 입력  <input type="text" name="password"></p>
                <p>Email  <input type="text" name="email"></p>

                <p><input type="submit" value="글을 쓰고 포인트를 얻자" class="btn btn-lg btn-success"></input></p>
            </form>
        </div>

        <footer class="footer">
            <p>2017 Learning Spring</p>
        </footer>

    </div> <!-- /container -->

</body>
</html>
