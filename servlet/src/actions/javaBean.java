package bean;

/**
 * Created by pupil on 2016/3/2.
 */
public class javaBean {
    private String userName,passWord,Date,intersts[];

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String[] getIntersts() {
        return intersts;
    }

    public void setIntersts(String[] intersts) {
        this.intersts = intersts;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
