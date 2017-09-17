/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vista;

import com.dao.DaoUsuario;
import com.modelo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felix
 */
public class FrmUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmUsuario
     */
    public FrmUsuario() {
        initComponents();
    }
    
    Usuario user = new Usuario();
    DaoUsuario daou = new DaoUsuario();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtIdUsuario = new javax.swing.JTextField();
        jTxtUsuarioNombre = new javax.swing.JTextField();
        jTxtApellidoUsuario = new javax.swing.JTextField();
        jTxtCorreoUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTxtUserNameUsuario = new javax.swing.JTextField();
        jPwUsuario = new javax.swing.JPasswordField();
        jComboAcceso = new javax.swing.JComboBox<>();
        jBtnAgregar = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Usuarios");

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuarios);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Correo");

        jtxtIdUsuario.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Acceso");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("User Name");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Contrasena");

        jComboAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cliente", "Proveedor" }));

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        jBtnAgregar.setText("Insertar");
        jBtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnAgregarMouseClicked(evt);
            }
        });

        jBtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/rotate.png"))); // NOI18N
        jBtnActualizar.setText("Modificar");
        jBtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnActualizarMouseClicked(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jTxtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTxtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPwUsuario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtUserNameUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(jComboAcceso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 111, Short.MAX_VALUE)
                .addComponent(jBtnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jBtnActualizar)
                .addGap(18, 18, 18)
                .addComponent(jBtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(jBtnLimpiar)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtUsuarioNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTxtApellidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTxtCorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jComboAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTxtUserNameUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jPwUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnEliminar)
                        .addComponent(jBtnLimpiar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnAgregar)
                        .addComponent(jBtnActualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAgregarMouseClicked
    /*****Boton Insertar*****/   
        try
        {
            insertar();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
         tablaA();
    }//GEN-LAST:event_jBtnAgregarMouseClicked

    private void jBtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnActualizarMouseClicked
       /*****Boton Actualizar*****/ 
       modificar();
    }//GEN-LAST:event_jBtnActualizarMouseClicked

    private void jBtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnEliminarMouseClicked
        /*****Boton Eliminar*****/ 
        eliminar();
    }//GEN-LAST:event_jBtnEliminarMouseClicked

    private void jBtnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnLimpiarMouseClicked
        /*****Boton Limpiar*****/ 
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarMouseClicked

    private void jTableUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosMouseClicked
        /*****Click en la Tabla*****/
        llenarTabla();
    }//GEN-LAST:event_jTableUsuariosMouseClicked

    public void llenarTabla()
    {
        int fila = this.jTableUsuarios.getSelectedRow();
        this.jtxtIdUsuario.setText(String.valueOf(this.jTableUsuarios.getValueAt(fila, 0)));
        this.jTxtUsuarioNombre.setText(String.valueOf(this.jTableUsuarios.getValueAt(fila, 1)));
        this.jTxtApellidoUsuario.setText(String.valueOf(this.jTableUsuarios.getValueAt(fila, 2)));
        this.jTxtCorreoUsuario.setText(String.valueOf(this.jTableUsuarios.getValueAt(fila, 3)));
        this.jTxtUserNameUsuario.setText(String.valueOf(this.jTableUsuarios.getValueAt(fila, 4)));
        //this.jPwUsuario.setText(String.valueOf(this.jTableUsuarios.getValueAt(fila, 5)));
        this.jComboAcceso.setSelectedItem(String.valueOf(this.jTableUsuarios.getValueAt(fila, 5)));
    }
    
    public void insertar() throws Exception
    {
        user.setId_usuario(PROPERTIES);
        user.setUsername(this.jTxtUserNameUsuario.getText());
        user.setClave(this.jPwUsuario.getText());
        user.setAcceso(this.jComboAcceso.getSelectedItem().toString());
        user.setNombre(this.jTxtUsuarioNombre.getText());
        user.setApellido(this.jTxtApellidoUsuario.getText());
        user.setCorreo(this.jTxtCorreoUsuario.getText());
        daou.insertarUsuario(user);
        JOptionPane.showMessageDialog(null, "Datos insertados con exito", "Insertando Datos", 3);
        daou.mostrarUsuario(); 
    }
    
    public void limpiar()
    {
        this.jtxtIdUsuario.setText("");
        this.jTxtUsuarioNombre.setText("");
        this.jTxtApellidoUsuario.setText("");
        this.jTxtCorreoUsuario.setText("");
        this.jTxtUserNameUsuario.setText("");
        this.jPwUsuario.setText("");
    }
    
    public void modificar()
    {
        try
        {
            user.setId_usuario(Integer.parseInt(this.jtxtIdUsuario.getText()));
            user.setUsername(this.jTxtUserNameUsuario.getText());
            user.setClave(this.jPwUsuario.getText());
            user.setAcceso(this.jComboAcceso.getSelectedItem().toString());
            user.setNombre(this.jTxtUsuarioNombre.getText());
            user.setApellido(this.jTxtApellidoUsuario.getText());
            user.setCorreo(this.jTxtCorreoUsuario.getText());
            int sn = JOptionPane.showConfirmDialog(rootPane, "Usuario Modificado con Exito", "Modificar Usuario", JOptionPane.YES_NO_OPTION);
            if(sn ==0)
            {
              daou.modificarUsuario(user);
              JOptionPane.showMessageDialog(rootPane, "El usuario ha sido actualizado", "Confirmando", JOptionPane.INFORMATION_MESSAGE);
              tablaA();
              limpiar();
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void eliminar()
    {
        try 
        {
            user.setId_usuario(Integer.parseInt(this.jtxtIdUsuario.getText()));
            int sn = JOptionPane.showConfirmDialog(rootPane, "Desea Eliminar el usuario?", "Eliminando Usuario", JOptionPane.YES_NO_OPTION);
            if(sn == 0)
            {
               daou.eliminarUsuario(user);
               JOptionPane.showMessageDialog(rootPane, "Eliminando con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
               tablaA();
               limpiar();
            }
            else
            {
                limpiar();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.toString(), "Error en el try-catch de la funcion eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void tablaA()
    {
        String[] col = {"ID","Nombre","Apellido","User Name", "Acceso", "correo", "Clave"};
        Object[] obj = new Object[7];
        DefaultTableModel tabla = new DefaultTableModel(null, col);
        List ls;
        try
        {
            ls = daou.mostrarUsuario();
            for(int i = 0; i < ls.size(); i++)
            {
                user = (Usuario) ls.get(i);
                obj[0] = user.getId_usuario();
                obj[1] = user.getNombre();
                obj[2] = user.getApellido();
                obj[3] = user.getUsername();
                obj[4] = user.getAcceso();
                obj[5] = user.getCorreo();
                obj[6] = user.getClave();
                tabla.addRow(obj);
            }
            ls = daou.mostrarUsuario();
            this.jTableUsuarios.setModel(tabla);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error al mostrar los datos... " + e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JComboBox<String> jComboAcceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPwUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxtApellidoUsuario;
    private javax.swing.JTextField jTxtCorreoUsuario;
    private javax.swing.JTextField jTxtUserNameUsuario;
    private javax.swing.JTextField jTxtUsuarioNombre;
    private javax.swing.JTextField jtxtIdUsuario;
    // End of variables declaration//GEN-END:variables
}
