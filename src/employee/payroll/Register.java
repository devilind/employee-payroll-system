/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import javax.swing.JOptionPane;
import com.sun.glass.events.KeyEvent;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Vasim
 */
public class Register extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        conn=db.java_db();
 Toolkit toolkit = getToolkit();
  Dimension size = toolkit.getScreenSize();
  setLocation(size.width/2 - getWidth()/2, 
   size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_lastname = new javax.swing.JTextField();
        txt_pass = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_conpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        c_type = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("First Name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 80, 70, 14);
        jPanel1.add(txt_firstname);
        txt_firstname.setBounds(240, 70, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 130, 70, 14);
        jPanel1.add(txt_lastname);
        txt_lastname.setBounds(240, 120, 170, 30);
        jPanel1.add(txt_pass);
        txt_pass.setBounds(240, 220, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 230, 60, 14);
        jPanel1.add(txt_conpass);
        txt_conpass.setBounds(240, 270, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Confirm Password:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 280, 110, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Division:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 330, 50, 14);

        c_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Accounts", "HR Dept" }));
        jPanel1.add(c_type);
        c_type.setBounds(240, 320, 170, 30);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 390, 80, 40);

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(340, 390, 120, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Username:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 180, 70, 14);
        jPanel1.add(txt_username);
        txt_username.setBounds(240, 170, 170, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee/payroll/images/15505.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-6, -6, 730, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                String fname = txt_firstname.getText();
                String lname = txt_lastname.getText();
                String uname = txt_username.getText();
                String pass = String.valueOf(txt_pass.getText());
                String re_pass = String.valueOf(txt_conpass.getText());
               
        if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Username");
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add A Password");
        }
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Retype The Password Again");
        }
        else{
           try {
                String sql ="insert into Users " 
                        + "(firstname,lastname,username,password,division)values (?,?,?,?,?) ";

                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_firstname.getText());
                pst.setString(2,txt_lastname.getText());
                pst.setString(3,txt_username.getText());
                pst.setString(4,txt_pass.getText());
                pst.setString(5,c_type.getSelectedItem().toString());
                checkuser();
              

            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
        
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                 catch(Exception e){
            
                } 
        }
                
             
            }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login x = new login();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c_type;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_conpass;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    private void checkuser() {
        try{
            String fname = txt_firstname.getText();
            String name = txt_username.getText();
          Statement stat = conn.createStatement();
          String selectQuery = "select * from Users where firstname='"+fname+"' and username='"+name+"' ";
           System.out.println(selectQuery);
           rs=stat.executeQuery(selectQuery);
           if(rs.next())
           {
             JOptionPane.showMessageDialog(null,"Username Already Exists");
           }
           else{
             pst.execute();
               JOptionPane.showMessageDialog(null,"Data Added"); 
           }
       }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);  
       }
    }
}
