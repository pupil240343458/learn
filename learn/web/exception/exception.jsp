<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2015/12/29
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" isErrorPage="true" %>
<html>
<head>
    <title>异常打印</title>
</head>
<body>

异常的消息是：
<%=exception.getMessage()%>
异常的字符串描述：
<%=exception.toString()%>
</body>
</html>
