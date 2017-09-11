
package com.dao;

import com.conexion.Conexion;
import com.modelo.Usuario;
import java.sql.*;
import java.util.*;

/**
 * Nombre de la clase: DaoUsuario
 * Fecha: 25/08/2017
 * Versión: 1.0
 * Copyright: Felix Avelar
 * @author Felix Avelar
 */
public class DaoUsuario extends Conexion {

public void insertarUsuario(Usuario usuario)throws Exception {
        try{
            this.conectar();
            String sql = "INSERT INTO usuario (username, clave, acceso, nombre, apellido, correo) VALUES (?,?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, usuario.getUsername());
            pre.setString(2, usuario.getClave());
            pre.setString(3, usuario.getAcceso());
            pre.setString(4, usuario.getNombre());
            pre.setString(5, usuario.getApellido());
            pre.setString(6, usuario.getCorreo());
            pre.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

public List mostrarUsuario() throws Exception{
    List listaUsuario = new ArrayList();
    ResultSet res;
    try{
        this.conectar();
        String sql = "SELECT * FROM usuario";
        PreparedStatement pre = this.getCon().prepareCall(sql);
        res = pre.executeQuery();
        while(res.next()){
            Usuario usuario = new Usuario();
            usuario.setId_usuario(res.getInt("id_usuario"));
            usuario.setUsername(res.getString("username"));
            usuario.setClave(res.getString("clave"));
            usuario.setAcceso(res.getString("acceso"));
            usuario.setNombre(res.getString("nombre"));
            usuario.setApellido(res.getString("apellido"));
            usuario.setCorreo(res.getString("correo"));
            listaUsuario.add(usuario);
        }
    
    } catch (Exception e){
        throw e;
    } finally{
        this.desconectar();
    }
    return listaUsuario;
  }  

public void modificarUsuario(Usuario usuario) throws Exception{
     try{
            this.conectar();
            String sql = "UPDATE usuario SET username=?, clave=?, acceso=?, nombre=?, apellido=?, correo=? WHERE id_usuario=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, usuario.getUsername());
            pre.setString(2, usuario.getClave());
            pre.setString(3, usuario.getAcceso());
            pre.setString(4, usuario.getNombre());
            pre.setString(5, usuario.getApellido());
            pre.setString(6, usuario.getCorreo());
            pre.executeUpdate();
        } catch (Exception e){
            throw e;
        } finally{
            this.desconectar();
        }
    }

public void eliminarUsuario(Usuario usuario) throws Exception{
        try{
            this.conectar();
            String sql = "DELETE FROM hotel WHERE WHERE id_hotel=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setInt(1,usuario.getId_usuario());
            pre.executeUpdate();
        }catch (Exception e){
            throw e;
        } finally {
            this.desconectar();
        }
    }
    
}
