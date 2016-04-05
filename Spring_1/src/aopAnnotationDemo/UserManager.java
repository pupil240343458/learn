package aopAnnotationDemo;

/**
 * Created by pupil on 2016/4/4.
 */
public class UserManager {
    /*这个方法需要一个参数*/
    public void addUser(String user,int a) {
        System.out.println("addUser(String str) method is executed!");
    }

    public void deleteUser() {
        System.out.println("deleteUser() method is executed!");
    }
    /*这个方法返回一个字符串*/
    public String getUser() {
        System.out.println("getUser() method is executed!");
        return "Hello";
    }
    /*这个方法抛出一个异常*/
    public void editUser() throws Exception {
        throw new Exception("something is wrong.");
    }
}