package action;

import com.opensymphony.xwork2.Action;

/**
 * Created by pupil on 2016/5/21.
 */
public class interfaceAction implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("interfaceAction");
        return SUCCESS;
    }
}
