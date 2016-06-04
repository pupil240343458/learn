package intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by pupil on 2016/5/29.
 */
public class timeIntercept implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        long start=System.currentTimeMillis();
//      执行其他的拦截器并且最终执行action后返回result
        String result=invocation.invoke();
        long end=System.currentTimeMillis();
        System.out.println("use time:"+(end-start));
        return result;
    }
}
