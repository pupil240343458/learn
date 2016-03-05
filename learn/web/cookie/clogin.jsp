<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2015/12/31
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page  contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie [] cookies= request.getCookies();
    String userName="";//这里不能少写"     =""    "。如果不写，那就等于没有初始化，在下边的< % = % >引用不了。下面的for循环虽然赋值了，但是< % = % >检测不到，有点像全局变量的意思。
    String passWord="";

    if(cookies.length!=0){
        for(Cookie c:cookies){
            if (c.getName().equals("userName")){//不要用c.getName()=="userName";这样会报错。。。
                userName= URLDecoder.decode(c.getValue(),"utf-8");//解码，不然不支持中文会报错，后边会有URLEncoder.encode()，这是转码，转码后解码。
            }
            if (c.getName().equals("passWord")){
                passWord=URLDecoder.decode(c.getValue(),"utf-8");
            }
        }
    }
%>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="cdologin.jsp" method="post">
账号：<input type="text" name="userName" value="<%=userName%>">
密码：<input type="text" name="passWord" value="<%=passWord%>">
<input type="checkbox" name="checked" checked="checked">
    <button type="submit">
        提交
    </button>
</form>
</body>
</html>
