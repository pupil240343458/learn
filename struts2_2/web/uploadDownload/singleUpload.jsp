<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/6/2
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>singleUpload</title>
</head>
<body>
<form action="/singleUpload/singleUpload.action" enctype="multipart/form-data" method="post">
    choose your file：<input name="file" type="file">
    <input type="submit" value="submit">
</form>
</body>
</html>
