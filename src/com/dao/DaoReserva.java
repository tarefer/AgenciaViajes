
package com.dao;

import com.conexion.Conexion;
import com.modelo.Reserva;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Nombre de la clase: DaoReserva
 * Fecha: 25/08/2017
 * Versión: 1.0
 * Copyright: Fernando Montes
 * @author fernando.montes
 */
public class DaoReserva extends Conexion { 
    public void insertarReserva(Reserva re) throws Exception{
        try {
            this.conectar();
            String sql = "INSERT INTO reserva (num_reserva,fecha_salida,fecha_ingreso,num_dia,tipo_reserva, id_paquete) VALUES (?,?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, re.getNum_reserva());
            pre.setString(2, re.getFecha_salida());
            pre.setString(3, re.getFecha_ingreso());
            pre.setInt(4, re.getNum_dia());
            pre.setString(5, re.getTipo_reserva());
            pre.setInt(6, re.getId_paquete());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
    }
    
    public List mostrarReserva() throws Exception{
        List listaReserva = new ArrayList();
        ResultSet res;
        try {
            this.conectar();
            String sql = "SELECT * FROM reserva";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next()){
                Reserva re = new Reserva();
                re.setId_reserva(res.getInt("id_reserva"));
                re.setNum_reserva(res.getString("num_reserva"));
                re.setFecha_salida("fecha_salida");
                re.setFecha_ingreso(res.getString("fecha_ingreso"));
                re.setNum_dia(res.getInt("num_dia"));
                re.setTipo_reserva(res.getString("tipo_reserva"));
                re.setId_paquete(res.getInt("id_paquete"));
                listaReserva.add(re);
            }
            
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
        return listaReserva;
    }
    
    public void modificarReserva(Reserva re) throws Exception{
        try {
            this.conectar();
            String sql = "UPDATE reserva SET num_reserva=?, fecha_salida=?, fecha_ingreso=?, num_dia=?, tipo_reserva=?, id_paquete=? WHERE id_reserva=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, re.getNum_reserva());
            pre.setString(2, re.getFecha_salida());
            pre.setString(3, re.getFecha_ingreso());
            pre.setInt(4, re.getNum_dia());
            pre.setString(5, re.getTipo_reserva());
            pre.setInt(6, re.getId_paquete());
            pre.setInt(7, re.getId_reserva());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }finally{
            this.desconectar();
        }
 
    }
    
    public void eliminarReserva(Reserva re) throws Exception{
        try {
            this.conectar();
            String sql = "DELETE FROM reserva WHERE id_reserva=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1, re.getId_reserva());
            pre.executeUpdate();
        } catch (Exception e) {
            throw e;
        }
        finally{
            this.desconectar();
        }
    }

}
