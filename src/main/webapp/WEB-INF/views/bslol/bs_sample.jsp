
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">


    <title>Dashboard Template for Bootstrap</title>

    <link href="/asset/css/bootstrap.css" rel="stylesheet">

    <link href="/asset/css/dashboard.css" rel="stylesheet">


</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">BS_LOL Page!!!</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">LEE KB</a></li>
                <li><a href="#">LEE JS</a></li>
                <li><a href="#">RYU KR</a></li>
                <li><a href="#">JIN HY</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="#">Prototype Project<span class="sr-only">(current)</span></a></li>
                <li><a href="#">TEST</a></li>
                <li><a href="#">CHECK</a></li>
                <li><a href="#">DATA</a></li>
            </ul>
            <%--<ul class="nav nav-sidebar">
                <li><a href="">Nav item</a></li>
                <li><a href="">Nav item again</a></li>
                <li><a href="">One more nav</a></li>
                <li><a href="">Another nav item</a></li>
                <li><a href="">More navigation</a></li>
            </ul>
            <ul class="nav nav-sidebar">
                <li><a href="">Nav item again</a></li>
                <li><a href="">One more nav</a></li>
                <li><a href="">Another nav item</a></li>
            </ul>--%>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h1 class="page-header">Site Ling</h1>

            <div class="row placeholders">
                <div class="col-xs-6 col-sm-3 placeholder">
                    <a href="http://www.op.gg"><img src="http://cfile28.uf.tistory.com/image/21532A4054E59FA914EE66"
                         width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">

                        <h4>전적 검색</h4></a>

                    <span class="text-muted">Something else</span>
                </div>

                <div class="col-xs-6 col-sm-3 placeholder">
                    <a href="http://lol.inven.co.kr"><img src="http://cfile22.uf.tistory.com/image/216DB03F54E59E45152D08"
                         width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
                        <h4>롤 인벤</h4></a>
                    <span class="text-muted">Something else</span>
                </div>

                <div class="col-xs-6 col-sm-3 placeholder">
                    <a href="http://fow.kr"><img src="http://cfile22.uf.tistory.com/image/2717A64454E59EF6186D71"
                         width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
                        <h4>한국형 전적 검색</h4></a>
                    <span class="text-muted">Something else</span>
                </div>

                <div class="col-xs-6 col-sm-3 placeholder">
                    <a href="http://kr.leagueoflegends.com"><img src="http://cfile25.uf.tistory.com/image/21014B3654E59D6B266330"
                         width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
                        <h4>리그오브레전드</h4></a>
                    <span class="text-muted">Something else</span>
                </div>
            </div>



            <a <%--class="sub-header"--%> href="bslol/bs-write">Section title</a>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>글 번호</th>
                        <th>글 제목</th>
                        <th>작성자</th>
                        <th>조회수</th>

                    </tr>
                    </thead>
                    <tbody>

                    <%--<c:forEach var="bslol" items="${list}">
                        <tr>
                            <td>  ${bslol.bsnum}</td>
                            <td>  ${bslol.bstitle} </td>
                            <td>  ${bslol.bswriter} </td>
                            <td>  ${bslol.bsclick} </td>
                        </tr>
                    </c:forEach>--%>






                    <%--<tr>
                        <td>1</td>
                        <td href="/bslol/bs-read">1번제목</td>
                        <td>1번작성자</td>
                        <td>100</td>

                    </tr>
                    <tr>
                        <td>2</td>
                        <td>2번제목</td>
                        <td>2번작성자</td>
                        <td>200</td>

                    </tr>--%>

                    </tbody>
                </table>
            </div>

        </div>
    </div>
</div>


<script src="/asset/js/jquery-3.2.1.js"></script>
<script src="/asset/js/bootstrap.js"></script>
<script src="/assets/js/holder.js"></script>

</body>
</html>
