<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2015/12/28
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>session内置对象</title>

</head>
<body>
<%--session对象开始于此次浏览器打开，直到全部关闭。或者30min后自己结束，这个时间也可以自己设定--%>
<h1>session内置对象</h1>
<hr>
<%
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    Date d=new Date(session.getCreationTime());
    session.setAttribute("username","a33333");
    session.setAttribute("passWord",'b');
    session.setAttribute("number",'c');
    session.setAttribute("IDfasdffdfd","fafdafdsfsdddd");
    //session.setMaxInactiveInterval(10);设置session的有效时间为10秒
//    session.invalidate();页面加载后直接销毁了session；
%>
Session创建时间：<%=sdf.format(d)%>
Session获取ID：<%=session.getId()%>
<a href="session_page2.jsp" target="_blank">aaaaaaa</a><%--target  _blank 在一个新标签中打开网页--%>
</body>
</html>
