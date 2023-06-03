import java.awt.Taskbar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Database.JavaJDBC;
import java.sql.ResultSet;
import com.sportsinventory.DAO.AdminDAO;
import com.sportsinventory.DAO.UserDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author strix
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/Resources/logoTransparent.png"));
        //For Microsoft Windows
        setIconImage(logoIcon.getImage());
        final Taskbar taskbar = Taskbar.getTaskbar() ;
        try {taskbar. setIconImage (logoIcon.getImage ( )) ;} catch (final Exception e) {}

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        usernameText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        passwordFIeld = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HomePage");
        setBounds(new java.awt.Rectangle(0, 0, 960, 540));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
        setMinimumSize(new java.awt.Dimension(960, 540));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setOpaque(false);

        usernameText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        usernameText.setForeground(new java.awt.Color(255, 255, 255));
        usernameText.setText("Username:");
        usernameText.setMaximumSize(new java.awt.Dimension(150, 30));
        usernameText.setMinimumSize(new java.awt.Dimension(150, 30));
        usernameText.setPreferredSize(new java.awt.Dimension(150, 30));

        passwordText.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        passwordText.setForeground(new java.awt.Color(255, 255, 255));
        passwordText.setText("Password:");
        passwordText.setMaximumSize(new java.awt.Dimension(150, 30));
        passwordText.setMinimumSize(new java.awt.Dimension(150, 30));
        passwordText.setPreferredSize(new java.awt.Dimension(150, 30));

        usernameField.setMaximumSize(new java.awt.Dimension(210, 30));
        usernameField.setMinimumSize(new java.awt.Dimension(210, 30));
        usernameField.setPreferredSize(new java.awt.Dimension(210, 30));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        login.setText("Log In");
        login.setMaximumSize(new java.awt.Dimension(150, 30));
        login.setMinimumSize(new java.awt.Dimension(150, 30));
        login.setPreferredSize(new java.awt.Dimension(150, 30));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        passwordFIeld.setText("jPasswordField1");
        passwordFIeld.setMaximumSize(new java.awt.Dimension(210, 30));
        passwordFIeld.setMinimumSize(new java.awt.Dimension(210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoTransparent.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordFIeld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(usernameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordFIeld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        logo.setMaximumSize(new java.awt.Dimension(50, 50));
        jLayeredPane1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg1.png"))); // NOI18N
        jLayeredPane1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_usernameFieldActionPerformed

    
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        
        String username = usernameField.getText();
        String password = passwordFIeld.getText();
        
        if(username.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter your username!");
        }
        else if(password.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter your password!");
        }
        else if(new JavaJDBC().adminLogin(username, password))
        {
            ResultSet rs = new AdminDAO().getAdminDAO(username);
            super.dispose();
            AdminMainPage adminMainPage = null;
            try {
                if (rs.next())
                    adminMainPage = new AdminMainPage(rs.getString("fullname"), "COHORT3 CECS");
            } catch (SQLException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (adminMainPage != null) adminMainPage.setVisible(true);           
        }
        else if(new JavaJDBC().userLogin(username, password))
        {
            ResultSet rs = new UserDAO().getUserDAO(username);
            super.dispose();
            AtheleteMainPage atheleteMainPage = null;
            try {
                if (rs.next())
                    atheleteMainPage = new AtheleteMainPage(rs.getString("fullname"), "COHORT3 CECS");
            } catch (SQLException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (atheleteMainPage != null) atheleteMainPage.setVisible(true);
        }
        else
        {
            System.out.println(username + " " + password);
            JOptionPane.showMessageDialog(null, "Invalid username or password.");
        }            
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passwordFIeld;
    private javax.swing.JLabel passwordText;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}
