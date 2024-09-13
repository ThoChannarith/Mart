
package mart;

import java.awt.Color;
import java.awt.Dimension;


public class PanelCategory extends javax.swing.JPanel {


    public PanelCategory(Master frame) {
        initComponents();
        init(frame);
    }
    public void init(Master frame){
        setBackground(Color.WHITE);
        setOpaque(true);
        setPreferredSize(new Dimension(1200,900));
        setBounds(300,0,1200,900);
        setLayout(null);
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
