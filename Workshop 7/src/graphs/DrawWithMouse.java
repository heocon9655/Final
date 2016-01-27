/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;

/**
 *
 * @author Hung
 */
public class DrawWithMouse extends javax.swing.JFrame {
    Graphics g = null; //for drawing
    Point p1 = null, p2 = null; //beginning point and ending point
    Color color = Color.BLUE; //starting color
    pLines pLines = new pLines(color);
    pEclipse pEllipses = new pEclipse(false, color);
    pRectangle pRectangles = new pRectangle(false, color);
    int index = 0;

    /**
     * Creates new form DrawWithMouse
     */
    public DrawWithMouse() {
        initComponents();
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(rDraw);
        btnGroup.add(rFill);
        setSize(500, 400);
        this.jTabbedPanel.add("Lines", pLines);
        this.jTabbedPanel.add("Ellipses", pEllipses);
        this.jTabbedPanel.add("Rectangles", pRectangles);
        this.rFill.setEnabled(false); //can't choose fill option for lines
        this.rDraw.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pChooser = new javax.swing.JPanel();
        btnColor = new javax.swing.JButton();
        rDraw = new javax.swing.JRadioButton();
        rFill = new javax.swing.JRadioButton();
        jTabbedPanel = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pChooser.setPreferredSize(new java.awt.Dimension(420, 50));

        btnColor.setText("Select Color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        pChooser.add(btnColor);

        rDraw.setText("Draw Only");
        rDraw.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rDrawStateChanged(evt);
            }
        });
        pChooser.add(rDraw);

        rFill.setText("Draw And Fill");
        pChooser.add(rFill);

        getContentPane().add(pChooser, java.awt.BorderLayout.PAGE_START);

        jTabbedPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPanelMouseClicked(evt);
            }
        });
        getContentPane().add(jTabbedPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        color = JColorChooser.showDialog(this, "Choose a colour", Color.BLUE);
        pLines.ChangeColour(color);
        pEllipses.ChangeColour(color);
        pRectangles.ChangeColour(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void jTabbedPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPanelMouseClicked
        // TODO add your handling code here:
        index = this.jTabbedPanel.getSelectedIndex();
        if (index == 0) {
            this.rFill.setEnabled(false);
        } else {
            this.rFill.setEnabled(true);
        }
        switch (index) {
            case 0:
                g = pLines.getGraphics();
                this.rDraw.setSelected(true);
                break;
            case 1:
                g = pEllipses.getGraphics();
                this.rDraw.setSelected(true);
                pEllipses.Fill(false);
                break;
            case 2:
                g = pRectangles.getGraphics();
                this.rDraw.setSelected(true);
                pRectangles.Fill(false);
                break;
        }
        g.setColor(color);
    }//GEN-LAST:event_jTabbedPanelMouseClicked

    private void rDrawStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rDrawStateChanged
        // TODO add your handling code here:
        if (rDraw.isSelected()) {
            pEllipses.Fill(false);
            pRectangles.Fill(false);
        } else {
            pEllipses.Fill(true);
            pRectangles.Fill(true);
        }
    }//GEN-LAST:event_rDrawStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawWithMouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawWithMouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColor;
    private javax.swing.JTabbedPane jTabbedPanel;
    private javax.swing.JPanel pChooser;
    private javax.swing.JRadioButton rDraw;
    private javax.swing.JRadioButton rFill;
    // End of variables declaration//GEN-END:variables
}
