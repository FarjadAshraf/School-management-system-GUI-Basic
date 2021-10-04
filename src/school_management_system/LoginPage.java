package school_management_system;

import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Forgetpassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("School Management System");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Login Page");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school_management_system/SSUET_Logo.png"))); // NOI18N

        jLabel4.setText("User Name:");

        jLabel5.setText("Password:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Forgetpassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Forgetpassword.setForeground(new java.awt.Color(51, 0, 204));
        Forgetpassword.setText("Forgot Password?");
        Forgetpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetpasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Forgetpassword)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(username)
                                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Forgetpassword)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String un=username.getText();
        String pass=password.getText();
        
        if(un.equals("Admin")&&pass.equals("Admin")){
        Main_menu obj=new Main_menu();
        obj.setVisible(true);
        dispose();
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Invalid Username or Password! Try Again");
            username.setText("");
            password.setText("");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ForgetpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetpasswordMouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(rootPane, "User name ='Admin' and Password='Admin'");
    }//GEN-LAST:event_ForgetpasswordMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //----------------------------------EXCEPTION HANDLING----------------------------------//
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Forgetpassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
// 
//
//public class LoginWindow extends JFrame implements ActionListener {
//    Container container = getContentPane();
//    JLabel userLabel = new JLabel("USERNAME");
//    JLabel passwordLabel = new JLabel("PASSWORD");
//    JTextField userTextField = new JTextField();
//    JPasswordField passwordField = new JPasswordField();
//    JButton loginButton = new JButton("LOGIN");
//    JButton resetButton = new JButton("RESET");
//    JCheckBox showPassword = new JCheckBox("Show Password");
//    private Object MessageDialog;
//
// 
//
//
//    LoginWindow() {
//        setLayoutManager();
//        setLocationAndSize();
//        addComponentsToContainer();
//        addActionEvent();
//         
//    }
//
// 
//
//    public void setLayoutManager() {
//        container.setLayout(null);
//    }

//    public void setLocationAndSize() {
//        userLabel.setBounds(50, 150, 100, 30);
//        passwordLabel.setBounds(50, 220, 100, 30);
//        userTextField.setBounds(150, 150, 150, 30);
//        passwordField.setBounds(150, 220, 150, 30);
//        showPassword.setBounds(150, 250, 150, 30);
//        loginButton.setBounds(50, 300, 100, 30);
//        resetButton.setBounds(200, 300, 100, 30);

//    }
//
// 
//
//    public void addComponentsToContainer() {
//        container.add(userLabel);
//        container.add(passwordLabel);
//        container.add(userTextField);
//        container.add(passwordField);
//        container.add(showPassword);
//        container.add(loginButton);
//        container.add(resetButton);
//    }
//
// 
//
//    public void addActionEvent() {
//        loginButton.addActionListener(this);
//        resetButton.addActionListener(this);
//        showPassword.addActionListener(this);
//    }
//
// 
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == loginButton) {
//            String userText;
//            String pwdText;
//            userText = userTextField.getText();
//            pwdText = passwordField.getText();
//            if (userText.equalsIgnoreCase("Admin") && pwdText.equalsIgnoreCase("Admin")) {
//                JOptionPane.showMessageDialog(this, "Login Successful");
//                Main_menu obj=new Main_menu();
//                obj.setVisible(true);
//                dispose();
//                
//            } else {
//                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
//            }
//
// 
//
//        }
//        if (e.getSource() == resetButton) {
//            userTextField.setText("");
//            passwordField.setText("");
//        }
//        if (e.getSource() == showPassword) {
//            if (showPassword.isSelected()) {
//                passwordField.setEchoChar((char) 0);
//
//            } else {
//                passwordField.setEchoChar('*');
//            }
//      
//           try {
//               for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//      } 
//               }catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//            
//      }
//    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        LoginWindow frame = new LoginWindow();
//        frame.setTitle("Login Form");
//        frame.setVisible(true);
//        frame.setBounds(10, 10, 370, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//
// 
//
//    }
//    
//}
