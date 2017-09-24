package com.dao;

import com.conexion.Conexion;
import com.modelo.Login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Nombre de la clase: DaoLogin
 * Versión: 1.0
 * @author William Lazo
 * Fecha: dd-mm-yy
 * Copyright: Wilks Enterprise S.A.
 */
public class DaoLogin extends Conexion  
{
    
public String accesoSistema(Login login) throws Exception
    {
        String acceso = "";
        try 
        {
            this.conectar();
            String sql = "select * from usuario where username = ? and clave = ?";
            PreparedStatement sentencia = this.getCon().prepareStatement(sql);
            
            sentencia.setString(1, login.getUser());
            sentencia.setString(2, (login.getPass()));
            
            ResultSet resultado = sentencia.executeQuery();
            
            while (resultado.next()) 
            {                                            
                    if (resultado.getString("acceso").equals("Cliente"))
                    {
                        acceso = "Cliente";
                    }
                    else if(resultado.getString("acceso").equals("Administrador"))
                    {
                        acceso = "Administrador";
                    }
            }
        }
        catch (Exception e) 
        {
            throw e;
        }
        finally
        {
            this.desconectar();
        }
        return acceso;
    }
}
