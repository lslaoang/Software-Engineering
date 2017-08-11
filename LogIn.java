
package softwareengineering;

import javax.swing.JRootPane;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    /** Creates new form LogIn */
    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
        JRootPane rootPane;
      getRootPane().setDefaultButton(logButton);
           }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInPanel = new javax.swing.JPanel();
        logButton = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        UserLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log-In");
        setBackground(new java.awt.Color(0, 153, 51));
        setForeground(new java.awt.Color(204, 204, 0));
        setLocationByPlatform(true);
        setResizable(false);

        LogInPanel.setBackground(new java.awt.Color(0, 102, 0));
        LogInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logButton.setText("Log In");
        logButton.setSelected(true);
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });
        LogInPanel.add(logButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        LogInPanel.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 170, -1));

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        LogInPanel.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 170, -1));

        UserLabel.setForeground(new java.awt.Color(255, 255, 0));
        UserLabel.setText("Username");
        LogInPanel.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        passwordLabel.setForeground(new java.awt.Color(255, 255, 0));
        passwordLabel.setText("Password");
        LogInPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
       if(txtUser.getText().equals("admin") && txtPass.getText().equals("admin")){
           JOptionPane.showMessageDialog(null, "Log In Success!");
           System.exit(0);

       } else{
            JOptionPane.showMessageDialog(null, "Invalid Password!");
            txtUser.setText(null);
            txtPass.setText(null);
       }
    }//GEN-LAST:event_logButtonActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogInPanel;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JButton logButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
