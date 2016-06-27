package component;

import getClearDelete.Dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import twoPrimary.bean;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {
    private static teacher teacher;
    public static void main(String[] args) {
        teacher=new teacher();
        address address=new address();
        Session session= Dao.getSession();
        Transaction transaction=session.beginTransaction();
        teacher.setSex("male");
        teacher.setName("pupil");
        address.setAddress1("yanling");
        address.setAddress2("xuchang");
        address.setAddress3("wuhan");
        teacher.setAddress(address);
        session.save(teacher);
        transaction.commit();
        session.close();
        System.out.println(teacher.getId()+teacher.getName()+teacher.getSex()+teacher.getAddress().getAddress1());
    }
}
