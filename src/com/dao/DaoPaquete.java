package com.dao;

import com.conexion.Conexion;
import com.modelo.Aerolinea;
import com.modelo.Paquete;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 * Nombre de la clase: DaoPaquete
 * Fecha: 19/09/2017
 * Versión: 1.0
 * Copyright: Fernando Montes
 * @author fernando.montes
 */
public class DaoPaquete  extends Conexion{
    
    public void insertarPaquete(Paquete pa) throws Exception{
        try {
            this.conectar();
            String sql = "INSERT INTO paquete (descripcion,precio,num_dias,id_cliente,id_pais, id_aerolinea, id_hotel) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, pa.getDescripcion());
            pre.setDouble(2, pa.getPrecio());
            pre.setInt(3, pa.getNum_dias());
            pre.setInt(4, pa.getId_cliente());
            pre.setInt(5, pa.getId_pais());
            pre.setInt(6, pa.getId_aerolinea());
            pre.setInt(7, pa.getId_hotel());
            
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
    
    public List mostrarPaquete() throws Exception{
        List listaRPaquete = new ArrayList();
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM paquete";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while (res.next()) {
                Paquete pa = new Paquete();
                pa.setId_paquete(res.getInt("id_paquete"));
                pa.setDescripcion(res.getString("descripcion"));
                pa.setPrecio(res.getDouble("precio"));
                pa.setNum_dias(res.getInt("num_dias"));
                pa.setId_cliente(res.getInt("id_cliente"));
                pa.setId_pais(res.getInt("id_pais"));
                pa.setId_aerolinea(res.getInt("id_aerolinea"));
                pa.setId_hotel(res.getInt("id_hotel"));
                listaRPaquete.add(pa);
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return listaRPaquete;
    }
    //ArrayList de Paquete
    public  ArrayList <Paquete> obtenerPaquetes() throws Exception{
        ArrayList <Paquete> lista = new ArrayList<Paquete>();
        Paquete p;
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM paquete";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next()){
                p = new Paquete();
                p.setId_paquete(res.getInt("id_paquete"));
                p.setDescripcion(res.getString("descripcion"));
                lista.add(p);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return lista;
        
    }   
    
    public void modificarPaquete(Paquete pa) throws Exception{
        try {
            this.conectar();
            String sql = "UPDATE paquete SET descripcion=?, precio=?, num_dias=?, id_cliente=?,id_pais=?, id_aerolinea=?, id_hotel=? WHERE id_paquete=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, pa.getDescripcion());
            pre.setDouble(2, pa.getPrecio());
            pre.setInt(3, pa.getNum_dias());
            pre.setInt(4, pa.getId_cliente());
            pre.setInt(5, pa.getId_pais());
            pre.setInt(6, pa.getId_aerolinea());
            pre.setInt(7, pa.getId_hotel());
            pre.setInt(8, pa.getId_paquete());
            pre.executeUpdate();
            
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }
    
    public void eliminarPaquete(Paquete pa) throws Exception{
        try {
            this.conectar();
            String sql = "DELETE FROM paquete WHERE id_paquete=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, pa.getId_paquete());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }
}
