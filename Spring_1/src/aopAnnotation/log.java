package aopAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by pupil on 2016/4/2.
 */
@Aspect
public class log {
    @Before("execution(* aopAnnotation.helloWorld.*(..))")
    public void before(){
        System.out.println("before");
    }
    @After("execution(* aopAnnotation.helloWorld.*(..))")
    public void after(){
        System.out.println("after");
    }
    @Around("execution(* aopAnnotation.helloWorld.*(..))")
//    通过注解方式实现了前置通知，后置通知，环绕通知，并且环绕通知里边要有所加的参数，然后proceedingJoinPoint.proceed()，如果没有这个方法，那么被环绕的方法不会被执行
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("before around");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after around");
    }
}
