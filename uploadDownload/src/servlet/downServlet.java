package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by pupil on 2016/5/11.
 */
public class downServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String downLoadFileName=request.getParameter("fileName");
        //从传递的文件名字得到文件的mime类型，然后设置，当然也可以手动添加setContentType("video/x-flv")
        response.setContentType(getServletContext().getMimeType(downLoadFileName));
        //因为设置了setContentType，所以下面就要告诉浏览器准确的下载名字和类型
        response.setHeader("Content-Disposition","attachment;filename="+downLoadFileName);
        //实力化一个FileInputStream对象，参数是项目路径下的downLoad下的a.flv文件
        FileInputStream downLoadFile=new FileInputStream(getServletContext().getRealPath("/")+"//downLoad//a.flv");
        BufferedInputStream bufferInDownLoadFile=new BufferedInputStream(downLoadFile,1048576);
        BufferedOutputStream bufferOutDownLoadFile=new BufferedOutputStream(response.getOutputStream(),1048576);
        byte[] bytes=new byte[1048576];
        int n;
        while((n=bufferInDownLoadFile.read(bytes))!=-1){
            bufferOutDownLoadFile.write(bytes);
        }
        bufferInDownLoadFile.close();
        bufferOutDownLoadFile.close();
    }
}
