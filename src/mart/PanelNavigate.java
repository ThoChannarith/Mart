
package mart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelNavigate extends javax.swing.JPanel {

    private JLabel labelLogo;
    private JButton btnDashboard;
    private JButton btnSale;
    private JButton btnCategory;
    private JButton btnItem;
    private JButton btnPurchase;
    private JButton btnInventory;
    private JButton btnReport;
    private JButton btnSetting;
    private JButton[] buttons;  // To store all buttons for easy background management
    
    
    public PanelNavigate(Master frame) {
        initComponents();
        init(frame);
    }
    public void init(Master frame) {
        setBackground(Color.WHITE);
        setOpaque(true);
        setPreferredSize(new Dimension(250, 900)); // Set the preferred size of the panel
        setLayout(new BorderLayout());
        setLayout(null); // Using null layout for absolute positioning
        
        // Label logo
        labelLogo = new JLabel();
        labelLogo.setHorizontalAlignment(JLabel.CENTER);
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/logo.jpg"));
        Image scaledImage = logoIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        labelLogo.setIcon(new ImageIcon(scaledImage));
        labelLogo.setBounds(0, 0, 250, 150);
        add(labelLogo);

        // Initialize buttons
        btnDashboard = createButton("/images/dashboard.png", "Dashboard", 160);
        btnSale = createButton("/images/sale.png", "Sale", 205);
        btnCategory = createButton("/images/category.png", "Category", 250);
        btnItem = createButton("/images/item.png", "Item", 295);
        btnPurchase = createButton("/images/purchase.png", "Purchase", 340);
        btnInventory = createButton("/images/inventory.png", "Inventory", 385);
        btnReport = createButton("/images/report.png", "Report", 430);
        btnSetting = createButton("/images/setting.png", "Setting", 475);

        // Add all buttons to an array for easier management
        buttons = new JButton[]{btnDashboard, btnSale, btnCategory, btnItem, btnPurchase, btnInventory, btnReport, btnSetting};

        // Add action listeners for all buttons
        for (JButton button : buttons) {
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    setButtonBackground(button);
                }
            });
            add(button); // Add button to the panel
        }
    }

    // Method to create buttons
    private JButton createButton(String iconPath, String text, int yPosition) {
        ImageIcon icon = new ImageIcon(getClass().getResource(iconPath));
        Image img = icon.getImage().getScaledInstance(22, 22, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);

        JButton button = new JButton("  " + text);
        button.setIcon(icon);
        button.setFont(new Font("sansserif", Font.PLAIN, 20));
        button.setForeground(Color.BLACK);
        button.setBorderPainted(false);  // Remove the border
        button.setContentAreaFilled(false);  // Remove the background fill
        button.setFocusPainted(false);  // Remove the focus rectangle
        button.setBounds(15, yPosition, 190, 30);
        button.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        button.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));  // Change mouse cursor to hand
        return button;
    }

    // Method to handle button background updates
    private void setButtonBackground(JButton clickedButton) {
        for (JButton btn : buttons) {
            if (btn == clickedButton) {
                btn.setBackground(new Color(214, 234, 248));  // Set background for the clicked button
                btn.setOpaque(true);
                btn.setForeground(new Color(52, 152, 219)); // Change text color for selected button
            } else {
                btn.setBackground(null);  // Reset other buttons to no background
                btn.setOpaque(false);  // Make other buttons transparent again
                btn.setForeground(Color.BLACK); // Reset text color
            }
        }
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
