package validate;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pupil on 2016/5/28.
 */
//struts2手动验证，首先执行validateAge，再validate，最后age，如果有一个执行报错，则返回input
public class validate extends ActionSupport {
    public String name;
    public String passWord;
    public int age;

    public String age(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(passWord);
        return SUCCESS;
    }

    public void validateAge(){
        System.out.println("validateAge");
        if(age<0||age>100){
            this.addActionError("your age is illegal");
        }
        System.out.println(this.getActionErrors());
    }

    public void validate(){
        System.out.println("validate");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
