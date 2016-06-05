package ajaxJson;

import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by pupil on 2016/6/4.
 */
public class ajaxJson extends ActionSupport {
    private user u;
    private JSONArray j;
    private JSONObject obj;
    @Override
    public String execute() throws Exception {
        j=new JSONArray();
        j.add(new user("0","0"));
        j.add(new user("1","1"));
        j.add(new user("2","2"));
        System.out.println(j.toString());
        return SUCCESS;
    }

    public JSONArray getJ() {
        return j;
    }

    public void setJ(JSONArray j) {
        this.j = j;
    }

    public user getU() {
        return u;
    }

    public void setU(user u) {
        this.u = u;
    }
}
