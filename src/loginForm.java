
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

//By Javier Castillo
public class loginForm extends javax.swing.JFrame {

    public loginForm() {

        setUndecorated(true);
        initComponents();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);

        TypePassword.setBackground(new Color(255, 255, 255, 0));
        TypeUsername.setBackground(new Color(255, 255, 255, 0));

        noVisible.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TypePassword.setEchoChar((char) 0);
                noVisible.setVisible(false);
                visible.setVisible(true);
            }

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        visible = new javax.swing.JLabel();
        noVisible = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        rememberMe = new javax.swing.JCheckBox();
        TypeUsername = new javax.swing.JTextField();
        TypePassword = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        logoHere = new javax.swing.JLabel();
        loginBoton = new javax.swing.JLabel();
        boton = new javax.swing.JLabel();
        dontHaveAccount = new javax.swing.JLabel();
        registerHere = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/visible.png"))); // NOI18N
        visible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visibleMouseClicked(evt);
            }
        });
        background.add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/novisible.png"))); // NOI18N
        noVisible.setInheritsPopupMenu(false);
        noVisible.setRequestFocusEnabled(false);
        noVisible.setVerifyInputWhenFocusTarget(false);
        noVisible.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noVisibleMouseClicked(evt);
            }
        });
        background.add(noVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        login.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        login.setText("Login");
        background.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        line2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        line2.setText("__________________________________________________________");
        background.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 290, -1));

        line.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        line.setText("__________________________________________________________");
        background.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 310, -1));

        rememberMe.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        rememberMe.setText("Remember me");
        background.add(rememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        TypeUsername.setBackground(new java.awt.Color(228, 201, 9));
        TypeUsername.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        TypeUsername.setBorder(null);
        background.add(TypeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 280, 30));

        TypePassword.setBackground(new java.awt.Color(228, 201, 9));
        TypePassword.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        TypePassword.setBorder(null);
        background.add(TypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 280, 30));

        password.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        password.setText("Password");
        background.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        username.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        username.setText("Username");
        background.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        logoHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fireLogo.png"))); // NOI18N
        background.add(logoHere, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 50));

        loginBoton.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        loginBoton.setForeground(new java.awt.Color(255, 255, 102));
        loginBoton.setText("         Login");
        loginBoton.setToolTipText("");
        loginBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBotonMouseClicked(evt);
            }
        });
        background.add(loginBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 40));

        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/botonNegroGris.png"))); // NOI18N
        background.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 170, 40));

        dontHaveAccount.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        dontHaveAccount.setText("Don't have account? ");
        background.add(dontHaveAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        registerHere.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        registerHere.setForeground(new java.awt.Color(204, 102, 0));
        registerHere.setText("Register here");
        registerHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerHereMouseClicked(evt);
            }
        });
        background.add(registerHere, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        forgotPassword.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(51, 255, 0));
        forgotPassword.setText("Forgot password?");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });
        background.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        x.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/x.png"))); // NOI18N
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        background.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoGradiente2.png"))); // NOI18N
        background.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerHereMouseClicked

        registerForm register = new registerForm();
        register.setVisible(true);

        dispose();
    }//GEN-LAST:event_registerHereMouseClicked

    private void loginBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBotonMouseClicked

        String username = TypeUsername.getText();
        String password = new String(TypePassword.getPassword());

        boolean hasEmptyFields = false;

        if (username.isEmpty()) {
            TypeUsername.setText("Username is required");
            hasEmptyFields = true;

        }

        if (password.isEmpty()) {
            TypePassword.setText("Password is required");
            hasEmptyFields = true;
        }

        TypeUsername.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (TypeUsername.getText().equals("Username is required")) {
                    TypeUsername.setText("");
                }

            }

        });

        TypePassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (TypePassword.getText().equals("Password is required")) {
                    TypePassword.setText("");
                }

            }

        });

        if (!hasEmptyFields) {
            boolean credentialsMatch = false;
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\OneDrive\\Documentos\\NetBeansProjects\\Login\\users.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 4) {
                        String storedUsername = parts[2];
                        String storedPassword = parts[3];
                        if (username.equals(storedUsername) && password.equals(storedPassword)) {
                            credentialsMatch = true;
                            break;
                        }
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (credentialsMatch) {
                JOptionPane.showMessageDialog(this, "Login successful", "Success", JOptionPane.INFORMATION_MESSAGE);

            } else {
                TypeUsername.setText("Invalid username or password");
                TypePassword.setText("");
            }
            TypeUsername.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (TypeUsername.getText().equals("Invalid username or password")) {
                        TypeUsername.setText("");
                    }
                }
            });
        }

    }//GEN-LAST:event_loginBotonMouseClicked

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        recoveryPassword recoveryPasswordForm = new recoveryPassword();

        recoveryPasswordForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_forgotPasswordMouseClicked

    private void noVisibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noVisibleMouseClicked
        if (TypePassword.getEchoChar() == '\0') {

            TypePassword.setEchoChar('*');
            noVisible.setVisible(true);
            visible.setVisible(false);
        } else {

            TypePassword.setEchoChar('\0');
            noVisible.setVisible(false);
            visible.setVisible(true);
        }
    }//GEN-LAST:event_noVisibleMouseClicked

    private void visibleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visibleMouseClicked
        if (TypePassword.getEchoChar() == '\0') {

            TypePassword.setEchoChar('*');
            noVisible.setVisible(true);
            visible.setVisible(false);
        } else {

            TypePassword.setEchoChar('\0');
            noVisible.setVisible(false);
            visible.setVisible(true);
        }
    }//GEN-LAST:event_visibleMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TypePassword;
    private javax.swing.JTextField TypeUsername;
    private javax.swing.JPanel background;
    private javax.swing.JLabel boton;
    private javax.swing.JLabel dontHaveAccount;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel login;
    private javax.swing.JLabel loginBoton;
    private javax.swing.JLabel logoHere;
    private javax.swing.JLabel noVisible;
    private javax.swing.JLabel password;
    private javax.swing.JLabel registerHere;
    private javax.swing.JCheckBox rememberMe;
    private javax.swing.JLabel username;
    private javax.swing.JLabel visible;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
