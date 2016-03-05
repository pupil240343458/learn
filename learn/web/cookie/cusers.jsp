<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/1/1
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    String userName="";String passWord="";
    Cookie[]cookies= request.getCookies();
//    for(Cookie c:cookies){
//        out.println(c.getName());
//        out.println(c.getValue());
//    }

    if(cookies.length!=0){
        for(Cookie c:cookies){
            if(c.getName().equals("userName")){
                userName= URLDecoder.decode(c.getValue(),"utf-8");
            }
            if(c.getName().equals("passWord")){
                passWord=URLDecoder.decode(c.getValue(),"utf-8");
            }
        }
        for(Cookie c:cookies){
            out.println(URLDecoder.decode(c.getValue(),"utf-8")+"    ");
        }
    }
%>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
<br>
用户：<%=userName%>
密码：<%=passWord%>
</body>
</html>
