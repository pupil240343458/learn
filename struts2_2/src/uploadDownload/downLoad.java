package uploadDownload;

import com.opensymphony.xwork2.ActionSupport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by pupil on 2016/6/2.
 */
public class downLoad extends ActionSupport {
//    读取下载文件的文件名
    private String fileName;

//    struts封装好读取和传输IO的方法，这里把文件实例化为inputStream类型的数据。方法名字固定！
    public InputStream getInputStream() {
        try {
            return new FileInputStream("D:\\IDM下载\\"+fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
