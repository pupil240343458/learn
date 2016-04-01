package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by pupil on 2016/4/1.
 */
public class invocation implements InvocationHandler {
    Object object;

    public invocation(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行方法"+method.getName());
        Object result=method.invoke(object,args);
        return result;
    }
}
