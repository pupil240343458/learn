package manyToMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {
    public static void main(String[] args) {

        role role1=new role();
        role role2=new role();

        function function1=new function("增","1");
        function function2=new function("删","2");
        function function3=new function("改","3");
        function function4=new function("查","4");

        Session session= Dao.getSession();
        Transaction transaction=session.beginTransaction();

        role1.setName("user");
        role2.setName("admin");

        role1.getFunctions().add(function1);
        role1.getFunctions().add(function2);
        role1.getFunctions().add(function3);

        role2.getFunctions().add(function1);
        role2.getFunctions().add(function2);
        role2.getFunctions().add(function3);
        role2.getFunctions().add(function4);

//        注意，如果不用cascade属性，session要save所有表中含有的对象
        session.save(role1);
        session.save(role2);
        session.save(function1);
        session.save(function2);
        session.save(function3);
        session.save(function4);
        transaction.commit();
        session.close();
    }
}
