/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.login;

import functions.HashFactory;
import functions.UserFunctions;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author c29maq1
 */
public class loginView extends javax.swing.JFrame {

    /**
     * Creates new form loginView
     */
    public loginView() {
        initComponents();
        setSize(700, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlRoot = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        keepLoginChk = new javax.swing.JCheckBox();
        loginBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlTitle.setBackground(new java.awt.Color(51, 51, 51));
        pnlTitle.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Faça o seu Login:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 20, 100);
        pnlTitle.add(jLabel1, gridBagConstraints);

        pnlRoot.add(pnlTitle, java.awt.BorderLayout.PAGE_START);

        pnlBody.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Email:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 10, 20);
        pnlBody.add(jLabel4, gridBagConstraints);

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        tfEmail.setPreferredSize(new java.awt.Dimension(300, 38));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 10, 0);
        pnlBody.add(tfEmail, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 20);
        pnlBody.add(jLabel5, gridBagConstraints);

        tfPassword.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        tfPassword.setPreferredSize(new java.awt.Dimension(300, 38));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        pnlBody.add(tfPassword, gridBagConstraints);

        keepLoginChk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keepLoginChk.setText("Manter login?");
        keepLoginChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keepLoginChkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        pnlBody.add(keepLoginChk, gridBagConstraints);

        loginBtn.setBackground(new java.awt.Color(51, 51, 51));
        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Entrar");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 40, 0);
        pnlBody.add(loginBtn, gridBagConstraints);

        jLabel2.setText("Ainda não fez cadastro?");
        jPanel1.add(jLabel2);

        btnCreateAccount.setText("Crie sua conta!");
        btnCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateAccount.setFocusable(false);
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateAccount);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        pnlBody.add(jPanel1, gridBagConstraints);

        pnlRoot.add(pnlBody, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keepLoginChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keepLoginChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keepLoginChkActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        User user = new User();
        boolean result;
        
        if (!tfEmail.getText().equals("") || !String.valueOf(tfPassword.getPassword()).equals("")) {
            // se for diferente de ""
            user.setEmail(tfEmail.getText());
            user.setPass(new HashFactory().getSHA256Hash(String.valueOf(tfPassword.getPassword())));
            
            result = new UserFunctions().chkUser(user.getEmail(), user.getPass());
            if (result) {
                login2FA_view f = new login2FA_view(user.getEmail());
                f.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Email ou Senha incorretos!");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Email ou Senha não podem ser vazios!");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        new view.cadastro.Cadastrar().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox keepLoginChk;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
}
