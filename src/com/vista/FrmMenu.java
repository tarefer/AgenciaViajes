/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

/**
 *
 * @author fernando.montes
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        administracion = new javax.swing.JMenu();
        informacionCliente = new javax.swing.JMenuItem();
        hoteles = new javax.swing.JMenuItem();
        paquetes = new javax.swing.JMenuItem();
        aerolineas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        administracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/settings-gears.png"))); // NOI18N
        administracion.setMnemonic('f');
        administracion.setText("Administracion");

        informacionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/check-in-desk.png"))); // NOI18N
        informacionCliente.setMnemonic('o');
        informacionCliente.setText("Información Cliente");
        administracion.add(informacionCliente);

        hoteles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/round-hotel-sign.png"))); // NOI18N
        hoteles.setMnemonic('s');
        hoteles.setText("Hoteles");
        administracion.add(hoteles);

        paquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/package.png"))); // NOI18N
        paquetes.setMnemonic('a');
        paquetes.setText("Paquetes");
        paquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetesActionPerformed(evt);
            }
        });
        administracion.add(paquetes);

        aerolineas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/airport-sign.png"))); // NOI18N
        aerolineas.setMnemonic('x');
        aerolineas.setText("Aerolineas");
        aerolineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aerolineasActionPerformed(evt);
            }
        });
        administracion.add(aerolineas);

        menuBar.add(administracion);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aerolineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aerolineasActionPerformed
        System.exit(0);
    }//GEN-LAST:event_aerolineasActionPerformed

    private void paquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paquetesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu administracion;
    private javax.swing.JMenuItem aerolineas;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem hoteles;
    private javax.swing.JMenuItem informacionCliente;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem paquetes;
    // End of variables declaration//GEN-END:variables

}
