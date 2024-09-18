
package mart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;



public class PanelCategory extends javax.swing.JPanel {
    
    private JButton btnAdd;
    private JLabel labelTitlePage;
    private JLabel labelSearch;
    private JTextField txtSearch;
    
    public PanelCategory(Master frame) {
        initComponents();
        init(frame);
    }
    
    public final void init(Master frame){
        setBackground(new Color(241, 243, 244));
        setPreferredSize(new Dimension(1100, 800));
        setOpaque(true);
        setLayout(null);
        
        // title page
        labelTitlePage = new JLabel("Category");
        labelTitlePage.setFont(new java.awt.Font("SansSerif", Font.BOLD, 20));
        labelTitlePage.setBounds(50, 50, 150, 50);
        add(labelTitlePage);
        
        // search box
        txtSearch = new JTextField();
        txtSearch.setFont(new java.awt.Font("SansSerif", Font.PLAIN, 14));
        txtSearch.setBounds(90, 150, 230, 30);
        add(txtSearch);
        
        // search
        labelSearch = new JLabel();
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/images/search.png"));
        Image scaledImage = logoIcon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        labelSearch.setIcon(new ImageIcon(scaledImage));
        labelSearch.setBounds(330, 150, 30, 30);
        add(labelSearch);
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
