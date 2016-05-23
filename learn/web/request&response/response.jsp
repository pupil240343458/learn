<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2015/11/22
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" import="java.util.*" language="java" %>
<html>
<head>
    <title>测试response</title>
</head>
<body>
<%
    out.print("<h1>response内置对象</h1>");
    out.print("<hr>");
    //out.flush();
    response.setContentType("text/html;charset=utf-8");
    PrintWriter outer=response.getWriter();
    outer.print("大家好");
//    response.sendRedirect("request.jsp");//请求重定向：客户端行为，response.sendRedirect()，从本质上讲等同于两次请求，前一次的请求对象不会保存，地址栏的URL地址会改变。
//    请求转发：服务器行为，request.getRequestDispatcher().forward(req,resp)；是一次请求，转发后请求对象会保存，地址栏的URL地址不会改变。
    request.getRequestDispatcher("request.jsp").forward(request,response);
%>
</body>
</html>
