package bothOneToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {
    private static grade grade;
    private static bothOneToMany.student student;
    public static void main(String[] args) {
        grade=new grade();
        student=new student();
        Session session=Dao.getSession();
        Transaction transaction=session.beginTransaction();
        student.setName("张三丰");
        student.setAge(22);
        session.save(student);
        grade.getStudents().add(student);
        grade.setName("基础");

        session.save(grade);

        transaction.commit();
        session.close();
    }
}
