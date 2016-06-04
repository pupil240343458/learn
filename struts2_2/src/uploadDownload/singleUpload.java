package uploadDownload;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;

/**
 * Created by pupil on 2016/6/2.
 */
//基于struts2的上传，有commons-fileupload-xxx.jar和commons-io-xxx.jar两个包的支持，其中封装好了一些方法
public class singleUpload extends ActionSupport {
//    获取上传文件，名称与表单提交的name一致。如果是批量上传：private File[] file;
    private File file;
//    获取上传文件名，格式：表单name+FileName（固定）。如果是批量上传：private String[] fileFileName;
    private String fileFileName;
//    获取上传文件类型，格式：表单name+ContentType（固定）。如果是批量上传：private String[] fileContentType;
    private String fileContentType;

//    批量上传，方法体写for循环遍历输出
    public String execute() throws IOException {
//        获取上传的文件
        FileInputStream fileInputStream= new FileInputStream(file);
//        定义上传文件的保存。这有一个问题：并没有创建一个fileFileName的文件，然而却成功了。猜想应该是两个相关jar包里边封装好了create方法
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\上传\\"+fileFileName);
        int c;
        while((c=fileInputStream.read())!=-1){
            fileOutputStream.write(c);
        }
        fileInputStream.close();
        fileOutputStream.close();
        return "success";
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }
}
