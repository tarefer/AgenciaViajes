
package com.dao;

import com.conexion.Conexion;
import com.modelo.Paquete;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la clase: DaoPaquete
 * Fecha: 26/08/2017
 * Versión: 1.0
 * Copyright: Fernando Montes   
 * @author fernando.montes
 */
public class DaoPaquete extends Conexion{
    
    public void insertarPaquete(Paquete paq) throws Exception{
        try {
            this.conectar();
            String sql = "INSERT INTO paquete (descripcion, precio, num_dias, id_cliente, id_pais, id, aerolinea, id_hotel) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, paq.getDescripcion());
            pre.setDouble(2, paq.getPrecio());
            pre.setInt(3, paq.getNum_dias());
            pre.setInt(4, paq.getId_cliente());
            pre.setInt(5, paq.getId_pais());
            pre.setInt(6, paq.getId_aerolinea());
            pre.setInt(7, paq.getId_hotel());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
    
    public List mostrarPaquete() throws Exception{
        List listaPaquete = new ArrayList();
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM paquete";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            
            while(res.next()){
                Paquete paq = new Paquete();
                paq.setId_paquete(res.getInt("id_paquete"));
                paq.setDescripcion(res.getString("descripcion"));
                paq.setPrecio(res.getDouble("precio"));
                paq.setNum_dias(res.getInt("num_dias"));
                paq.setId_cliente(res.getInt("id_cliente"));
                paq.setId_pais(res.getInt("id_pais"));
                paq.setId_pais(res.getInt("id_aerolinea"));
                paq.setId_hotel(res.getInt("id_hotel"));
                listaPaquete.add(pre);
            }
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return listaPaquete;
    }
    public void modificarPaquete(Paquete paq) throws Exception{
        try {
            this.conectar();
            String sql = "UPDATE paquete SET decripcion=?, precio=?, num_dias=?, id_cliente=?, id_pais=?, id_aerolinea=?, id_hotel=? WHERE id_paquete=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, paq.getDescripcion());
            pre.setDouble(2, paq.getPrecio());
            pre.setInt(3, paq.getNum_dias());
            pre.setInt(4, paq.getId_cliente());
            pre.setInt(5, paq.getId_pais());
            pre.setInt(6, paq.getId_aerolinea());
            pre.setInt(7, paq.getId_hotel());
            pre.setInt(8, paq.getId_paquete());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
    
    public void eliminarPaquete(Paquete paq) throws Exception{
        try {
            this.conectar();
            String sql = "DELETE FROM paquete WHERE id_paquete=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, paq.getId_paquete());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        
    }

}
