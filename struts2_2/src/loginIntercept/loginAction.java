package loginIntercept;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pupil on 2016/5/30.
 */
public class loginAction extends ActionSupport {
    private user user;

    @Override
    public String execute() throws Exception {
        if(user.getName().equals("pupil")&&user.getPassWord().equals("pupil")){
            ActionContext.getContext().getSession().put("name",user.getName());
            return SUCCESS;
        }
        return LOGIN;
    }

    public user getUser() {
        return user;
    }

    public void setUser(user user) {
        this.user = user;
    }
}
