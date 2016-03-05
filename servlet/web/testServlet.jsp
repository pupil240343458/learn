<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/3/2
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean class="bean.javaBean" id="u" scope="session" />
<jsp:useBean class="bean.javaBean" id="user" scope="session" />
<jsp:getProperty name="u" property="userName"/>
<jsp:getProperty name="u" property="passWord"/>
<%
    try {
        for(String s:u.getIntersts()){
            out.print(s);
        }
    }catch (Exception exception){
        exception.printStackTrace();
    }
%>
<jsp:getProperty name="u" property="date"/>
<br><br><br><br><br><br><br><br><br><br>
<jsp:getProperty name="user" property="intersts"/>
<jsp:getProperty name="user" property="passWord"/>
<jsp:getProperty name="user" property="userName"/>
<jsp:getProperty name="user" property="date"/>
</body>
</html>