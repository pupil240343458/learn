package bean;

import com.opensymphony.xwork2.ActionSupport;


/**
 * Created by pupil on 2016/5/22.
 */
public class action extends ActionSupport {
//    如果前端传递多个name为u的对象，就不能用类似private List<user> u方式。因为struts仅支持一些基本对象的自动赋值
    private user u;
    public String register(){
        System.out.println(u);
        return SUCCESS;
    }

    public user getU() {
        return u;
    }

    public void setU(user u) {
        this.u = u;
    }
}