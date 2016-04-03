package aopAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pupil on 2016/4/2.
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext content=new ClassPathXmlApplicationContext("aopAnnotation.xml");
        helloWorld helloWorld=(aopAnnotation.helloWorld)content.getBean("helloWorld");
        helloWorld.getHelloWorld();
    }
}
