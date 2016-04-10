package resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by pupil on 2016/4/5.
 */
public class resource {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resource.xml");

//        这里通过file方式的绝对路径，用双斜杠是因为一个\是转义符，要用另一个\表示为斜杠的意思
//        Resource resource=applicationContext.getResource("file:C:\\Users\\BaiLiuBin\\IdeaProjects\\workSpace\\Spring_1\\src\\resource\\config.txt");

//        通过http://的方式访问文件
//        Resource resource=applicationContext.getResource("http://blog.psjay.com/posts/summary-of-spring-3-aop/");

//        通过None路径，不能写相对路径，而且根路径是这个文件的路径
//        Resource resource=applicationContext.getResource("resource/config.txt");


//        通过classpath路径，不能写相对路径，而且根路径是这个文件的路径
        Resource resource=applicationContext.getResource("classpath:resource/config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        try {
            System.out.println(resource.contentLength());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
