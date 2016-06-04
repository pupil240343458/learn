package action;

/**
 * Created by pupil on 2016/5/18.
 */
public class helloAction {
    private String name;
    private String passWord;
    public String execute(){
        System.out.println("执行execute");
        if("admin".equals(name)&&"admin".equals(passWord)){
            return "success";
        }else {
            return "failed";
        }
    }
    public String logout(){
        System.out.println("logout");
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
