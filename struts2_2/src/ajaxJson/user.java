package ajaxJson;

/**
 * Created by pupil on 2016/6/5.
 */
public class user {
    private String name;
    private String passWord;

    public user(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    // 实现Action的那个类只提供了一个有参数的构造方法而没有提供一个无参的构造方法，在idea内部使用反射的时候因找不到无参的构造方法然后就抛出来了这个异常。解决方法是加上一个无参数的构造方法。
    public user() {
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
