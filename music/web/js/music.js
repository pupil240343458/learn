/**
 * Created by pupil on 2016/7/20.
 */
window.onload=function () {
    function GetRequest() {
        var url = decodeURI(location.search);
        var theRequest = new Object();
        if (url.indexOf("?") != -1) {
            var str = url.substr(1);
            if (str.indexOf("&") != -1) {
                strs = str.split("&");
                for (var i = 0; i < strs.length; i++) {
                    theRequest[strs[i].split("=")[0]] = unescape(strs[i].split("=")[1]);
                }
            } else {
                theRequest[str.split("=")[0]] = unescape(str.split("=")[1]);
            }
        }
        return theRequest;
    }

    function getSongID() {
        var result;
        var xmlhttp=new XMLHttpRequest();
        xmlhttp.open("GET","/m/s?searchValue="+GetRequest().searchValue,true);
        xmlhttp.send();
        xmlhttp.onreadystatechange=function()
        {
            if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
                result=eval("("+xmlhttp.responseText+")");
                getMusicData(result.songID.songID);
            }
        }
    }

    function getMusicData(songID){

    }

    getSongID();
}
