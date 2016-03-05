<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/3/2
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/index.js"></script>
  </head>
  <body>
  <form action="servlet/Servlet"method="post">
    账号：<input type="text"style="height: 25px;width: 200px"name="name">
    密码：<input type="password" style="height: 25px;width: 200px" name="passWord">
    <hr>
    喜好：<br>
    看电影<input type="checkbox" checked="checked" name="interest" value="movie" >
    听音乐<input type="checkbox" checked="checked" name="interest" value="music">
    看电视<input type="checkbox" checked="checked" name="interest" value="tv">
    敲代码<input type="checkbox" checked="checked" name="interest" value="code">
    <input type="submit" name="submit" value="提交">
  </form>
  </body>
  <p name="submit" style="cursor: pointer;">提交给javaBean</p>
</html>
