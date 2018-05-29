package reminderapp;

import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
    
    Connection conn = null;
    public static Connection Connect(){
        try{
            Class.forName("org.sqlite.JDBC");    
            String url ="jdbc:sqlite:C:\\TEST\\JAVA\\Reminderapp\\test.sqlite";
            
            Connection conn = DriverManager.getConnection(url);            
          //  JOptionPane.showMessageDialog(null, "Connection successful");    //hoooooooooooo working!!!!!.
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
