package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pupil on 2016/4/9.
 */
public class jsrMain {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("annotation.xml");
        JsrService jsrService=(JsrService) context.getBean("jsrService");
        jsrService.save();
    }
}
