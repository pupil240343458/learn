/**
 * Created by pupil on 2016/3/3.
 */
window.onload= function () {
    var submit=document.getElementsByName("submit");
    var name=document.getElementsByName("name");
    var passWord=document.getElementsByName("passWord");
    var interest=document.getElementsByName("interest");
    submit[1].onclick=function()
    {
        //for(var n=0;n<5;n++)
        //{
        //    if(!interest[n].checked)
        //    {
        //        interest[n].value=null;
        //    }
        //}
        location.href="servlet/Servlet?name="+name[0].value+"&&passWord="+passWord[0].value;
    }
}