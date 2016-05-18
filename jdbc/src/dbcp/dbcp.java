package dbcp;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by pupil on 2016/5/17.
 */
public class dbcp {
    //定义一个数据源
    private static DataSource dataSource;
    private static final String configFile="/dbcp.properties";

    public dbcp(){
        Properties properties=new Properties();
        try {
            //读取配置文件
            properties.load(Object.class.getResourceAsStream(configFile));
            //传递给dbcp提供的工厂类所需要的数据库信息，然后返回数据源
            dataSource= BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        Connection connection=null;
        if(dataSource!=null){
            try {
                //从数据源中获取一个连接
                connection=dataSource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }


}
