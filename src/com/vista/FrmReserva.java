/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import com.conexion.Conexion;
import com.dao.DaoReserva;
import com.modelo.Reserva;
import static java.awt.image.ImageObserver.PROPERTIES;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernando.montes
 */
public class FrmReserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmReserva
     */
    public FrmReserva() {
        initComponents();
    }
    Reserva re = new Reserva();
    DaoReserva daor = new DaoReserva();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNumReserva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtFechaSalida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtFechaIngreso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtNumDias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtTipoReserva = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jBtnInsertar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCIdPaquete = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario - Registro de Reserva");

        jLabel1.setText("ID:");

        jLabel2.setText("Numero de Reserva:");

        jLabel3.setText("Fecha de Salida:");

        jLabel4.setText("Fecha de Ingreso:");

        jLabel5.setText("Numero de Dias:");

        jLabel6.setText("Tipo de Reserva:");

        jLabel7.setText("Paquete:");

        jBtnInsertar.setText("Insertar");
        jBtnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnInsertarMouseClicked(evt);
            }
        });

        jBtnModificar.setText("Modificar");
        jBtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnModificarMouseClicked(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnEliminarMouseClicked(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnLimpiarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jCIdPaquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCIdPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCIdPaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtId)
                            .addComponent(jTxtNumReserva)
                            .addComponent(jTxtFechaSalida)
                            .addComponent(jTxtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNumDias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtTipoReserva)
                            .addComponent(jCIdPaquete, 0, 200, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jBtnInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnLimpiar)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNumReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtNumDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtTipoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCIdPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnInsertar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnInsertarMouseClicked
        try {
            insertar();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jBtnInsertarMouseClicked

    private void jBtnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnModificarMouseClicked
        modificar();
    }//GEN-LAST:event_jBtnModificarMouseClicked

    private void jBtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_jBtnEliminarMouseClicked

    private void jBtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLimpiarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnLimpiarMouseClicked

    private void jCIdPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCIdPaqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCIdPaqueteActionPerformed
     public void llenarTabla(){
        int fila = this.jTable1.getSelectedRow();
        this.jTxtId.setText(String.valueOf(this.jTable1.getValueAt(fila, 0)));
        this.jTxtNumReserva.setText(String.valueOf(this.jTable1.getValueAt(fila,1)));
        this.jTxtFechaSalida.setText(String.valueOf(this.jTable1.getValueAt(fila, 2)));
        this.jTxtFechaIngreso.setText(String.valueOf(this.jTable1.getValueAt(fila, 3)));
        this.jTxtNumDias.setText(String.valueOf(this.jTable1.getValueAt(fila, 4)));
        this.jTxtTipoReserva.setText(String.valueOf(this.jTable1.getValueAt(fila, 5)));
        this.jCIdPaquete.setSelectedItem(String.valueOf(this.jTable1.getValueAt(fila, 6)));
        
    }
     
     public void insertar() throws Exception{
         re.setId_reserva(ERROR);
         re.setNum_reserva(this.jTxtNumReserva.getText());
         re.setFecha_salida(this.jTxtFechaSalida.getText());
         re.setFecha_ingreso(this.jTxtFechaIngreso.getText());
         re.setNum_dia(Integer.parseInt(this.jTxtNumDias.getText()));
         re.setTipo_reserva(this.jTxtTipoReserva.getText());
         re.setId_paquete(Integer.parseInt(this.jCIdPaquete.getSelectedItem().toString()));
         daor.insertarReserva(re);
         JOptionPane.showMessageDialog(null, "Datos insertados con exito", "Insertando Datos", 3);
         daor.mostrarReserva();
    }
     
     public void modificar(){
         try {
             re.setId_reserva(ERROR);
             re.setNum_reserva(this.jTxtNumReserva.getText());
             re.setFecha_salida(this.jTxtFechaIngreso.getText());
             re.setFecha_ingreso(this.jTxtFechaIngreso.getText());
             re.setNum_dia(Integer.parseInt(this.jTxtNumDias.getText()));
             re.setTipo_reserva(this.jTxtTipoReserva.getText());
             re.setId_paquete(Integer.parseInt(this.jCIdPaquete.getSelectedItem().toString()));
             int sn = JOptionPane.showConfirmDialog(rootPane, "Resrva modificada con exito", "Modificando Reserva", JOptionPane.YES_NO_OPTION);
             if(sn == 0){
                 daor.modificarReserva(re);
                 JOptionPane.showMessageDialog(rootPane, "Reserva ha sido actualizada", "Confirmando", JOptionPane.INFORMATION_MESSAGE);
                 tablaR();
                 //limpiar();
             }
         } catch (Exception ex) {
             ex.printStackTrace();
         }
     }
     
     public void eliminar(){
         try {
             re.setId_reserva(Integer.parseInt(this.jTxtId.getText()));
             
            int sn = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar Reserva", "Eliminando Reserva", JOptionPane.YES_NO_OPTION);
            if(sn == 0){ 
                daor.eliminarReserva(re);
                JOptionPane.showMessageDialog(rootPane, "Eliminando con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                tablaR();
                //limpiar();
            }else{
                //limpiar();
            }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e.toString(), "Error en el try-catch de la funcion eliminar", JOptionPane.ERROR_MESSAGE);
         }
         
     }
     
     public void tablaR(){
         String [] col = {"Id","Numero de Reserva","Fecha Salida","Fecha Ingreso","Numero Dias","Tipo de Reserva","Paquete"};
         Object[] obj = new Object[7];
         DefaultTableModel tabla = new DefaultTableModel(null, col);
         List ls;
         try {
             ls = daor.mostrarReserva();
             for (int i = 0; i < ls.size(); i++) {
                 re = (Reserva) ls.get(i);
                 obj[0] = re.getId_reserva();
                 obj[1] = re.getNum_reserva();
                 obj[2] = re.getFecha_salida();
                 obj[3] = re.getFecha_ingreso();
                 obj[4] = re.getNum_dia();
                 obj[5] = re.getTipo_reserva();
                 obj[6] = re.getId_paquete();
                 tabla.addRow(obj);
             }
             ls = daor.mostrarReserva();
            this.jTable1.setModel(tabla);
         } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error al mostrar los datos... " + e.toString());
         }
         
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnInsertar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JComboBox<String> jCIdPaquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtFechaIngreso;
    private javax.swing.JTextField jTxtFechaSalida;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNumDias;
    private javax.swing.JTextField jTxtNumReserva;
    private javax.swing.JTextField jTxtTipoReserva;
    // End of variables declaration//GEN-END:variables
}
