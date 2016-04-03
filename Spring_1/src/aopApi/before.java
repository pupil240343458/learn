package aopApi;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by pupil on 2016/4/2.
 */
public class before implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getClass().getName()+"'s"+method.getName()+"way");
        System.out.println(o.getClass().getName()+"'s"+method.getName()+"way");
        System.out.println(objects.getClass().getName()+"'s"+method.getName()+"way");

    }
}
