<%--
  Created by IntelliJ IDEA.
  User: pupil
  Date: 2016/6/4
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript">
        function loadXMLDoc()
        {
            var xmlhttp=new XMLHttpRequest();
            xmlhttp.onreadystatechange=function()
            {
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
//                    这种方式是没有用json或者jsonArray，直接在给action的u传递参数
//                    var result = eval("("+xmlhttp.responseText+")");
//                    document.getElementById("myDiv").innerHTML=result.u.name;

//                    在action里用了json或者jsonArray
                    var result=eval("("+xmlhttp.responseText+")");
                    document.getElementById("myDiv").innerHTML=result.j[1].name;
                }
            }
            xmlhttp.open("GET","/ajaxJson/ajaxJson?u.name=pupil&&u.passWord=pupil",true);
            xmlhttp.send();
        }
        function c() {
//            因为eval里边不是字符串，所以可以不用加"("以及")",此处主要为对比。可以简化为var obj ={ id: 1, name: 'n_1' }；
            var obj ={ id: 1, name: 'n_1' };
            document.getElementById("myDiv").innerHTML=obj.id;
        }
    </script>
</head>
<body>

<h2>AJAX</h2>
<button type="button" onclick="loadXMLDoc()">请求数据</button>
<button type="button" onclick="c()">请求</button>
<div id="myDiv"></div>

</body>
</html>
