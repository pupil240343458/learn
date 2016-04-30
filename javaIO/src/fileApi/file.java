package fileApi;

import java.io.File;
import java.io.IOException;

/**
 * Created by pupil on 2016/4/6.
 */
public class file {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\BaiLiuBin\\IdeaProjects\\workSpace\\javaIO\\src\\fileApi\\directory");
        if(!file.exists()){
            file.mkdir();
        }
        else{
            file.delete();
        }
        System.out.println(file.isDirectory()+"    "+file.isFile());
        File file2=new File("C:\\Users\\BaiLiuBin\\IdeaProjects\\workSpace\\javaIO\\src\\fileApi\\test.txt");
        if(!file2.exists()){
            try {
                file2.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
//            输出file2的路径
            System.out.println(file2);
        }
        else{
            file2.delete();
        }
    }
}
