package db;

import java.sql.*;

import static java.lang.Class.forName;

/**
 * Created by pupil on 2016/5/13.
 */
public class DBUtil {
    private final static String name="root";
    private final static String passWorld="123456";
    private final static String url="jdbc:mysql://localhost:3306/imooc";
    public static void main(String[] args) throws Exception {
        //寻找mysql-connector-java包下面的相关类加载驱动
        forName("com.mysql.jdbc.Driver");
        //建立数据库连接
        Connection connection=DriverManager.getConnection(url,name,passWorld);
        //通过连接操作数据库，实现增删改查
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from imooc_goddess");
        while(resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getString("age")+" "+resultSet.getString("user_name"));
        }
    }
}
