/**
 * Created by pupil on 2016/7/19.
 */
window.onload=function () {
    var searchValue=document.getElementsByClassName("searchValue");
    var submit=document.getElementsByClassName("submit");

    submit[0].onclick=function () {
        location.href=encodeURI("/music.html?searchValue="+searchValue[0].value);
    }  
}

