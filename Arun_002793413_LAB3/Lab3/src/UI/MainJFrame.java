/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.Application;
import UI.MedicineAssignJPanel;

/**
 *
 * @author Arun
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private Application application;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        
        this.application=new Application();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlPanel = new javax.swing.JPanel();
        assignBtn = new javax.swing.JButton();
        createObservationBtn = new javax.swing.JButton();
        viewVitalBtn = new javax.swing.JButton();
        medCatalogBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlPanel.setBackground(new java.awt.Color(255, 255, 204));
        ControlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignBtn.setText("Assign Medicine");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(assignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        createObservationBtn.setText("Create Observation");
        createObservationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createObservationBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(createObservationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        viewVitalBtn.setText("Vital Sign History");
        viewVitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(viewVitalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        medCatalogBtn.setText("Medicine Catalog");
        medCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medCatalogBtnActionPerformed(evt);
            }
        });
        ControlPanel.add(medCatalogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jSplitPane1.setLeftComponent(ControlPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_assignBtnActionPerformed

    private void createObservationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createObservationBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CreateJPanel(this.application));
    }//GEN-LAST:event_createObservationBtnActionPerformed

    private void viewVitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new viewJPanel(this.application));
    }//GEN-LAST:event_viewVitalBtnActionPerformed

    private void medCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medCatalogBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new CatalogJPanel(this.application));
    }//GEN-LAST:event_medCatalogBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton createObservationBtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton medCatalogBtn;
    private javax.swing.JButton viewVitalBtn;
    // End of variables declaration//GEN-END:variables
}