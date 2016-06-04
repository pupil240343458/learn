package servletApi;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by pupil on 2016/5/23.
 */
public class servletApi {
    private String name;
    private String passWord;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String login(){
        //get request,but remember that you must import the libraries what it needs,such as tomcat or javaEE
        HttpServletRequest request= ServletActionContext.getRequest();

        //set property by getting request's session
        request.getSession().setAttribute("name",name);

        //get and put data into session
        ActionContext.getContext().getSession().put("passWord",passWord);

        //get application
        Map<String,Object> application=ActionContext.getContext().getApplication();
        application.put("name",name);

        //get parameter
        Map<String,Object> parameter=ActionContext.getContext().getParameters();

        //cause you'll get an array here,so you'd change it's type strongly and show it's situation
        System.out.println("name="+((String [])parameter.get("name"))[0]);
        return "success";
    }
}
