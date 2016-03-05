<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2015/11/21
  Time: 3:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h1>request内置对象</h1>
<%
    request.setCharacterEncoding("utf-8");

%>
用户名：<%=request.getParameter("username")+"<br>"%>
密码：<%=request.getParameter("password")+"<br>"%>
爱好：<%
    if(request.getParameterValues("类型")!=null) {
        String[] type = request.getParameterValues("类型");
        for (int i = 0; i < type.length; i++) {
            out.println(type[i] + "&nbsp;");
        }
    }
%><br/>
密码：<%=request.getAttribute("password")%><br>
协议类型及版本号：<%=request.getProtocol()%><br>
服务器主机名：<%=request.getServerName()%><br>
服务器端口号：<%=request.getServerPort()%><br>
请求文件的长度：<%=request.getContentLength()%><br>
请求客户端的IP地址：<%=request.getRemoteAddr()%><br>
请求的上下文路径：<%=request.getContextPath()%><br>
</body>
</html>
