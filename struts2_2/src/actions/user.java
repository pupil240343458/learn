package bean;

/**
 * Created by pupil on 2016/5/22.
 */
public class user {
    //注意这里的变量名，如果是些pWord会有问题（set方法会变成setpWord，造成赋值不了。get同理）
    private String name;
    private String passWord;
    private int age;
    private String email;

    @Override
    public String toString() {
        return "user{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
}
