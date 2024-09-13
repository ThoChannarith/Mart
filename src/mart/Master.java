
package mart;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Master extends javax.swing.JFrame {
    
     private JPanel contentPanel;
    
    public Master() {
        initComponents();
        init();
    }
    public void init() {
        // setting frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 900);
        setLocationRelativeTo(null);  // Then center the frame on the screen
        setResizable(false);
        setVisible(true);
        setLayout(new BorderLayout());
        
        PanelNavigate panelNavigate = new PanelNavigate(this);
        add(panelNavigate, BorderLayout.WEST);
        
        // Center panel for dynamic content
        contentPanel = new JPanel();
        contentPanel.setLayout(new CardLayout());  // Use CardLayout for swapping panels easily
        add(contentPanel, BorderLayout.CENTER);
        
    }
    // Method to swap content in the contentPanel
    public void showPanel(JPanel panel) {
        contentPanel.removeAll();  // Remove any existing content
        contentPanel.add(panel);   // Add the new panel
        contentPanel.revalidate(); // Refresh the panel
        contentPanel.repaint();    // Repaint the panel
    }

    // Getter for the contentPanel
    public JPanel getContentPanel() {
        return contentPanel;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
