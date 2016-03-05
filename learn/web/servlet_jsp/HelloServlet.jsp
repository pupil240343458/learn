<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/2/29
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>第一个servlet小例子</h1>
<hr>
<a href="/learn/HelloServlet/HelloServlet">get方式请求HelloServlet</a><br>
<form action="../HelloServlet/HelloServlet" method="post">
    <input type="submit" value="post方式请求HelloServlet">
</form>
</body>
</html>