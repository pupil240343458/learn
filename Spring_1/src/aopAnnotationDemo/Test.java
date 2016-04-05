package aopAnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pupil on 2016/4/4.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ctx  = new ClassPathXmlApplicationContext("aopAnnotationDemo.xml");
        UserManager um =  ctx.getBean("userManager",UserManager.class);
        System.out.println("------ Case 1 -------------------------------------------");
        um.addUser("hey",1);
        System.out.println("------ Case 2 -------------------------------------------");
        try {
            um.editUser();
        } catch (Exception e) {

        }
        System.out.println("------ Case 3 -------------------------------------------");
        um.getUser();

    }
}