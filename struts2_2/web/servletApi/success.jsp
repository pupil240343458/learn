<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/5/23
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
session=<%=request.getSession().getAttribute("name")%>
session=<%=request.getSession().getAttribute("passWord")%>
application=<%=application.getAttribute("name")%>
</body>
</html>
