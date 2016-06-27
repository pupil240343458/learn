package getClearDelete;

import org.hibernate.Session;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {
    private static student student;
    public static void main(String[] args) {
        Session session=Dao.getSession();
        student=session.get(student.class,1);
//        清除session中所有缓存,所以执行session.get执行两次；session.evict(obj):清除指定的缓存；
        session.clear();
        student=session.get(student.class,1);
        System.out.println(student.getName());
    }
}
