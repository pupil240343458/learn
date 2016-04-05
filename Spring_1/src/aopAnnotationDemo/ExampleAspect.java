package aopAnnotationDemo;

import org.aspectj.lang.annotation.*;

/**
 * Created by pupil on 2016/4/4.
 */
@Aspect
public class ExampleAspect {

//    定义业务类的路径，是一个空白方法，为public类型
    @Pointcut("execution(* aopAnnotationDemo.UserManager.*(..))")
    public void aPointcut() {
    }

    @Before("aPointcut()")
    public void beforeAdvice() {
        System.out.println("before advice is executed!");
    }

//    指定业务类的路径和业务类方法返回的参数的name,以便在通知方法调用这个参数
    @AfterReturning(pointcut = "aPointcut()", returning="r")
    public void afterReturningAdvice(String r) {
        if (r != null)
            System.out.println("after returning advice is executed! returning String is : " + r);
    }

    @After("aPointcut()")
    public void AfterAdvice() {
        System.out.println("after advice is executed!");
    }

    //    指定业务类的路径和业务类方法需要参数的name,以便在通知方法调用这个参数,因为多个参数，用逗号隔开
    @After(value = "aPointcut()&&args(s,ss)")

    public void AfterAdviceWithArg(String s,int ss) {
        System.out.println("after advice with arg is executed!arg is : " + s+ss);
    }

//    指定业务类的路径和抛出异常的name
    @AfterThrowing(pointcut="aPointcut()",throwing="e")
    public void afterThrowingAdvice(Exception e) {
        System.out.println("after throwing advice is executed!exception msg is : " + e.getMessage());
    }

}