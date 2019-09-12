package mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Config {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/royi?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8";
    public static String user="root";
    public static String passwd="suntest";


    private static Connection connection=null;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Statement stmt=null;
        ResultSet rs=null;
       if(connection==null){
           Class.forName(driver);
           connection= DriverManager.getConnection(url,user,passwd);

       }
       return connection;
    }


}
