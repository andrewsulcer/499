/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg499;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author lee
 */
public class connect {
    
    Connection conn=null;
    public static Connection ConnectDB() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://10.1.118.7:5555/team2","team","1234");
            JOptionPane.showMessageDialog(null,"connect to database");
            return conn;
        }
        catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "check id ","fail",JOptionPane.ERROR_MESSAGE);
                            
        return null;
        }
    }
}
