package block;

import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {

    public static void main(String[] args) {
        function function=null;
        Session session= Dao.getSession();
        Transaction transaction=session.beginTransaction();
//        悲观锁，在读取数据时锁住，其他对这几行的更新需要等到悲观锁结束时才能继续
        function=(function)session.get(function.class,1, LockOptions.UPGRADE);
        System.out.println(function.getName()+" "+function.getClass()+" "+function.getPower());
        transaction.commit();
        session.close();

        Session session2= Dao.getSession();
        Transaction transaction2=session2.beginTransaction();
        function=(function)session2.get(function.class,1);
        function.setName("pupil");
        session2.update(function);
        transaction2.commit();
        session2.close();
    }
}
