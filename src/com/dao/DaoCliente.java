
package com.dao;

import com.conexion.Conexion;
import com.modelo.Cliente;
import java.sql.*;
import java.util.*;

/**
 * Nombre de la clase: DaoCliente
 * Fecha: 25/08/2017
 * Versión: 1.0
 * Copyright: Felix Avelar
 * @author Felix Avelar
 */
public class DaoCliente extends Conexion {
    
public void insertarCliente(Cliente cliente)throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO clliente (nombres, apellidos, genero, telefono, correo, nacionalidad, tipo_documento, num_documento,direccion,id_departamento) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, cliente.getNombres());
            pre.setString(2, cliente.getApellidos());
            pre.setString(3, cliente.getGenero());
            pre.setInt(4, cliente.getTelefono());
            pre.setString(5, cliente.getCorreo());
            pre.setString(6, cliente.getNacionalidad());
            pre.setString(7, cliente.getTipo_documento());
            pre.setInt(8, cliente.getNum_documento());
            pre.setString(9, cliente.getDireccion());
            pre.setInt(10, cliente.getId_departamento());
            pre.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }
   
public List mostrarCliente() throws Exception{
    List listaCliente = new ArrayList();
    ResultSet res;
    try{
        this.conectar();
        String sql = "SELECT * FROM clliente";
        PreparedStatement pre = this.getCon().prepareCall(sql);
        res = pre.executeQuery();
        while(res.next()){
            Cliente cliente = new Cliente();
            cliente.setId_cliente(res.getInt("id_cliente"));
            cliente.setNombres(res.getString("nombres"));
            cliente.setApellidos(res.getString("apellidos"));
            cliente.setGenero(res.getString("genero"));
            cliente.setTelefono(res.getInt("telefono"));
            cliente.setCorreo(res.getString("correo"));
            cliente.setNacionalidad(res.getString("nacionalidad"));
            cliente.setTipo_documento(res.getString("tipo_documento"));
            cliente.setNum_documento(res.getInt("num_documento"));
            cliente.setDireccion(res.getString("direccion"));
            cliente.setId_departamento(res.getInt("id_departamento"));  
            listaCliente.add(cliente);
        }
    
    } catch (Exception e){
        throw e;
    } finally{
        this.desconectar();
    }
    return listaCliente;
  }  

public void modificarCliente(Cliente cliente) throws Exception{
     try{
            this.conectar();
            String sql = "UPDATE clliente SET nombres=?, apellidos=?, genero=?, telefono=?, correo=?, nacionalidad=?, tipo_documento=?, num_documento=?, direccion=?,id_departamento=? WHERE id_cliente=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, cliente.getNombres());
            pre.setString(2, cliente.getApellidos());
            pre.setString(3, cliente.getGenero());
            pre.setInt(4, cliente.getTelefono());
            pre.setString(5, cliente.getCorreo());
            pre.setString(6, cliente.getNacionalidad());
            pre.setString(7, cliente.getTipo_documento());
            pre.setInt(8, cliente.getNum_documento());
            pre.setString(9, cliente.getDireccion());
            pre.setInt(10, cliente.getId_departamento());
            pre.setInt(11, cliente.getId_cliente());
            pre.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

public void eliminarCliente(Cliente cliente) throws Exception{
        try{
            this.conectar();
            String sql = "DELETE FROM clliente WHERE id_cliente=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1,cliente.getId_cliente());
            pre.executeUpdate();
        }catch (Exception e){
            throw e;
        } finally {
            this.desconectar();
        }
    }
}
