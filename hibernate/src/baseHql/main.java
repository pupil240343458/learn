package baseHql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by pupil on 2016/6/11.
 */
public class main {

    public static void main(String[] args) {

        Session session= Dao.getSession();
        Transaction transaction=session.beginTransaction();

        //hql是基于对象查询，所以包中一定要有对应的类
        //name表示的 function类中的属性名，大小写敏感
        String hql="select name from function";
        Query query = session.createQuery(hql);
        //list()方法返回查询结果
        //返回结果的类型 是根据查询的列决定的
        List<String> list = query.list();
        for(String name:list){
            System.out.println(name);
        }

        //注意查询所有列不能使用*
        //查询多个列时,结果是每行组成一个数组，数组再组成list 数组中元素的类型 是由查询列来决定
        List<Object[]> list2 = session.createQuery("select name,power from function").list();
        for(Object[] objs:list2){
            System.out.println(objs[0]+"--"+objs[1]);
        }

//        通过占位符的形式按条件查询.setParameter属性可以不用关心参数的type
        List<String> list3 = session.createQuery("select name from function where id<?").setInteger(0, 4).list();
        for(String b:list3){
            System.out.println(b);
        }

//        分页查询
        List<String> list4 = session.createQuery("select name from function")
                .setFirstResult(2)//开始显示的记录下标，起始位0
                .setMaxResults(2)//设置每页记录数pageSize
                .list();
        System.out.println("分页查询");
        for(String b:list4){
            System.out.println(b);
        }

//                分组查询
        List<Object> list5 = session.createQuery("select count(name) from function group by name")
                .list();
        System.out.println("分组查询");
        for(Object name:list5){
            System.out.println(name);
        }

//        执行原生的sql语句
        List<Object[]>list6=session.createSQLQuery("select * from function ").list();
        for(Object[] objects:list6){
//            注意：如果用objcts[0]+objects[1]+objects[2]会报错，原因是类型不一样
            System.out.println((Integer) objects[0]+(String) objects[1]+(String) objects[2]);
        }
        transaction.commit();
        session.close();

    }
}
