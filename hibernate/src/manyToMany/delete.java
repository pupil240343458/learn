package manyToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by pupil on 2016/6/17.
 */
public class delete {
    public static void main(String[] args) {
//        如果执行删除会报异常，因为如果删除id=1的行，那么相应的function表中关联的数据也会被删除，但是id=2也关联了function的数据，所以造成冲突
        Session session= Dao.getSession();
        Transaction transaction=session.beginTransaction();
        role role=(role) session.get(role.class,1);
        session.delete(role);
        transaction.commit();
    }
}
