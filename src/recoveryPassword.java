
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

//By Javier Castillo
public class recoveryPassword extends javax.swing.JFrame {

    public recoveryPassword() {

        setUndecorated(true);
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);
        typeEmail.setBackground(new Color(255, 255, 255, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        typeEmail = new javax.swing.JTextField();
        sendEmail = new javax.swing.JLabel();
        sendEmailBoton = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        login.setText("Forgot your password?");
        background.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel1.setText("to recovery your password");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel2.setText("Enter your email and we'll send you a code");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        line1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        line1.setText("__________________________________________________________");
        background.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 290, -1));

        typeEmail.setBackground(new java.awt.Color(228, 201, 9));
        typeEmail.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        typeEmail.setBorder(null);
        background.add(typeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 290, 30));

        sendEmail.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        sendEmail.setForeground(new java.awt.Color(255, 255, 102));
        sendEmail.setText("    Send email");
        sendEmail.setToolTipText("");
        sendEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendEmailMouseClicked(evt);
            }
        });
        background.add(sendEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 170, 40));

        sendEmailBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/botonNegroGris.png"))); // NOI18N
        background.add(sendEmailBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 170, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        background.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 30, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoGradiente2.png"))); // NOI18N
        background.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendEmailMouseClicked
        if (typeEmail.getText().equals("Type your email")) {
            typeEmail.setText("");
        } else {
            String email = typeEmail.getText().trim(); 

            if (email.isEmpty()) {
                typeEmail.setText("Type your email");
            } else {
                if (isValidEmail(email)) {
                    
                    JOptionPane.showMessageDialog(this, "Email sent, please check your email", "Password Recovery", JOptionPane.INFORMATION_MESSAGE);
                    loginForm loginForm = new loginForm();
                    loginForm.setVisible(true);
                } else {
                    typeEmail.setText("Please type a valid email");
                }
            }
        }
    }

    private boolean isValidEmail(String email) {
        
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");


    }//GEN-LAST:event_sendEmailMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        loginForm loginForm = new loginForm();

        loginForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(recoveryPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recoveryPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recoveryPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recoveryPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new recoveryPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel login;
    private javax.swing.JLabel sendEmail;
    private javax.swing.JLabel sendEmailBoton;
    private javax.swing.JTextField typeEmail;
    // End of variables declaration//GEN-END:variables

}
