/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.frames;

import byui.cit260.chooseYourOwnAdventure.control.RescueControl;
import chooseyourownadventure.ChooseYourOwnAdventure;

/**
 *
 * @author Tanner
 */
public class RescueFrame extends javax.swing.JFrame {

    GameMenuFrame gameMenuFrame;

    /**
     * Creates new form RescueOptionsFrame
     */
    public RescueFrame() {
        initComponents();
    }

    public RescueFrame(GameMenuFrame gameMenuFrame) {
        this();
        this.gameMenuFrame = gameMenuFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RescueOptionsLabel = new javax.swing.JLabel();
        jbRaft = new javax.swing.JButton();
        jbFire = new javax.swing.JButton();
        jbMessage = new javax.swing.JButton();
        jbPlane = new javax.swing.JButton();
        jbBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        RescueOptionsLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        RescueOptionsLabel.setText("Rescue Options");

        jbRaft.setText("Build a Raft");
        jbRaft.setActionCommand("Raft");
        jbRaft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRaftActionPerformed(evt);
            }
        });

        jbFire.setText("Build Fire");
        jbFire.setActionCommand("Fire");

        jbMessage.setText("Write Message");
        jbMessage.setActionCommand("Message");

        jbPlane.setText("Call to Plane");
        jbPlane.setActionCommand("Plane");

        jbBack.setText("Back");
        jbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Costs 10 Health Points");

        jLabel2.setText("Costs 10 Health Points");

        jLabel3.setText("Costs 5 Health Points");

        jLabel4.setText("Costs 5 Health Points");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RescueOptionsLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbRaft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbFire)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jbBack)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbMessage)
                                    .addComponent(jbPlane))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RescueOptionsLabel)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRaft)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFire)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMessage)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPlane)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jbBack)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Open the RaftFrame*/
    private void jbRaftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRaftActionPerformed

    }//GEN-LAST:event_jbRaftActionPerformed

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        gameMenuFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbBackActionPerformed

    /*Set button to use RescueControl to generate random rescue outcome*/
    private void jbFireActionPerformed(java.awt.event.ActionEvent evt) {
        RescueControl fire = new RescueControl();
        Fire.setVisible(true);

        this.setVisible(false);
    }

    /*Set button to use RescueControl to generate random rescue outcome*/
    private void jbMessageActionPerformed(java.awt.event.ActionEvent evt) {
        RescueControl rescueControl = new RescueControl();
        rescueControl.setVisible(true);

        this.setVisible(false);
    }

    /*Set button to use RescueControl to generate random rescue outcome*/
    private void jbCallActionPerformed(java.awt.event.ActionEvent evt) {
        RescueControl rescueControl = new RescueControl();
        rescueControl.setVisible(true);

        this.setVisible(false);
    }

    /*Set button to use RescueControl to generate random rescue outcome*/
    private void jbQuitActionPerformed(java.awt.event.ActionEvent evt) {
        ChooseYourOwnAdventure.getGameMenuFrame().setVisible(true);
        this.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(RescueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RescueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RescueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RescueFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RescueFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RescueOptionsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBack;
    private javax.swing.JButton jbFire;
    private javax.swing.JButton jbMessage;
    private javax.swing.JButton jbPlane;
    private javax.swing.JButton jbRaft;
    // End of variables declaration//GEN-END:variables
}
