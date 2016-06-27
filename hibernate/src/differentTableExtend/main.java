package differentTableExtend;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {
    private static student student;
    private static teacher teacher;
    public static void main(String[] args) {
        student=new student();
        teacher=new teacher();
        Session session= Dao.getSession();
        Transaction transaction=session.beginTransaction();

        student.setId(1);
        student.setName("GT");
        student.setAge(20);
        student.setWork("Spring");
        session.save(student);

        teacher.setId(2);
        teacher.setName("pupil");
        teacher.setAge(20);
        teacher.setSalary(13000);
        session.save(teacher);

        transaction.commit();
        session.close();
    }
}
