package imgIO;


/**
 * Created by pupil on 2016/4/17.
 */
public class getBytes {
    public static void main(String[] args) {
        try {
            //getBytes返回byte[]类型的数据
            byte[] a="Hello!你好！".getBytes("GBK");
            for (int i = 0; i < a.length; i++) {
                //把每个字节输出会十六进制，默认十进制（应该），二进制binary，八进制octal，
                System.out.println(Integer.toHexString(a[i]));
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
