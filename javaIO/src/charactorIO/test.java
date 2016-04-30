package charactorIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by pupil on 2016/4/6.
 */
public class test {
    public static void main(String[] args)throws IOException{
        FileInputStream fileInputStream=new FileInputStream("C:\\pupil\\test.txt");
//        这里注意编码，读取的时候和被读取文件编码一致
        InputStreamReader reader=new InputStreamReader(fileInputStream,"GBK");
        int c;
//        内容读完之后C就==-1了
        while((c=reader.read())!=-1){
            System.out.print((char)c);
        }
        System.out.println();
    }
}
