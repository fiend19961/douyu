package cn.shanghai.sun;

import mysql.Config;
import mysql.Main;

import java.sql.SQLException;

public class Test01 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Main.insert("type@=chatmsg/rid@=1/");
    }
}
