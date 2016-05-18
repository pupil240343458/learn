package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbcp.dbcp;
/**
 * Created by pupil on 2016/5/17.
 */
public class testDBUtilDbcp {
    public static void main(String[] args) throws SQLException {
        String sql=null;
        sql="select * from student;";
        dbcp dbcp=new dbcp();
        Connection connection=dbcp.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
        }
        //把数据库连接返回给数据库连接池（因为dbcp重写了close方法，所以并不会关闭掉数据库的连接）
        connection.close();
    }
}
