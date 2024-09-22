
package mart;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

public class PanelLogin extends javax.swing.JPanel {
    private JLabel titleLogin;
    private JLabel labelEmail;
    private JTextField txtEmail;
    private JLabel labelErrEmail;
    private JLabel labelPassword;
    private JPasswordField txtPassword;
    private JLabel labelErrPassword;
    private JLabel labelForgotPassword;
    private JButton btnLogin;
    
    
    public PanelLogin(Mart frame) {
        initComponents();
        init(frame);
    }

    public void init(Mart frame) {
        // setting panel
        setBackground(Color.WHITE);
        setOpaque(true);
        setBounds(0, 0, 379, 538);

        // label login
        titleLogin = new JLabel("Login");
        titleLogin.setFont(new Font("sansserif", Font.BOLD, 30));
        titleLogin.setForeground(Color.BLACK);
        titleLogin.setBounds(140, 50, 100, 40);
        add(titleLogin);

        // label email
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(70, 120, 80, 25);
        add(labelEmail);
        
        // label error email
        labelErrEmail = new JLabel("");
        labelErrEmail.setBounds(70, 175, 100, 20);
        labelErrEmail.setFont(new Font("sansserif", Font.ITALIC, 11));
        labelErrEmail.setForeground(Color.RED);
        add(labelErrEmail);
        
        // textbox email
        txtEmail = new JTextField();
        txtEmail.setBounds(70, 150, 230, 30);
        add(txtEmail);

        // label password
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(70, 195, 80, 25);
        add(labelPassword);

        // textbox password
        txtPassword = new JPasswordField();
        txtPassword.setBounds(70, 220, 230, 30);
        add(txtPassword);
        
        // label error password
        labelErrPassword = new JLabel("");
        labelErrPassword.setBounds(70, 245, 100, 20);
        labelErrPassword.setFont(new Font("sansserif", Font.ITALIC, 11));
        labelErrPassword.setForeground(Color.RED);
        add(labelErrPassword);

        // label forgot password
        labelForgotPassword = new JLabel("Forgot Password?");
        labelForgotPassword.setForeground(new Color(31, 152, 238));
        labelForgotPassword.setBounds(70, 280, 230, 25);
        add(labelForgotPassword);

        // button login
        btnLogin = new JButton();
        btnLogin.setBackground(new Color(48, 197, 52));
        btnLogin.setFocusPainted(false);
        btnLogin.setForeground(Color.BLACK);
        btnLogin.setMaximumSize(new java.awt.Dimension(120, 40));
        btnLogin.setBounds(70, 320, 230, 45);
        btnLogin.setText("Login");
        btnLogin.setFont(new Font("sansserif", Font.BOLD, 18)); 
        add(btnLogin);

        // Add action listener for "Forgot Password?" label
        labelForgotPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                // Replace the content pane of the frame with PanelResetPassword
                PanelResetPassword panelResetPassword = new PanelResetPassword(frame);
                frame.setContentPane(panelResetPassword);
                frame.revalidate(); // Refresh the frame to show the new panel
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                labelForgotPassword.setForeground(new Color(95, 188, 254));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                labelForgotPassword.setForeground(new Color(31, 152, 238));
            }
        });
        
        // Add MouseListener to button login
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String email = txtEmail.getText().trim();
                String password = (new String(txtPassword.getPassword()).trim());
                                
                if(email.isEmpty() && password.isEmpty()){
                    labelErrEmail.setText("input email!");
                    txtEmail.setBorder(new LineBorder(Color.RED, 2));
                    labelErrPassword.setText("input password!");
                    txtPassword.setBorder(new LineBorder(Color.RED, 2));
                }
                else if(email.isEmpty()){
                    labelErrEmail.setText("input email!");
                    txtEmail.setBorder(new LineBorder(Color.RED, 2));
                }
                else if(password.isEmpty()){
                    labelErrPassword.setText("input password!");
                    txtPassword.setBorder(new LineBorder(Color.RED, 2));
                }
                else{
                    try{
                        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
                        Connection connection = connectionDatabase.connect();
                        if(authenticateUser(connection, email, password)){
                            
                            frame.setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(frame, "Invalid email or password.");
                            txtEmail.setText("");
                            txtPassword.setText("");
                        }
                        connection.close();
                    }
                    catch(SQLException ex){
                        ex.printStackTrace(); // Handle SQL exceptions
                    }
                }
            }
            private static boolean authenticateUser(Connection connection, String email, String password) {
                String query = "SELECT * FROM tbl_user WHERE email = ? AND password = ?"; // Replace 'users' with your table name
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, email);
                    preparedStatement.setString(2, password);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    return resultSet.next(); // Returns true if a record is found
                } catch (SQLException e) {
                    e.printStackTrace(); // Handle SQL exceptions
                }
                return false;
            }
        });
        
        // clear message error on text field email
        txtEmail.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                labelErrEmail.setText("");
                txtEmail.setBorder(new LineBorder(Color.BLACK, 1));
            }
        });
        
        // clear message error on text field password
        txtPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                labelErrPassword.setText("");
                txtPassword.setBorder(new LineBorder(Color.BLACK, 1));
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
