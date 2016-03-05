<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/1/1
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<%
    request.setCharacterEncoding("utf-8");
    Cookie userName=new Cookie("userName", URLEncoder.encode(request.getParameter("userName"),"utf-8"));
    Cookie passWord=new Cookie("passWord",URLEncoder.encode(request.getParameter("passWord"),"utf-8"));
    if(request.getParameter("checked")!=null){
        response.addCookie(userName);
        response.addCookie(passWord);
        userName.setMaxAge(864000);
        passWord.setMaxAge(864000);//设置最大生存期限为10天
    }
    else{

}
%>
<html>
<head>
    <title>提交</title>
</head>
<body>
<h1>提交成功我会骗你？</h1>
<a href="cusers.jsp">ffffff</a>
</body>
</html>
