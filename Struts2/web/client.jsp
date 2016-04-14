<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/4/12
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>client</title>
</head>
<body>
<%--这里的action对应的是struts2.xml里边的action的name后缀是因为修改成了html和do，注意下面传递book参数的方式--%>
<form action="service.html" method="post">
    userName:<input type="text" name="userName">
    passWord:<input type="password" name="passWord">
    age:<input type="text" name="age">
    book1:<input type="text" name="list[0].userName">
    book2:<input type="text" name="list[1].userName">
    <input type="submit" value="提交">
</form>
</body>
</html>
