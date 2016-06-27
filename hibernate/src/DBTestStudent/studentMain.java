package DBTestStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by pupil on 2016/6/8.
 */
public class studentMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory =null;
        Session session=null;
        Transaction transaction=null;

//        配置类型安全的准服务注册类，这是当前应用的单例对象，不作修改，所以声明为final.在configure("cfg/hibernate.cfg.xml")方法中，如果不指定资源路径，默认在类路径下寻找名为hibernate.cfg.xml的文件
        final StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure().build();
        try {
//            根据服务注册类创建一个元数据资源集，同时构建元数据并生成应用一般唯一的的session工厂
            sessionFactory = new MetadataSources(standardServiceRegistry).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
        }
//        从会话工厂获取一个session
        session=sessionFactory.openSession();
//        开启一个事务
        transaction=session.beginTransaction();

//        new构造数据库对象，瞬时状态
        student student=new student();
        student.setId(2);
        student.setName("GT");
//        持久状态，save之后student开始被session管理（相当于一个封装的connection）
        session.save(student);
//        commit之后会执行sql语句
        transaction.commit();
//        close之后数据库对象变成游离态，不被session管理
        session.close();


        student.setName("aaa");
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
        student=(student)session.get(student.getClass(),1);
//        如果student的name在session初始化之前set，要改变数据库的数据，就不能用save，要用update
        session.update(student);
        transaction.commit();
    }
}
