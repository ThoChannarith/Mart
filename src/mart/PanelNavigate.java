
package mart;

import java.awt.BorderLayout;
import java.awt.Color;
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
    
    public PanelNavigate(Master frame) {
        initComponents();
        init(frame);
    }
    
    public void init(Master frame){
        setBackground(Color.WHITE);
        setOpaque(true);
        setPreferredSize(new Dimension(250, 900)); // Set the preferred size of the panel
        setLayout(new BorderLayout());
        setLayout(null); // Using null layout for absolute positioning
        
        // label logo
        labelLogo = new JLabel();
        labelLogo.setHorizontalAlignment(JLabel.CENTER);  // Center the logo horizontally
        // Set an icon for the label 
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/logo.jpg"));  // Load the image
        // Optionally scale the image to fit the label size
        Image scaledImage = logoIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        labelLogo.setIcon(new ImageIcon(scaledImage));
        labelLogo.setBounds(0, 0, 250, 150); 
        add(labelLogo); // Add the label to the top of the panel
        
        
        // button dashboard
        ImageIcon iconDashboard = new ImageIcon(getClass().getResource("/images/dashboard.png"));
        Image imgD = iconDashboard.getImage(); // transform it
        Image ImgDashboard = imgD.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconDashboard = new ImageIcon(ImgDashboard); // transform it back
        btnDashboard = new JButton("  Dashboard");
        btnDashboard.setIcon(iconDashboard);
        btnDashboard.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnDashboard.setForeground(Color.BLACK);
        // Remove border and background
        btnDashboard.setBorderPainted(false); // Remove the border
        btnDashboard.setContentAreaFilled(false); // Remove the background fill
        btnDashboard.setFocusPainted(false); // Remove the focus rectangle
        btnDashboard.setBounds(15, 160, 190, 30);
        btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnDashboard.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnDashboard); // Add button dashboard 
        
        
        // button sale
        ImageIcon iconSale = new ImageIcon(getClass().getResource("/images/sale.png"));
        Image imgS = iconSale.getImage(); // transform it
        Image ImgSale = imgS.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconSale = new ImageIcon(ImgSale); // transform it back
        btnSale = new JButton("  Sale");
        btnSale.setIcon(iconSale);
        btnSale.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnSale.setForeground(Color.BLACK);
        // Remove border and background
        btnSale.setBorderPainted(false); // Remove the border
        btnSale.setContentAreaFilled(false); // Remove the background fill
        btnSale.setFocusPainted(false); // Remove the focus rectangle
        btnSale.setBounds(15, 205, 190, 30);
        btnSale.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnSale.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnSale.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnSale); // Add button sale
        
        
        // button category
        ImageIcon iconCategory = new ImageIcon(getClass().getResource("/images/category.png"));
        Image imgC = iconCategory.getImage(); // transform it
        Image ImgCategory = imgC.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconCategory = new ImageIcon(ImgCategory); // transform it back
        btnCategory = new JButton("  Category");
        btnCategory.setIcon(iconCategory);
        btnCategory.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnCategory.setForeground(Color.BLACK);
        // Remove border and background
        btnCategory.setBorderPainted(false); // Remove the border
        btnCategory.setContentAreaFilled(false); // Remove the background fill
        btnCategory.setFocusPainted(false); // Remove the focus rectangle
        btnCategory.setBounds(15, 250, 190, 30);
        btnCategory.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnCategory.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnCategory); // Add button category
        
        
        // button item
        ImageIcon iconItem = new ImageIcon(getClass().getResource("/images/item.png"));
        Image imgI = iconItem.getImage(); // transform it
        Image ImgItem = imgI.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconItem = new ImageIcon(ImgItem); // transform it back
        btnItem = new JButton("  Item");
        btnItem.setIcon(iconItem);
        btnItem.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnItem.setForeground(Color.BLACK);
        // Remove border and background
        btnItem.setBorderPainted(false); // Remove the border
        btnItem.setContentAreaFilled(false); // Remove the background fill
        btnItem.setFocusPainted(false); // Remove the focus rectangle
        btnItem.setBounds(15, 295, 190, 30);
        btnItem.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnItem.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnItem); // Add button item
        
        
        // button purchase
        ImageIcon iconPurchase = new ImageIcon(getClass().getResource("/images/purchase.png"));
        Image imgP = iconPurchase.getImage(); // transform it
        Image ImgPurchase = imgP.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconPurchase = new ImageIcon(ImgPurchase); // transform it back
        btnPurchase = new JButton("  Purchase");
        btnPurchase.setIcon(iconPurchase);
        btnPurchase.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnPurchase.setForeground(Color.BLACK);
        // Remove border and background
        btnPurchase.setBorderPainted(false); // Remove the border
        btnPurchase.setContentAreaFilled(false); // Remove the background fill
        btnPurchase.setFocusPainted(false); // Remove the focus rectangle
        btnPurchase.setBounds(15, 340, 190, 30);
        btnPurchase.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnPurchase.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnPurchase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnPurchase); // Add button purchase
        
        
        // button inventory
        ImageIcon iconInventory = new ImageIcon(getClass().getResource("/images/inventory.png"));
        Image imgIn = iconInventory.getImage(); // transform it
        Image ImgInventory = imgIn.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconInventory = new ImageIcon(ImgInventory); // transform it back
        btnInventory = new JButton("  Inventory");
        btnInventory.setIcon(iconInventory);
        btnInventory.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnInventory.setForeground(Color.BLACK);
        // Remove border and background
        btnInventory.setBorderPainted(false); // Remove the border
        btnInventory.setContentAreaFilled(false); // Remove the background fill
        btnInventory.setFocusPainted(false); // Remove the focus rectangle
        btnInventory.setBounds(15, 385, 190, 30);
        btnInventory.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnInventory.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnInventory); // Add button inventory
        
        
        // button report
        ImageIcon iconReport = new ImageIcon(getClass().getResource("/images/report.png"));
        Image imgR = iconReport.getImage(); // transform it
        Image ImgReport = imgR.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconReport = new ImageIcon(ImgReport); // transform it back
        btnReport = new JButton("  Report");
        btnReport.setIcon(iconReport);
        btnReport.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnReport.setForeground(Color.BLACK);
        // Remove border and background
        btnReport.setBorderPainted(false); // Remove the border
        btnReport.setContentAreaFilled(false); // Remove the background fill
        btnReport.setFocusPainted(false); // Remove the focus rectangle
        btnReport.setBounds(15, 430, 190, 30);
        btnReport.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnReport.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnReport); // Add button report
        
        
        // button setting
        ImageIcon iconSetting = new ImageIcon(getClass().getResource("/images/setting.png"));
        Image imgSe = iconSetting.getImage(); // transform it
        Image ImgSetting = imgSe.getScaledInstance(22, 22, java.awt.Image.SCALE_SMOOTH); // scale it
        iconSetting = new ImageIcon(ImgSetting); // transform it back
        btnSetting = new JButton("  Setting");
        btnSetting.setIcon(iconSetting);
        btnSetting.setFont(new Font("sansserif", Font.PLAIN, 20));
        btnSetting.setForeground(Color.BLACK);
        // Remove border and background
        btnSetting.setBorderPainted(false); // Remove the border
        btnSetting.setContentAreaFilled(false); // Remove the background fill
        btnSetting.setFocusPainted(false); // Remove the focus rectangle
        btnSetting.setBounds(15, 475, 190, 30);
        btnSetting.setHorizontalAlignment(SwingConstants.LEFT);  // Align text and icon to the left
        btnSetting.setHorizontalTextPosition(SwingConstants.RIGHT);  // Ensure the text is to the right of the icon
        btnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Change mouse cursor to hand
        add(btnSetting); // Add button setting
        
        
        // Add mouse listener for hover and click effects
        btnDashboard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnDashboard.setBackground(new Color(214, 234, 248));  // Change background color on hover
                btnDashboard.setForeground(new Color(52, 152, 219));
                btnDashboard.setOpaque(true);  // Make the button opaque to show the background
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
