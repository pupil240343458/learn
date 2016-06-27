package twoPrimary;

import getClearDelete.Dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {
    private static bean bean;
    public static void main(String[] args) {
        bean=new bean();
        Session session= Dao.getSession();
        Transaction transaction=session.beginTransaction();
        bean.setId(1);
        bean.setAge(1);
        bean.setName("pu");
        session.save(bean);
        transaction.commit();
        session.close();
    }
}
