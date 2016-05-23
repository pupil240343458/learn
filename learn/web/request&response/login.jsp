<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/5/23
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="response.jsp" method="post">
    name:<input type="text" name="username"><br>
    password:<input type="password" name="password"><br>
    music:<input name="类型" type="checkbox" value="music" checked="checked">
    movie:<input name="类型" type="checkbox" value="movie">
    exercise:<input name="类型" type="checkbox" value="exercise">
    <input name="submit" type="submit" value="submit">
</form>
</body>
</html>
