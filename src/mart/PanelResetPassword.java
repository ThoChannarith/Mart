/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mart;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;


public class PanelResetPassword extends javax.swing.JPanel {

    private JLabel titleReset;
    private JLabel labelEmail;
    private JLabel labelErrEmail;
    private JLabel labelNewPassword;
    private JLabel labelErrNewPassword;
    private JLabel labelConfirmPassword;
    private JLabel labelErrConfirmPassword;
    private JTextField txtEmail;
    private JPasswordField txtNewPassword;
    private JPasswordField txtConfirmPassword;
    private JButton btnConfirm;
    private JButton btnCancel;
    
    public PanelResetPassword(Mart frame) {
        initComponents();
        init(frame);
    }
    
    public void init(Mart frame){
        // setting panel
        setBackground(Color.WHITE);
        setOpaque(true);
        setBounds(0, 0, 379, 538);
        
        // label reset password
        titleReset = new JLabel("Reset Password");
        titleReset.setFont(new Font("sansserif", Font.BOLD, 30));
        titleReset.setForeground(Color.BLACK);
        titleReset.setBounds(65, 50, 300, 40);
        add(titleReset);
        
        // label email
        labelEmail = new JLabel("Email");
        labelEmail.setBounds(70,120,150,25);
        add(labelEmail);
        
        // label error email
        labelErrEmail = new JLabel("");
        labelErrEmail.setBounds(70, 175, 100, 20);
        labelErrEmail.setFont(new Font("sansserif", Font.ITALIC, 11));
        labelErrEmail.setForeground(Color.RED);
        add(labelErrEmail);
        
        // textbox email
        txtEmail = new JTextField("");
        txtEmail.setBounds(70, 150, 230, 30);
        add(txtEmail);
        
        // label new password
        labelNewPassword = new JLabel("New Password");
        labelNewPassword.setBounds(70, 195, 150, 25);
        add(labelNewPassword);
        
        // textbox new password
        txtNewPassword = new JPasswordField();
        txtNewPassword.setBounds(70,220,230,30);
        add(txtNewPassword);
        
        // label error new password
        labelErrNewPassword = new JLabel("");
        labelErrNewPassword.setBounds(70, 245, 150, 20);
        labelErrNewPassword.setFont(new Font("sansserif", Font.ITALIC, 11));
        labelErrNewPassword.setForeground(Color.RED);
        add(labelErrNewPassword);
        
        // label confirm password
        labelConfirmPassword = new JLabel("Confirm Password");
        labelConfirmPassword.setBounds(70, 270, 150, 25);
        add(labelConfirmPassword);
        
        // text field confirm password
        txtConfirmPassword = new JPasswordField();
        txtConfirmPassword.setBounds(70,295,230,30);
        add(txtConfirmPassword);
        
        labelErrConfirmPassword = new JLabel("");
        labelErrConfirmPassword.setBounds(70, 320, 150, 20);
        labelErrConfirmPassword.setFont(new Font("sansserif", Font.ITALIC, 11));
        labelErrConfirmPassword.setForeground(Color.RED);
        add(labelErrConfirmPassword);
        
        // button confirm
        btnConfirm = new JButton();
        btnConfirm.setBackground(new Color(48, 197, 52));
        btnConfirm.setFocusPainted(false);
        btnConfirm.setForeground(Color.BLACK);
        //btnConfirm.setMaximumSize(new java.awt.Dimension(120, 40));
        btnConfirm.setBounds(70,360, 230, 45);
        btnConfirm.setText("Confirm");
        btnConfirm.setFont(new Font("sansserif", Font.BOLD, 18));
        add(btnConfirm);
        
        // button cancel
        btnCancel = new JButton();
        btnCancel.setBackground(new Color(255, 30, 30));
        btnCancel.setFocusPainted(false);
        btnCancel.setForeground(Color.BLACK);
        btnCancel.setBounds(70,420, 230, 45);
        btnCancel.setText("Cancel");
        btnCancel.setFont(new Font("sansserif", Font.BOLD, 18));
        add(btnCancel);
        
        // add event on button confirm
        btnConfirm.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                String email = txtEmail.getText().trim();
                String newPassword = (new String(txtNewPassword.getPassword()).trim());
                String confirmPassword = (new String(txtConfirmPassword.getPassword()).trim());
                if(email.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()){
                    labelErrEmail.setText("input email!");
                    txtEmail.setBorder(new LineBorder(Color.RED, 2));
                    labelErrNewPassword.setText("input password!");
                    txtNewPassword.setBorder(new LineBorder(Color.RED, 2));
                    labelErrConfirmPassword.setText("input password!");
                    txtConfirmPassword.setBorder(new LineBorder(Color.RED, 2));
                }
                else if(newPassword.isEmpty()){
                    labelErrNewPassword.setText("input password!");
                    txtNewPassword.setBorder(new LineBorder(Color.RED, 2));
                }
                else if(confirmPassword.isEmpty()){
                    labelErrConfirmPassword.setText("input password!");
                    txtConfirmPassword.setBorder(new LineBorder(Color.RED, 2));
                }
                else if(email.isEmpty()){
                    labelErrEmail.setText("input email!");
                    txtEmail.setBorder(new LineBorder(Color.RED, 2));
                }
                else if(newPassword != confirmPassword){
                    labelErrConfirmPassword.setText("password not match!");
                    txtConfirmPassword.setBorder(new LineBorder(Color.RED, 2));
                }
                else{
                
                }
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
        
        // clear message error on text field new password
        txtNewPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                labelErrNewPassword.setText("");
                txtNewPassword.setBorder(new LineBorder(Color.BLACK, 1));
            }
        });
        
        // clear message error on text field confirm password
        txtConfirmPassword.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                labelErrConfirmPassword.setText("");
                txtConfirmPassword.setBorder(new LineBorder(Color.BLACK, 1));
            }
        });
        
        
        
        // add event on button cancel
        btnCancel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                PanelLogin panelLogin = new PanelLogin(frame);
                frame.setContentPane(panelLogin);
                frame.revalidate();
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
