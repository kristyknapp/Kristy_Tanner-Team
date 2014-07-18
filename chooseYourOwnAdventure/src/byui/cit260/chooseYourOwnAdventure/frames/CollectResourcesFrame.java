/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.chooseYourOwnAdventure.frames;

import byui.cit260.chooseYourOwnAdventure.control.GameControl;
import byui.cit260.chooseYourOwnAdventure.control.ResourceControl;
import byui.cit260.chooseYourOwnAdventure.model.Location;
import byui.cit260.chooseYourOwnAdventure.model.Resource;
import chooseyourownadventure.ChooseYourOwnAdventure;

/**
 *
 * @author kristyknapp
 */
public class CollectResourcesFrame extends javax.swing.JFrame {

    /**
     * Creates new form CollectResourcesFrame
     */
    public CollectResourcesFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResources = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrbVines = new javax.swing.JRadioButton();
        jrbRocks = new javax.swing.JRadioButton();
        jrbSleep = new javax.swing.JRadioButton();
        jbSelectResource = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextareaResources = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jbExit = new javax.swing.JButton();
        jrbWater = new javax.swing.JRadioButton();
        jrbFood = new javax.swing.JRadioButton();
        jrbLogs = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        bgResources.add(jrbVines);
        jrbVines.setForeground(new java.awt.Color(255, 255, 255));
        jrbVines.setText("Vines");
        jrbVines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbVinesActionPerformed(evt);
            }
        });

        bgResources.add(jrbRocks);
        jrbRocks.setForeground(new java.awt.Color(255, 255, 255));
        jrbRocks.setText("Rocks");
        jrbRocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRocksActionPerformed(evt);
            }
        });

        bgResources.add(jrbSleep);
        jrbSleep.setForeground(new java.awt.Color(255, 255, 255));
        jrbSleep.setText("Sleep");
        jrbSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSleepActionPerformed(evt);
            }
        });

        jbSelectResource.setText("Select");

        jtextareaResources.setColumns(20);
        jtextareaResources.setRows(5);
        jScrollPane1.setViewportView(jtextareaResources);

        jLabel1.setFont(new java.awt.Font("Eurostile", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Collect Resources");

        jbExit.setText("Exit");
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });

        bgResources.add(jrbWater);
        jrbWater.setForeground(new java.awt.Color(255, 255, 255));
        jrbWater.setText("Water");
        jrbWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbWaterActionPerformed(evt);
            }
        });

        bgResources.add(jrbFood);
        jrbFood.setForeground(new java.awt.Color(255, 255, 255));
        jrbFood.setText("Food");
        jrbFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFoodActionPerformed(evt);
            }
        });

        bgResources.add(jrbLogs);
        jrbLogs.setForeground(new java.awt.Color(255, 255, 255));
        jrbLogs.setText("Logs");
        jrbLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbLogsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbSleep)
                    .addComponent(jrbRocks)
                    .addComponent(jrbVines)
                    .addComponent(jrbLogs)
                    .addComponent(jrbFood)
                    .addComponent(jrbWater)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbSelectResource, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbWater)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbFood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbLogs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbVines)
                        .addGap(12, 12, 12)
                        .addComponent(jrbRocks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbSleep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSelectResource)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbWaterActionPerformed
        //get current location
        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Water */
        Resource resource = GameControl.getGame().getResources()[GameControl.WATER];
        String description = resource.getDescription();

        //Search Resource List Function
        if (resource.equals(description)) {
            this.jtextareaResources.setText("The resource " + description + " was found in your location.");
        } else {
            this.jtextareaResources.setText("The resource " + description + " was not found in your location"); }

    }//GEN-LAST:event_jrbWaterActionPerformed

    private void jrbVinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbVinesActionPerformed
        //get current location
        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Water */
        Resource resource = GameControl.getGame().getResources()[GameControl.VINES];
        String description = resource.getDescription();

        //Search Resource List Function
        if (resource.equals(description)) {
            this.jtextareaResources.setText("The resource " + description + " was found in your location.");
        } else {
            this.jtextareaResources.setText("The resource " + description + " was not found in your location"); }
    }//GEN-LAST:event_jrbVinesActionPerformed

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbExitActionPerformed

    private void jrbFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFoodActionPerformed
        //get current location
        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Water */
        Resource resource = GameControl.getGame().getResources()[GameControl.FOOD];
        String description = resource.getDescription();

        //Search Resource List Function
        if (resource.equals(description)) {
            this.jtextareaResources.setText("The resource " + description + " was found in your location.");
        } else {
            this.jtextareaResources.setText("The resource " + description + " was not found in your location"); }
    }//GEN-LAST:event_jrbFoodActionPerformed

    private void jrbLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbLogsActionPerformed
        //get current location
        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Water */
        Resource resource = GameControl.getGame().getResources()[GameControl.LOGS];
        String description = resource.getDescription();

        //Search Resource List Function
        if (resource.equals(description)) {
            this.jtextareaResources.setText("The resource " + description + " was found in your location.");
        } else {
            this.jtextareaResources.setText("The resource " + description + " was not found in your location"); }
    }//GEN-LAST:event_jrbLogsActionPerformed

    private void jrbRocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRocksActionPerformed
        //get current location
        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Water */
        Resource resource = GameControl.getGame().getResources()[GameControl.ROCKS];
        String description = resource.getDescription();

        //Search Resource List Function
        if (resource.equals(description)) {
            this.jtextareaResources.setText("The resource " + description + " was found in your location.");
        } else {
            this.jtextareaResources.setText("The resource " + description + " was not found in your location"); }
    }//GEN-LAST:event_jrbRocksActionPerformed

    private void jrbSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSleepActionPerformed
        //get current location
        Location location = ChooseYourOwnAdventure.getLocation();

        /*Get resources in Location
         Search resource list for Water */
        Resource resource = GameControl.getGame().getResources()[GameControl.SLEEP];
        String description = resource.getDescription();

        //Search Resource List Function
        if (resource.equals(description)) {
            this.jtextareaResources.setText("The resource " + description + " was found in your location.");
        } else {
            this.jtextareaResources.setText("The resource " + description + " was not found in your location"); }
    }//GEN-LAST:event_jrbSleepActionPerformed

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
            java.util.logging.Logger.getLogger(CollectResourcesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollectResourcesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollectResourcesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollectResourcesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollectResourcesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgResources;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbSelectResource;
    private javax.swing.JRadioButton jrbFood;
    private javax.swing.JRadioButton jrbLogs;
    private javax.swing.JRadioButton jrbRocks;
    private javax.swing.JRadioButton jrbSleep;
    private javax.swing.JRadioButton jrbVines;
    private javax.swing.JRadioButton jrbWater;
    private javax.swing.JTextArea jtextareaResources;
    // End of variables declaration//GEN-END:variables
}