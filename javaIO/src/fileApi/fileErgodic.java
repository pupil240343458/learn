package fileApi;

import java.io.File;
import java.io.IOException;

/**
 * Created by pupil on 2016/4/6.
 */
public class fileErgodic {
    public static void setFile(File file)throws IOException{
        if(!file.exists()){
            throw new IllegalArgumentException("destination is not exist");
        }
        if(!file.isDirectory()){
            throw new IllegalArgumentException("destination is not a directory");
        }
        String[]fileNames=file.list();
        for(String string:fileNames){
            System.out.println(string);
        }
    }
    public static void main(String[] args) throws IOException {
        setFile(new File("C:\\"));
    }
}
