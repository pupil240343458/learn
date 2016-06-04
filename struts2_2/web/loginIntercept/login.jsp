<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/5/28
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/loginIntercept/loginAction.action" method="post">
    name:<input type="text" name="user.name" width="20px">
    passWord:<input type="password" name="user.passWord" width="20px">
    <input type="submit" value="submit">
</form>
</body>
</html>
