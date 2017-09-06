
package com.dao;

import com.conexion.Conexion;
import com.modelo.Aerolinea;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la clase: DaoAerolinea
 * Fecha: 22/08/2017
 * Versión: 1.0
 * Copyright: Fernando Montes   
 * @author Fernando Montes
 */
public class DaoAerolinea extends Conexion{
    /*Insertando registro para la tabla aerolinea*/
    public void insertarAerolinea(Aerolinea ae) throws Exception{
        try {
            this.conectar();
            String sql = "INSERT INTO aerolinea (nombre, num_vuelo, destino, num_asiento, telefono,sitio_web, notas)"
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, ae.getNombre());
            pre.setString(2, ae.getNum_vuelo());
            pre.setString(3, ae.getDestino());
            pre.setInt(4, ae.getNum_asiento());
            pre.setString(5, ae.getTelefono());
            pre.setString(6, ae.getSito_web());
            pre.setString(7, ae.getNotas());
            pre.executeUpdate();
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
    public List mostrarAerolinea() throws Exception{
        List listaAerolinea = new ArrayList();
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM aerolinea";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next()){
                Aerolinea a = new Aerolinea(); 
                a.setId_aerolinea(res.getInt("id_aerolinea"));
                a.setNombre(res.getString("nombre"));
                a.setNum_vuelo(res.getString("num_vuelo"));
                a.setDestino(res.getString("destino"));
                a.setNum_asiento(res.getInt("num_asiento"));
                a.setTelefono(res.getString("telefono"));
                a.setSito_web(res.getString("sitio_web"));
                a.setNotas(res.getString("notas"));
                listaAerolinea.add(a);
                
            }
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        
        return listaAerolinea;
    }
    
    public void modificarAerolinea(Aerolinea ae) throws Exception{
        try {
            this.conectar();
            String sql = "UPDATE aerolinea SET nombre=?, num_vuelo=?, destino=?, num_asiento=?, telefono=?,sitio_web=?, notas=? WHERE id_Aerolinea=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, ae.getNombre());
            pre.setString(2, ae.getNum_vuelo());
            pre.setString(3, ae.getDestino());
            pre.setInt(4, ae.getNum_asiento());
            pre.setString(5, ae.getTelefono());
            pre.setString(6, ae.getSito_web());
            pre.setString(7, ae.getNotas());
            pre.setInt(8, ae.getId_aerolinea());
            pre.executeUpdate();
            
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }
    
    public void eliminarAerolinea(Aerolinea ae) throws Exception{
        try {
            this.conectar();
            String sql = "DELETE FROM aerolinea WHERE id_aerolinea=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, ae.getId_aerolinea());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }
    
}
