package client;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by pupil on 2016/4/12.
 */
public class service extends ActionSupport implements ModelDriven<client.user> {
    private user user=new user();

    @Override
    public String execute() throws Exception {
        System.out.println(user.getUserName()+" "+user.getPassWord()+" "+user.getList().get(0).getUserName()+" "+user.getList().get(1).getUserName()+" "+user.getAge());
        return SUCCESS;
    }

    @Override
    public user getModel() {
        return user;
    }
}
