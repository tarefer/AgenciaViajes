
package com.dao;

import com.conexion.Conexion;
import com.modelo.Hotel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la clase: DaoHotel
 * Fecha: 25/08/2017
 * Versión: 1.0
 * Copyright: Fernando Montes
 * @author fernando.montes
 */
public class DaoHotel extends Conexion{
    public void insertarHotel(Hotel he) throws Exception{
        try {
            this.conectar();
            String sql = "INSERT INTO hotel (nombre,direccion,telefono,num_habitaciones,sitio_web) VALUES (?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, he.getNombre());
            pre.setString(2, he.getDireccion());
            pre.setString(3, he.getTelefono());
            pre.setInt(4, he.getNum_habitaciones());
            pre.setString(5, he.getSitio_web());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
    
    public List mostrarHotel() throws Exception{
        List listaHotel = new ArrayList();
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM hotel";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next()){
                Hotel he = new Hotel();
                he.setId_hotel(res.getInt("id_hotel"));
                he.setNombre(res.getString("nombre"));
                he.setDireccion(res.getString("direccion"));
                he.setTelefono(res.getString("telefono"));
                he.setNum_habitaciones(res.getShort("num_habitaciones"));
                he.setSitio_web(res.getString("sitio_web"));
                listaHotel.add(he);
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return listaHotel;
    }
    
    public void modificarHotel(Hotel he) throws Exception{
        try {
            this.conectar();
            String sql = "UPDATE hotel SET nombre=?, direccion=?, telefono=?, num_habitaciones=?, sitio_web=? WHERE id_hotel=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, he.getNombre());
            pre.setString(2, he.getDireccion());
            pre.setString(3, he.getTelefono());
            pre.setInt(4, he.getNum_habitaciones());
            pre.setString(5, he.getSitio_web());
            pre.setInt(6, he.getId_hotel());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
 
    }
    
    public void eliminarHotel(Hotel he) throws Exception{
        try {
            this.conectar();
            String sql = "DELETE FROM hotel WHERE id_hotel=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, he.getId_hotel());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }
    //ArrayList de Paquete
    public  ArrayList <Hotel> obtenerHoteles() throws Exception{
        ArrayList <Hotel> lista = new ArrayList<Hotel>();
        Hotel h;
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM hotel";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next()){
                h = new Hotel();
                h.setId_hotel(res.getInt("id_hotel"));
                h.setNombre(res.getString("nombre"));
                lista.add(h);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return lista;
        
    } 
}
