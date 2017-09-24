/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import com.dao.DaoAerolinea;
import com.dao.DaoCliente;
import com.dao.DaoHotel;
import com.dao.DaoPais;
import com.dao.DaoPaquete;
import com.modelo.Aerolinea;
import com.modelo.Cliente;
import com.modelo.Hotel;
import com.modelo.Pais;
import com.modelo.Paquete;
import static java.awt.image.ImageObserver.ERROR;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernando.montes
 */
public class FrmPaquetes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPaquetes
     */
    public FrmPaquetes() {
        initComponents();
        /* removiendo datos por defecto de los jCombox */
        jCIdAerolinea.removeAllItems();
        jCIdCliente.removeAllItems();
        jCIdHotel.removeAllItems();
        jCIdPais.removeAllItems();
        /*Creando listas para agregar info de la DB a los jCombox*/
        ArrayList <Aerolinea> listaAerolinea = new ArrayList <Aerolinea>();
        ArrayList <Cliente> listaCliente = new ArrayList <Cliente>();
        ArrayList <Hotel> listaHotel = new ArrayList <Hotel>();
        ArrayList <Pais> listaPais = new ArrayList <Pais>();
        
        try {
            listaAerolinea = daoa.obtenerAerolineas();
            listaCliente = daoc.obtenerClientes();
            listaPais = daop.obtenerPaises();
            listaHotel = daoh.obtenerHoteles();
            
            for(Aerolinea a: listaAerolinea){
                jCIdAerolinea.addItem(a);
            }
            
            for(Cliente c: listaCliente){
                jCIdCliente.addItem(c);
            }
            for(Pais p: listaPais){
                jCIdPais.addItem(p);
            }
            for(Hotel h: listaHotel){
                jCIdHotel.addItem(h);
            }
            
        } catch (Exception e) {
        }
        tablaPaq();
    }
    
    Paquete pa = new Paquete();
    DaoPaquete daopa = new DaoPaquete();
    DaoAerolinea daoa = new DaoAerolinea();
    DaoCliente daoc = new DaoCliente();
    DaoHotel daoh = new DaoHotel();
    DaoPais daop = new DaoPais();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtIdPaquete = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTxtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jCIdCliente = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jCIdPais = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jCIdAerolinea = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jCIdHotel = new javax.swing.JComboBox();
        jBtnInsertar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTxtNumDias = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario - Registro de Paquetes");

        jLabel1.setText("ID:");

        jLabel2.setText("Descripción:");

        jTxtDescripcion.setColumns(20);
        jTxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTxtDescripcion);

        jLabel3.setText("Precio:");

        jLabel4.setText("ID Cliente:");

        jCIdCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("ID Pais:");

        jCIdPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("ID Aerolinea:");

        jCIdAerolinea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("ID Hotel:");

        jCIdHotel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBtnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        jBtnInsertar.setText("Insertar");
        jBtnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnInsertarMouseClicked(evt);
            }
        });

        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotate.png"))); // NOI18N
        jBtnModificar.setText("Modificar");
        jBtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnModificarMouseClicked(evt);
            }
        });

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/x-button.png"))); // NOI18N
        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnEliminarMouseClicked(evt);
            }
        });

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/brush.png"))); // NOI18N
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
        jScrollPane2.setViewportView(jTable1);

        jLabel8.setText("Numero de Dias:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtIdPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCIdCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCIdPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCIdAerolinea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxtNumDias, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTxtNumDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCIdPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jCIdAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jCIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTxtIdPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnInsertar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarMouseClicked
    public void llenarTabla() {
        int fila = this.jTable1.getSelectedRow();
        this.jTxtIdPaquete.setText(String.valueOf(this.jTable1.getValueAt(fila, 0)));
        this.jTxtDescripcion.setText(String.valueOf(this.jTable1.getValueAt(fila, 1)));
        this.jTxtPrecio.setText(String.valueOf(this.jTable1.getValueAt(fila, 2)));
        this.jTxtNumDias.setText(String.valueOf(this.jTable1.getValueAt(fila, 3)));
        this.jCIdCliente.setSelectedItem(String.valueOf(this.jTable1.getValueAt(fila, 4)));
        this.jCIdPais.setSelectedItem(String.valueOf(this.jTable1.getValueAt(fila, 5)));
        this.jCIdAerolinea.setSelectedItem(String.valueOf(this.jTable1.getValueAt(fila, 6)));
        this.jCIdHotel.setSelectedItem(String.valueOf(this.jTable1.getValueAt(fila, 7)));

    }
    
    public void insertar() throws Exception{
         if(isStringDouble(this.jTxtPrecio.getText()) && this.jTxtDescripcion.getText() != ""){
             pa.setId_paquete(Integer.parseInt(this.jTxtIdPaquete.getText()));
             pa.setDescripcion(this.jTxtDescripcion.getText());
             pa.setPrecio(Double.parseDouble(this.jTxtPrecio.getText()));
             pa.setNum_dias(Integer.parseInt(this.jTxtNumDias.getText()));
             Object itemC = jCIdCliente.getSelectedItem();
             int selectedIdC = ((Cliente) itemC).getId_cliente();
             pa.setId_cliente(selectedIdC);
             
             Object itemP = jCIdPais.getSelectedItem();
             int selectedP = ((Pais) itemP).getId_pais();
             pa.setId_cliente(selectedP);
             
             Object itemA = jCIdAerolinea.getSelectedItem();
             int selectedIdA = ((Aerolinea) itemA).getId_aerolinea();
             pa.setId_aerolinea(selectedIdA);
             
             Object itemH = jCIdHotel.getSelectedItem();
             int selectedH = ((Hotel) itemH).getId_hotel();
             pa.setId_hotel(selectedH);
             
             daopa.insertarPaquete(pa);
             
             JOptionPane.showMessageDialog(null, "Datos insertados con exito", "Insertando Datos", 3);
             daopa.mostrarPaquete();
         }else{
             //JOptionPane.showInternalConfirmDialog(rootPane, "Valores nulos o inconrrectos", "Validando Datos", 1);
             JOptionPane.showMessageDialog(rootPane, "Valores nulos o inconrrectos", "Validando Datos", 2);
         }
         
    }
    
    public boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    
    public void modificar(){
         try {
             pa.setId_paquete(Integer.parseInt(this.jTxtIdPaquete.getText()));
             pa.setDescripcion(this.jTxtDescripcion.getText());
             pa.setPrecio(Double.parseDouble(this.jTxtPrecio.getText()));
             pa.setNum_dias(Integer.parseInt(this.jTxtNumDias.getText()));
             Object itemC = jCIdCliente.getSelectedItem();
             int selectedIdC = ((Cliente) itemC).getId_cliente();
             pa.setId_cliente(selectedIdC);
             
             Object itemP = jCIdPais.getSelectedItem();
             int selectedP = ((Pais) itemP).getId_pais();
             pa.setId_cliente(selectedP);
             
             Object itemA = jCIdAerolinea.getSelectedItem();
             int selectedIdA = ((Aerolinea) itemA).getId_aerolinea();
             pa.setId_aerolinea(selectedIdA);
             
             Object itemH = jCIdHotel.getSelectedItem();
             int selectedH = ((Hotel) itemH).getId_hotel();
             pa.setId_hotel(selectedH);
             //System.out.println("ID SELECCIONADP: " + selectedId);
             //re.setId_paquete(Integer.parseInt(this.jCIdPaquete.getSelectedItem().toString()));
             int sn = JOptionPane.showConfirmDialog(rootPane, "Paquete modificado con exito", "Modificando Paquete", JOptionPane.YES_NO_OPTION);
             if(sn == 0){
                 daopa.modificarPaquete(pa);
                 JOptionPane.showMessageDialog(rootPane, "Paquete ha sido actualizado", "Confirmando", JOptionPane.INFORMATION_MESSAGE);
                 tablaPaq();
                 limpiar();
             }
         } catch (Exception ex) {
             ex.printStackTrace();
         }
     }
    
    public void eliminar(){
         try {
            pa.setId_paquete(Integer.parseInt(this.jTxtIdPaquete.getText()));
             
            int sn = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar Paquete", "Eliminando Paquete", JOptionPane.YES_NO_OPTION);
            if(sn == 0){ 
                daopa.eliminarPaquete(pa);
                JOptionPane.showMessageDialog(rootPane, "Eliminando con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                tablaPaq();
                limpiar();
            }else{
                limpiar();
            }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e.toString(), "Error en el try-catch de la funcion eliminar", JOptionPane.ERROR_MESSAGE);
         }
         
     }
    
    public void tablaPaq(){
         String [] col = {"Id","Descripcion","Precio","Numero de Días","Cliente","Pais","Aerolinea", "Hotel"};
         Object[] obj = new Object[8];
         DefaultTableModel tabla = new DefaultTableModel(null, col);
         List ls;
         try {
             ls = daopa.mostrarPaquete();
             for (int i = 0; i < ls.size(); i++) {
                 pa = (Paquete) ls.get(i);
                 obj[0] = pa.getId_paquete();
                 obj[1] = pa.getDescripcion();
                 obj[2] = pa.getPrecio();
                 obj[3] = pa.getNum_dias();
                 obj[4] = pa.getId_cliente();
                 obj[5] = pa.getId_pais();
                 obj[6] = pa.getId_aerolinea();
                 obj[7] = pa.getId_hotel();
                 tabla.addRow(obj);
             }
             ls = daopa.mostrarPaquete();
            this.jTable1.setModel(tabla);
         } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error al mostrar los datos... " + e.toString());
         }
         
     }
    
    public void limpiar(){
        this.jTxtIdPaquete.setText("");
        this.jTxtDescripcion.setText("");
        this.jTxtNumDias.setText("");
        this.jTxtPrecio.setText("");
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnInsertar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JComboBox jCIdAerolinea;
    private javax.swing.JComboBox jCIdCliente;
    private javax.swing.JComboBox jCIdHotel;
    private javax.swing.JComboBox jCIdPais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTxtDescripcion;
    private javax.swing.JTextField jTxtIdPaquete;
    private javax.swing.JTextField jTxtNumDias;
    private javax.swing.JTextField jTxtPrecio;
    // End of variables declaration//GEN-END:variables
}
