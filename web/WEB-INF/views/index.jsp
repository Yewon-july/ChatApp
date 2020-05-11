<%--
  Created by IntelliJ IDEA.
  User: yewon
  Date: 2020-05-06
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Yewon-Talk</title>
  </head>
  <body>
    <div id="title_login">
      로그인
    </div>
    <div id="form_login">
      <form method="post" name="function_login" action="/login">
        <input type="text" id="userId" name="userId" placeholder="ID" autofocus /><br>
        <input type="password" id="userPassword" name="userPassword" placeholder="PW"><br>
        <button type="submit" id="button" name="button">로그인</button>
      </form>
      <form method="get", action="/join">
        <button type="submit" id="join-button" name="join-button">회원가입</button>
      </form>
    </div>
  </body>
</html>
