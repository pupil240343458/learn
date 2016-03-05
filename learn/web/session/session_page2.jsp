<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2015/12/28
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session内置对象</title>
</head>
<body>
<h1>session内置对象</h1>
<hr>
<% String[] names=session.getValueNames();
for(int i=0;i<names.length;i++)
{
    out.print(names[i]+"&nbsp&nbsp");
}
%>
</body>
</html>
