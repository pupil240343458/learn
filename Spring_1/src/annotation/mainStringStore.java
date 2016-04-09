package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pupil on 2016/4/8.
 */
public class mainStringStore {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotation.xml");
        store stringStore= (store) applicationContext.getBean("stringStore");
        System.out.println(stringStore.getClass().getName());
    }
}
