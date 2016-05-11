package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Created by pupil on 2016/5/4.
 */
public class upServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream inputStream=request.getInputStream();
        File file=new File("D:\\hello.txt");
        try {
            file.createNewFile();
        } catch (IOException e){

        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        int n;
        while((n=inputStream.read())!=-1){
            fileOutputStream.write(n);
        }
        fileOutputStream.flush();
        inputStream.close();
        fileOutputStream.close();


        RandomAccessFile randomAccessFile=new RandomAccessFile(file,"r");
        randomAccessFile.readLine();
        String fileName=randomAccessFile.readLine();
//        获取上传文件的文件名字的开头的索引位置，因为不同的浏览器的传递方式不同，所以有的filename可能包含有\，而有些其他的文件名字可能只是含有这个文件名字
        int beginInt= Math.max(fileName.lastIndexOf("\\")+1,fileName.lastIndexOf("\"",fileName.length()-2)+1);
        int endInt=fileName.lastIndexOf("\"");
        fileName=fileName.substring(beginInt,endInt);
        System.out.println(fileName);


//        得到内容的开始位置
        long startPostion=0;
        randomAccessFile.seek(startPostion);
        int i=1;
        while((n=randomAccessFile.readByte())!=-1&&i<=4){
//            n从randomAccessFile中读取一个字节，判断这个字节是否表示换行符
            if(n=='\n'){
                i++;
            }
            startPostion++;
            randomAccessFile.seek(startPostion);
        }


        //    得到内容的结束位置
        randomAccessFile.seek(file.length()-1);
        long endPosition=file.length()-1;
        int m=1;
        while((n=randomAccessFile.readByte())!=-1&&m<=2){
            if(n=='\n'){
                m++;
            }
            endPosition--;
            randomAccessFile.seek(endPosition);
        }


        File finalFile=new File("D://",fileName);
        RandomAccessFile randomFile=new RandomAccessFile(finalFile,"rw");
        randomAccessFile.seek(startPostion);
        while (startPostion<=endPosition){
            randomFile.write(randomAccessFile.readByte());
            startPostion++;
            randomAccessFile.seek(startPostion);
        }

        randomAccessFile.close();
        randomFile.close();
        file.delete();

    }




    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}





