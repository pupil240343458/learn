package loginIntercept;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by pupil on 2016/5/30.
 */
public class loginIntercept extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
//        得到前端请求的actionName并且判断是否是指定的action
        if(invocation.getProxy().getActionName().equals("loginAction")){
//            如果是指定的action，则往下执行其他的拦截器直到对应的action或者在其他拦截器中不满足条件return出去
            return invocation.invoke();
        }
//        判断用户是否登陆并且把用户name放进session里边
        if(ActionContext.getContext().getSession().get("name")!=null){
            return invocation.invoke();
        }
//        如果所有条件都不满足，则重定向到login指定的页面
        return "login";
    }

}
