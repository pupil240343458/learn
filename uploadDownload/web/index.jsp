<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/4/14
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%--这里设置了项目的根路径是uploadDownload，所以在提交的时候前面要写上项目的根路径--%>
  <form action="/uploadDownload/servlet/upServlet" enctype="multipart/form-data" method="post">
    请选择文件：<input name="file1" type="file">
    <input type="submit" value="确定">
  </form>
  <form action="/uploadDownload/servlet/upServlet2" enctype="multipart/form-data" method="get">
    请选择文件提交给upServlet2：<input name="file" type="file">
    <input type="submit" value="确定">
  </form>
  <a href="/uploadDownload/servlet/downServlet?fileName=a.flv">下载六小龄童的视频</a>
  </body>
</html>
