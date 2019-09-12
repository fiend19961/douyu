package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void insert(String message) throws SQLException, ClassNotFoundException {
        if (!message.startsWith("type@=chatmsg")) {
            return;
        }
        PreparedStatement ps = null;
        Connection conn = null;
        try {
            conn = Config.getConnection();            //  v          v          v   v  v   v          v   v   v          v    date
            ps = conn.prepareStatement("insert into dm_chatmsg(type,rid,ct,uid,nn,txt,cid,level,sahf,cst,bnn,bl,brid,hc,createDate) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            Map<String, String> map = decode(message);
            if (map != null) {
                ps.setString(1, map.get("type"));//type
                ps.setInt(2, Integer.parseInt(map.get("rid") == null ? "0" : map.get("rid")));//rid
                ps.setInt(3, Integer.parseInt(map.get("ct") == null ? "0" : map.get("ct")));//ct
                ps.setString(4, map.get("uid"));//uid
                ps.setString(5, map.get("nn"));//nn
                ps.setString(6, map.get("txt"));//txt
                ps.setString(7, map.get("cid"));//cid
                ps.setInt(8, Integer.parseInt(map.get("level") == null ? "0" : map.get("level")));//level
                ps.setString(9, map.get("sahf"));//sahf
                ps.setString(10, map.get("cst"));//cst
                ps.setString(11, map.get("bnn"));//bnn
                ps.setInt(12, Integer.parseInt(map.get("bl") == null ? "0" : map.get("bl")));//bl
                ps.setInt(13, Integer.parseInt(map.get("brid") == null ? "0" : map.get("brid")));//brid
                ps.setString(14, map.get("hc"));//hc
                ps.setDate(15, new java.sql.Date(new java.util.Date().getTime()));//createDate
                ps.executeUpdate();
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
            sqle.printStackTrace();
        } finally {
            ps.close();
        }

    }

    public static Map<String, String> decode(String msg) {
        Map<String, String> map = new HashMap<String, String>();
        String[] all = msg.split("/");
        for (String temp : all) {
            String[] sh = temp.split("@=");
            if (sh.length > 1) {
                map.put(sh[0], sh[1]);
            }

        }

        return map;

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Statement stmt;
        ResultSet rs;
        Connection conn = Config.getConnection();
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM sys_config");
        while (rs.next()) {
            System.out.println(rs.getString(2));
        }
    }
}
