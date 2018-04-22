/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myloginapp1;
import javax.swing.*;
import java.awt.Component;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Information extends javax.swing.JFrame {
    ///Connection Database////
    Connection conn = null;
    PreparedStatement pst = null; ///*********************create DATACommand by perameter////
    ResultSet rs = null;                ////************* "result set" refers to the row and column data contained///
    ///////End connection/////
    public Information() {
        initComponents();
    }
public void show_Table () ////*******************Methord :All of data show in a table//
    {
        ///call connection object///
        conn = myloginapp1.MySqlConnect.ConnectDB();
        try{
        String sql ="select * from login";
        
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        Tabledata.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Male = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        Firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        idnumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contactnum = new javax.swing.JTextField();
        choosenbut = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        imagedig = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabledata = new javax.swing.JTable();
        Insertbut = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clearbut = new javax.swing.JButton();
        Show_table = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Gensss = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Search");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 143, 36);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("FirstName");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 53, 128, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("LastName");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 99, 128, 37);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Id");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 144, 116, 35);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 0));
        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 189, 116, 41);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ContactNumber");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 240, 150, 37);

        Male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Male.setForeground(new java.awt.Color(204, 0, 204));
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        jPanel1.add(Male);
        Male.setBounds(160, 290, 90, 33);

        female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        female.setForeground(new java.awt.Color(255, 0, 0));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(250, 290, 110, 33);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Gender");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 290, 80, 26);

        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });
        jPanel1.add(Search);
        Search.setBounds(157, 11, 202, 36);

        Firstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(Firstname);
        Firstname.setBounds(157, 53, 202, 40);

        lastname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(lastname);
        lastname.setBounds(157, 100, 202, 38);

        idnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnumberActionPerformed(evt);
            }
        });
        jPanel1.add(idnumber);
        idnumber.setBounds(157, 144, 202, 39);

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(email);
        email.setBounds(157, 191, 202, 39);

        contactnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnumActionPerformed(evt);
            }
        });
        jPanel1.add(contactnum);
        contactnum.setBounds(160, 240, 202, 38);

        choosenbut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        choosenbut.setForeground(new java.awt.Color(255, 0, 51));
        choosenbut.setText("ImageChoose");
        choosenbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosenbutActionPerformed(evt);
            }
        });
        jPanel1.add(choosenbut);
        choosenbut.setBounds(391, 11, 253, 40);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imagedig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imagedig, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(imagedig, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.add(jDesktopPane1);
        jDesktopPane1.setBounds(391, 62, 253, 290);

        Tabledata.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "FirstName", "LastName", "Id", "Email", "ContactNumber", "Gender"
            }
        ));
        jScrollPane1.setViewportView(Tabledata);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(650, 0, 520, 400);

        Insertbut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Insertbut.setForeground(new java.awt.Color(153, 0, 153));
        Insertbut.setText("Save");
        Insertbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertbutActionPerformed(evt);
            }
        });
        jPanel1.add(Insertbut);
        Insertbut.setBounds(10, 420, 110, 40);

        Update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Update.setForeground(new java.awt.Color(51, 0, 204));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(120, 420, 110, 40);

        Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 51, 51));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(230, 420, 120, 40);

        Clearbut.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Clearbut.setForeground(new java.awt.Color(0, 204, 204));
        Clearbut.setText("Clear All");
        jPanel1.add(Clearbut);
        Clearbut.setBounds(350, 420, 120, 40);

        Show_table.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Show_table.setText("Clik hear to sce document");
        Show_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_tableActionPerformed(evt);
            }
        });
        jPanel1.add(Show_table);
        Show_table.setBounds(789, 418, 330, 36);

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\Saved Pictures\\diu1.jpg")); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, -30, 150, 490);

        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\Saved Pictures\\campus.jpg")); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 400, 980, 80);
        jPanel1.add(Gensss);
        Gensss.setBounds(160, 320, 200, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon("F:\\Saved Pictures\\cam2.jpg")); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(130, 10, 500, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnumberActionPerformed

    private void choosenbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosenbutActionPerformed
        // Create A JFileChooser class because of you can choose image in you local folder:user to choose a file///
        
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        
        filename =f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(imagedig.getWidth(), imagedig.getHeight(), Image.SCALE_DEFAULT));
        imagedig.setIcon(imageIcon);
      try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream (image); //********reading data from file ////
            ByteArrayOutputStream bos= new ByteArrayOutputStream(); //*******writing data into byte array:size of buffer grows automatically //
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
             Component frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Comfirm ","myloginapp1",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_NO_OPTION) {
            System.exit(0);
           
        } 
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
        
        ///////////////end of ////////////////////////
    }//GEN-LAST:event_choosenbutActionPerformed

    private void InsertbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertbutActionPerformed
        // Datacommand:
        conn = myloginapp1.MySqlConnect.ConnectDB();
        String Sql = "insert into login(FirstName,LastName,ID,Email,ContactNumber,Gender) values(?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement (Sql);
            pst.setString(1,Firstname.getText());
            pst.setString(2, lastname.getText());
            pst.setString(3,idnumber.getText());
            pst.setString(4,email.getText());
            pst.setString(5,contactnum.getText());
           
            pst.setString(6, gender);
           
          
            pst.execute();
          
             Component frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Comfirm ","point of sale",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_NO_OPTION) {
            System.exit(0);
           
        } 
        }
        catch (Exception e)  {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_InsertbutActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
        gender ="male";
    }//GEN-LAST:event_MaleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender = "female";
    }//GEN-LAST:event_femaleActionPerformed

    private void Show_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_tableActionPerformed
        // TODO add your handling code here:
        show_Table (); //call methord
    }//GEN-LAST:event_Show_tableActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         conn = myloginapp1.MySqlConnect.ConnectDB();
        String Sql = "update login set FirstName=?,LastName=?,ContactNumber=?,Email=?,Gender= ? where Id=?";
        try {
            pst = conn.prepareStatement (Sql);
            
            pst.setString(1,Firstname.getText());
            pst.setString(2, lastname.getText());
            pst.setString(3,contactnum.getText());
            pst.setString(4,email.getText());
            pst.setString(5, gender);
            pst.setString(6, idnumber.getText());
            pst.execute();
           
            Component frame = new JFrame("Exit");
           //JOptionPane.showMessageDialog(null, "Successfully!!!");
            if(JOptionPane.showConfirmDialog(frame, "Comfirm ","My login project",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_NO_OPTION) {
            System.exit(0);
           
        } 
        }
        catch (Exception e)  {
            JOptionPane.showMessageDialog(null, e);
        }
       
       
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
          conn = myloginapp1.MySqlConnect.ConnectDB();
        String Sql = "delete from login where Id=?";
        try {
            pst = conn.prepareStatement (Sql);
           
            pst.setString(1,idnumber.getText());
            pst.execute();
              // JOptionPane.showMessageDialog(null, "Successfully!!!");
              Component frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Comfirm ","My login project",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_NO_OPTION) {
            System.exit(0);
           
        } 
        }
        catch (Exception e)  {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        // TODO add your handling code here:
         conn = myloginapp1.MySqlConnect.ConnectDB();
        String Sql = "Select * from login where FirstName= ?";
        try {
            pst = conn.prepareStatement (Sql);
            pst.setString(1,Search.getText());
            
              rs=pst.executeQuery();
          
                  if (rs.next())  {
               String add1 = rs.getString("FirstName");
                Firstname.setText(add1);
                String add2 = rs.getString("LastName");
                lastname.setText(add2);
                String add3 = rs.getString("Id");
                idnumber.setText(add3);
                String add4 = rs.getString("Email");
                email.setText(add4);
                String add5 = rs.getString("ContactNumber");
                contactnum.setText(add5);
                
                
                String add6 = rs.getString("Gender");
             // String value= Gensss.getItemListeners().toString();
                Gensss.setText(add6);
                  
               
               
                //String add8 = rs.getString("image");
               //imagesave.setText(add8);
                // imagesave.setIcon(imageIcon);
                 //person_image.getText(add8);
                
              //JOptionPane.showMessageDialog(null, "Successfully!!");
              
                Component frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Comfirm ","My login project",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_NO_OPTION) {
            System.exit(0);
           
        } 
            
                  }
        }
        catch (Exception e)  {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchKeyReleased

    private void contactnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnumActionPerformed

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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearbut;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Firstname;
    private javax.swing.JTextField Gensss;
    private javax.swing.JButton Insertbut;
    private javax.swing.JCheckBox Male;
    private javax.swing.JTextField Search;
    private javax.swing.JButton Show_table;
    private javax.swing.JTable Tabledata;
    private javax.swing.JButton Update;
    private javax.swing.JButton choosenbut;
    private javax.swing.JTextField contactnum;
    private javax.swing.JTextField email;
    private javax.swing.JCheckBox female;
    private javax.swing.JTextField idnumber;
    private javax.swing.JLabel imagedig;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    // End of variables declaration//GEN-END:variables

    
 
    private ImageIcon format =null;
    //strin filename
    String filename = null;
    byte[] person_image = null;
    
    private String gender;
    
    
}
