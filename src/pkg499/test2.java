/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg499;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author lee
 */
public class test2 extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

    /**
     * Creates new form test2
     */
    public test2() {
        initComponents();
    }
    public void test22(){
        
  try {
            Connection con = DriverManager.getConnection( "jdbc:mysql://10.1.118.7:5555/test","team2","1234");
            Connection con1 = DriverManager.getConnection( "jdbc:mysql://10.1.118.7:5555/test2","team2","1234");

            String sql = "INSERT INTO test2("+ "name,"+ "id)"+ "VALUES(?,?)";

            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            PreparedStatement pstmt = con1.prepareStatement(sql);

            ResultSet rs = statement.executeQuery("SELECT * FROM test");
            while (rs.next()) {
                String nm = rs.getString(1);
                String id = rs.getString(2);

                pstmt.setString(1, nm);
                pstmt.setString(2, id);

                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("could not get JDBC connection: " +e);
        } finally {
         //   con.close();
        //    con1.close();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jButton1)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        test22();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
      public Connection getConnection() {
    
    Connection con=null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://10.1.118.7:5555/temp","team2","1234");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
    }
        return con;
    }
    


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
