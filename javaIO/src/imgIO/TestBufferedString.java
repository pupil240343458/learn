package imgIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by pupil on 2016/4/7.
 */
public class TestBufferedString {
    public static void main(String[] args) throws Exception {
        // 指定要读取文件的缓冲输入字节流，默认缓冲区是8*1024B
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\电影\\视觉秀《金猴闹春》六小龄童 13—在线播放—《辽宁卫视春节联欢晚会 2016》—综艺—优酷网，视频高清在线观看.flv"));
        File file = new File("D:\\mm.mp4");
        if (file != null) {
            file.createNewFile();
        }
        // 指定要写入文件的缓冲输出字节流
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
        byte[] b = new byte[1024];// 用来存储每次读取到的字节数组
        int n;// 每次读取到的字节数组的长度
        //其实相当于间接调用了BufferedInputStream的read(byte[] b,int off,int len)方法。作用：从输入流中读取内容写入b，读取b.length个，并且返回读取内容的长度。如果读取完毕，返回-1
        while ((n = in.read(b)) != -1) {
            System.out.println(n);
            out.write(b, 0, n);// 写入到输出流
        }
        out.flush();
        out.close();// 关闭流
        in.close();
    }
}
