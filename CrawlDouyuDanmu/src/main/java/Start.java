import mysql.Main;

import java.io.IOException;
import java.sql.SQLException;

public class Start {
    public static void main(String[] args) throws IOException, InterruptedException {
        DouyuBarrageHandler server = new DouyuBarrageHandler("9999");//房间号id
        while (true) {
            String temp=server.read();
            System.out.println(temp);
            Main.insert(temp);
           // Thread.sleep(1);
        }
    }
}