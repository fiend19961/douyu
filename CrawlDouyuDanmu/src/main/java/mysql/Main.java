package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Statement stmt;
        ResultSet rs;
        Connection conn=Config.getConnection();
        stmt=conn.createStatement();
        rs= (ResultSet) stmt.executeQuery("SELECT * FROM sys_config");
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
    }
}
