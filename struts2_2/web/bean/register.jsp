<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/5/22
  Time: 0:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
<%--传递的时候注意要添加上bean类的前缀--%>
<form action="register.action" method="post">
    name:<input type="text" name="u.name">
    passWord:<input type="password" name="u.passWord">
    age:<input type="text" name="u.age">
    email:<input type="text" name="u.email"><br>
</form>
</body>
</html>
