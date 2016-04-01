package keepLearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pupil on 2016/3/30.
 */
public class helloTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springBeanKeepLearn.xml");
        helloDo helloDo=(helloDo)context.getBean("helloDo");
        System.out.println(helloDo.getHello().getString());

    }
}
