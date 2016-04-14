package client;

import java.util.List;

/**
 * Created by pupil on 2016/4/12.
 */
public class user {
    private String userName;
    private String passWord;
    private int age;
    private List<user> list;

    public List<user> getList() {
        return list;
    }

    public void setList(List<user> list) {
        this.list = list;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
