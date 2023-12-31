
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingWorker;
import javax.swing.JProgressBar;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

//By Javier Castillo
public class registerForm extends javax.swing.JFrame {

    public registerForm() {
        setUndecorated(true);
        initComponents();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x, y);

        TypePassword.setBackground(new Color(255, 255, 255, 0));
        typeUsername.setBackground(new Color(255, 255, 255, 0));
        typeEmail.setBackground(new Color(255, 255, 255, 0));
        typeName.setBackground(new Color(255, 255, 255, 0));

        noVisible.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TypePassword.setEchoChar((char) 0);
                noVisible.setVisible(false);
                visible.setVisible(true);
            }
        });

        visible.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                TypePassword.setEchoChar('*');
                noVisible.setVisible(true);
                visible.setVisible(false);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Register = new javax.swing.JLabel();
        logoHere = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        typeName = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        line1 = new javax.swing.JLabel();
        typeEmail = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        line2 = new javax.swing.JLabel();
        TypePassword = new javax.swing.JPasswordField();
        noVisible = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        line3 = new javax.swing.JLabel();
        typeUsername = new javax.swing.JTextField();
        visible = new javax.swing.JLabel();
        registerBoton = new javax.swing.JLabel();
        boton = new javax.swing.JLabel();
        alreadyHaveAnAccount = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Register.setFont(new java.awt.Font("Roboto Black", 0, 28)); // NOI18N
        Register.setText("Register");
        jPanel1.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        logoHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fireLogo.png"))); // NOI18N
        jPanel1.add(logoHere, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 50, 50));

        Name.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Name.setText("Name");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        line.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        line.setText("__________________________________________________________");
        jPanel1.add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 310, -1));

        typeName.setBackground(new java.awt.Color(228, 201, 9));
        typeName.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        typeName.setBorder(null);
        jPanel1.add(typeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 280, 30));

        Email.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Email.setText("Email");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        line1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        line1.setText("__________________________________________________________");
        jPanel1.add(line1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 310, -1));

        typeEmail.setBackground(new java.awt.Color(228, 201, 9));
        typeEmail.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        typeEmail.setBorder(null);
        jPanel1.add(typeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 280, 30));

        password.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        password.setText("Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        line2.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        line2.setText("__________________________________________________________");
        jPanel1.add(line2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 290, -1));

        TypePassword.setBackground(new java.awt.Color(228, 201, 9));
        TypePassword.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        TypePassword.setBorder(null);
        jPanel1.add(TypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 280, 30));

        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/novisible.png"))); // NOI18N
        jPanel1.add(noVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        Username.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Username.setText("Username");
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        line3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        line3.setText("__________________________________________________________");
        jPanel1.add(line3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 310, -1));

        typeUsername.setBackground(new java.awt.Color(228, 201, 9));
        typeUsername.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        typeUsername.setBorder(null);
        jPanel1.add(typeUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 280, 30));

        visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/visible.png"))); // NOI18N
        jPanel1.add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        registerBoton.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        registerBoton.setForeground(new java.awt.Color(255, 255, 102));
        registerBoton.setText("      Register");
        registerBoton.setToolTipText("");
        registerBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBotonMouseClicked(evt);
            }
        });
        jPanel1.add(registerBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 170, 40));

        boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/botonInvert.png"))); // NOI18N
        jPanel1.add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 170, 40));

        alreadyHaveAnAccount.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        alreadyHaveAnAccount.setText("Already have an account?");
        jPanel1.add(alreadyHaveAnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        Login.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        Login.setForeground(new java.awt.Color(102, 255, 0));
        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        jPanel1.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/x.png"))); // NOI18N
        x2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x2MouseClicked(evt);
            }
        });
        jPanel1.add(x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 30, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fondoInvert.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JProgressBar progressBar;
    private SwingWorker<Void, Void> registrationWorker;
    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        loginForm login = new loginForm();
        login.setVisible(true);

        dispose();
    }//GEN-LAST:event_LoginMouseClicked

    private void registerBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBotonMouseClicked
        String name = typeName.getText();
        String email = typeEmail.getText();
        String username = typeUsername.getText();
        String password = new String(TypePassword.getPassword());

        boolean hasEmptyFields = false;

        if (name.isEmpty()) {
            typeName.setText("Name is required");
            hasEmptyFields = true;
        }

        if (email.isEmpty()) {
            typeEmail.setText("Email is required");
            hasEmptyFields = true;
        }

        if (username.isEmpty()) {
            typeUsername.setText("Username is required");
            hasEmptyFields = true;
        }

        if (password.isEmpty()) {
            TypePassword.setText("Password is required");
            hasEmptyFields = true;
        }

        typeName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (typeName.getText().equals("Name is required")) {
                    typeName.setText("");
                }
            }
        });

        typeEmail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (typeEmail.getText().equals("Email is required")) {
                    typeEmail.setText("");
                }
            }
        });

        typeUsername.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (typeUsername.getText().equals("Username is required")) {
                    typeUsername.setText("");
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
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Usuario\\OneDrive\\Documentos\\NetBeansProjects\\Login\\users.txt", true)); // Abre el archivo en modo "append"
                writer.write(name + "," + email + "," + username + "," + password);
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Register successful", "Success", JOptionPane.INFORMATION_MESSAGE);

            loginForm login = new loginForm();
            login.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_registerBotonMouseClicked

    private void x2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_x2MouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Register;
    private javax.swing.JPasswordField TypePassword;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel alreadyHaveAnAccount;
    private javax.swing.JLabel boton;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel line;
    private javax.swing.JLabel line1;
    private javax.swing.JLabel line2;
    private javax.swing.JLabel line3;
    private javax.swing.JLabel logoHere;
    private javax.swing.JLabel noVisible;
    private javax.swing.JLabel password;
    private javax.swing.JLabel registerBoton;
    private javax.swing.JTextField typeEmail;
    private javax.swing.JTextField typeName;
    private javax.swing.JTextField typeUsername;
    private javax.swing.JLabel visible;
    private javax.swing.JLabel x2;
    // End of variables declaration//GEN-END:variables
}
