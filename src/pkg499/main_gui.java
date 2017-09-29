/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg499;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;

/**
 *
 * @author Andrew
 */
public class main_gui {
  
private static JFrame f;
private static log_in jPanel1;
private static person g;



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       f = new JFrame();
        jPanel1 = new log_in();
        g = new person();
         jPanel1.setSize(300, 300);
            f.setResizable(false);
            f.setSize(320, 320);
            f.getContentPane().add(jPanel1);
            f.pack();
            f.setVisible(true);
        
    }
    public static void sub_main()
    {
        
    }
   
    public static void change_screen_log()
    {
        f.getContentPane().removeAll();
        //f.setSize(300, 300);
        f.getContentPane().add(jPanel1);
        f.pack();
        f.setVisible(true);
    }
    
    public static void change_screen_new()
    {
        f.getContentPane().removeAll();
        g = new person();
        f.setSize(g.getSize());
        f.getContentPane().add(g);
        f.pack();
        f.setVisible(true);
    }
    
    public static void change_screen_old()
    {
        //f.getContentPane().setVisible(false);
        f.setSize(g.getSize());
        f.getContentPane().add(g);
        f.pack();
        f.setVisible(true);
    }
}
