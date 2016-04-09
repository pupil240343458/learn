package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pupil on 2016/4/5.
 */
public class BeanAnnotationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotation.xml");
        BeanAnnotation beanAnnotation= (BeanAnnotation) applicationContext.getBean("beanAnnotation");
        beanAnnotation.say("this is test");
        beanAnnotation.getS("hello");
        beanAnnotation.getList();
        beanAnnotation.getMap();
        beanAnnotation.getN();
    }
}
