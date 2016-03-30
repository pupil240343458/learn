package learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pupil on 2016/3/28.
 */
public class helloTest {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springBeanLearn.xml");
        hello hello=(hello)context.getBean("helloT1");
        hello.getString();
    }
}
