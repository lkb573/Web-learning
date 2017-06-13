<%--
  Created by IntelliJ IDEA.
  User: danawacomputer
  Date: 2017-06-13
  Time: 오후 4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>bs_wirte</title>
</head>
<body>

    <h1>작성하는곳</h1>

    <table>
        <caption>글 작성하기</caption>
        <tr>
            <td>글 번호</td>
            <td><input type=text name=name size=10 maxlength=8></td>
        </tr>
        <tr>
            <td>글 제목</td>
            <td><input type=text name=email size=30></td>
        </tr>
        <tr>
            <td>글 작성자</td>
            <td><input type=text name=homepage size=30></td>
        </tr>
        <tr>
            <td>첨부파일</td>
            <td><input type=text name=title></td>
        </tr>
        <tr>
            <td>글 내용</td>
            <td><textarea name=content rows ="10" cols="100"></textarea></td>
        </tr>
        <tr>
            <td>추가내용</td>
            <td><input type=password name=password size=15 maxlength=15></td>
        </tr>
        <tr>
            <td colspan=2><hr size=1></td>
        </tr>
        <tr>
            <td colspan="2">
                <div align="center">
                    <form action="/bslol">
                        <input type="submit" value="수정 완료"><%--&nbsp;&nbsp;--%>
                        <input type="submit" value="뒤로">
                    </form>
                </div>
            </td>
        </tr>
    </table>


    <%--<a href="/bslol">최초화면</a>--%>

</body>
</html>
