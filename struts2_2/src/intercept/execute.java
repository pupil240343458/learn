package intercept;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pupil on 2016/5/29.
 */
public class execute extends ActionSupport{
    private String name;


    public String execute(){
        System.out.println(name);
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
