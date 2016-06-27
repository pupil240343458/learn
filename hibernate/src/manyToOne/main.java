package manyToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {
    private static grade grade;
    private static student student;
    public static void main(String[] args) {
        grade=new grade();
        student=new student();
        Session session=Dao.getSession();
        Transaction transaction=session.beginTransaction();
        grade.setName("senior");
//        因为grade也是一个表，所以这里注意session要save一下
        session.save(grade);
        student.setName("TG");
        student.setAge(20);
        student.setGrade(grade);
        session.save(student);
        transaction.commit();
        session.close();
    }
}
