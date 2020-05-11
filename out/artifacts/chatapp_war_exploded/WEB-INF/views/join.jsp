<%--
  Created by IntelliJ IDEA.
  User: yewon
  Date: 2020-05-08
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>join</title>
</head>
<body>
    <div id="title_join">
        회원가입
    </div>
    <div id="form_join">
        <form method="post" name="function_login" action="/join">
            <input type="text" id="userId" name="userId" placeholder="ID" autofocus /><br>
            <input type="password" id="userPassword" name="userPassword" placeholder="PW"><br>
            <input type="text" id="userName" name="userName" placeholder="이름"><br>

            <button type="submit" id="button" name="button">회원가입</button>
        </form>
    </div>

</body>
</html>
