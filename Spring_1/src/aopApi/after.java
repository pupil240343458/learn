package aopApi;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by pupil on 2016/4/2.
 */
public class after implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName()+"de"+method.getName()+"方法被执行，返回值是"+o);
    }
}
