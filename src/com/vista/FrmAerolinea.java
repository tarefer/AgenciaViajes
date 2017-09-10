/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import com.dao.DaoAerolinea;
import com.modelo.Aerolinea;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernando.montes
 */
public class FrmAerolinea extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmAerolinea
     */
    public FrmAerolinea() {
        initComponents();
        tablaA();
    }
    Aerolinea ae = new Aerolinea();
    DaoAerolinea daoa = new DaoAerolinea();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNumVuelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSAsientos = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jTxtSitioWeb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtNotas = new javax.swing.JTextArea();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario - Registro de Aerolinea");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Numero de Vuelo:");

        jLabel3.setText("Destino:");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Asientos:");

        jLabel6.setText("Sitio web:");

        jLabel7.setText("Notas:");

        jTxtNotas.setColumns(20);
        jTxtNotas.setRows(5);
        jScrollPane1.setViewportView(jTxtNotas);

        btnInsertar.setText("Insertar");
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertarMouseClicked(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setText("ID:");

        jTxtId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTxtSitioWeb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTxtDestino, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jSAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTxtNumVuelo)
                                            .addComponent(jTxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtNumVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jSAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTxtSitioWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseClicked
        try {
            insertar();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tablaA();
    }//GEN-LAST:event_btnInsertarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        modificar();
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminar();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        llenarTabla();
    }//GEN-LAST:event_jTable1MouseClicked
    public void llenarTabla(){
        int fila = this.jTable1.getSelectedRow();
        this.jTxtId.setText(String.valueOf(this.jTable1.getValueAt(fila, 0)));
        this.jTxtNombre.setText(String.valueOf(this.jTable1.getValueAt(fila,1)));
        this.jTxtNumVuelo.setText(String.valueOf(this.jTable1.getValueAt(fila, 2)));
        this.jTxtDestino.setText(String.valueOf(this.jTable1.getValueAt(fila, 3)));
        this.jSAsientos.setValue(this.jTable1.getValueAt(fila, 4));
        this.jTxtTelefono.setText(String.valueOf(this.jTable1.getValueAt(fila, 5)));
        this.jTxtSitioWeb.setText(String.valueOf(this.jTable1.getValueAt(fila, 6)));
        this.jTxtNotas.setText(String.valueOf(this.jTable1.getValueAt(fila, 7)));
    }
    public void insertar() throws Exception{
        ae.setId_aerolinea(PROPERTIES);
        ae.setNombre(this.jTxtNombre.getText());
        ae.setNum_vuelo(this.jTxtNumVuelo.getText());
        ae.setDestino(this.jTxtDestino.getText());
        ae.setNum_asiento(Integer.parseInt(this.jSAsientos.getValue().toString()));
        ae.setTelefono(this.jTxtTelefono.getText());
        ae.setSito_web(this.jTxtSitioWeb.getText());
        ae.setNotas(this.jTxtNotas.getText());
        daoa.insertarAerolinea(ae);
        JOptionPane.showMessageDialog(null, "Datos insertados con exito", "Insertando Datos", 3);
        daoa.mostrarAerolinea();
    }
    
    public void limpiar(){
        this.jTxtId.setText("");
        this.jTxtNombre.setText("");
        this.jTxtNumVuelo.setText("");
        this.jTxtNotas.setText("");
        this.jTxtSitioWeb.setText("");
        this.jTxtTelefono.setText("");
        this.jTxtDestino.setText("");
        
    }
    public void modificar(){
        try {
            ae.setId_aerolinea(Integer.parseInt(this.jTxtId.getText()));
            ae.setNombre(this.jTxtNombre.getText());
            ae.setNum_vuelo(this.jTxtNumVuelo.getText());
            ae.setDestino(this.jTxtDestino.getText());
            ae.setNum_asiento(Integer.parseInt(this.jSAsientos.getValue().toString()));
            ae.setTelefono(this.jTxtTelefono.getText());
            ae.setSito_web(this.jTxtSitioWeb.getText());
            ae.setNotas(this.jTxtNotas.getText());
            int sn = JOptionPane.showConfirmDialog(rootPane, "Aerolinea modificada con exito", "Modificar Aerolinea", JOptionPane.YES_NO_OPTION);
            if(sn == 0){
                daoa.modificarAerolinea(ae);
                JOptionPane.showMessageDialog(rootPane, "Aerolina ha sido actualizada", "Confirmando", JOptionPane.INFORMATION_MESSAGE);
                tablaA();
                limpiar();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    public void eliminar(){
        try {
            ae.setId_aerolinea(Integer.parseInt(this.jTxtId.getText()));
            int sn = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar Aerolinea", "Eliminando Aerolinea", JOptionPane.YES_NO_OPTION);
            if(sn == 0){                                 
                daoa.eliminarAerolinea(ae);
                JOptionPane.showMessageDialog(rootPane, "Eliminando con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                tablaA();
                limpiar();
            }else{
                limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error en el try-catch de la funcion eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void tablaA(){
        String[] col = {"Código","Nombre"," Numero de Vuelo","Destion","Numero de Asientos","Telefono","Sitio Web","Notas"};
        Object[] obj = new Object[8];
        DefaultTableModel tabla = new DefaultTableModel(null, col);
        List ls;
        try {
            ls = daoa.mostrarAerolinea();
            for(int i = 0; i < ls.size(); i++){
                ae = (Aerolinea) ls.get(i);
                obj[0] = ae.getId_aerolinea();
                obj[1] = ae.getNombre();
                obj[2] = ae.getNum_vuelo();
                obj[3] = ae.getDestino();
                obj[4] = ae.getNum_asiento();
                obj[5] = ae.getTelefono();
                obj[6] = ae.getSito_web();
                obj[7] = ae.getNotas();
                tabla.addRow(obj);
            }
            ls = daoa.mostrarAerolinea();
            this.jTable1.setModel(tabla);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar los datos... " + e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner jSAsientos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtDestino;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextArea jTxtNotas;
    private javax.swing.JTextField jTxtNumVuelo;
    private javax.swing.JTextField jTxtSitioWeb;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
