
package com.dao;

import com.conexion.Conexion;
import com.modelo.Pais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la clase: 
 * Fecha: 
 * Versión: 1.0
 * Copyright:   
 * @author fernando.montes
 */
public class DaoPais extends Conexion{
    public void insertarPais(Pais pa) throws Exception{
        try {
            this.conectar();
            String sql = "INSERT INTO pais (nombre, aeropuerto, area, restricciones) VALUES (?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, pa.getNombre());
            pre.setString(2, pa.getAeropuerto());
            pre.setString(3, pa.getArea());
            pre.setString(4, pa.getRestricciones());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
    
    public List mostrarPais() throws Exception{
        List listaPais = new ArrayList();
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM pais";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next()){
                Pais pa = new Pais();
                pa.setId_pais(res.getInt("id_pais"));
                pa.setNombre(res.getString("nombre"));
                pa.setAeropuerto("aeropuerto");
                pa.setArea(res.getString("area"));
                pa.setRestricciones(res.getString("restricciones"));
                listaPais.add(pa);
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return listaPais;
    }
    
    public void modificarRPais(Pais pa) throws Exception{
        try {
            this.conectar();
            String sql = "UPDATE pais SET nombre=?, aeropuerto=?, area=?, restricciones=? WHERE id_pais=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, pa.getNombre());
            pre.setString(2, pa.getAeropuerto());
            pre.setString(3, pa.getArea());
            pre.setString(4, pa.getRestricciones());
            pre.setInt(5, pa.getId_pais());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
 
    }
    
    public void eliminarPais(Pais pa) throws Exception{
        try {
            this.conectar();
            String sql = "DELETE FROM pais WHERE id_pais=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, pa.getId_pais());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }

}
