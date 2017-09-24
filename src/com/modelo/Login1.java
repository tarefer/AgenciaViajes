package com.modelo;

/**
 * Nombre de la clase: 
 * Versión: 
 * @author William Lazo
 * Fecha: dd-mm-yy
 * Copyright: Wilks Enterprise S.A.
 */
public class Login1 {

    private int idLogin;
    private String user;
    private String pass;
    private String rol;
    private Usuario usuario;

    public Login1() {
    }

    public Login1(int idLogin, String user, String pass, String rol, Usuario usuario) {
        this.idLogin = idLogin;
        this.user = user;
        this.pass = pass;
        this.rol = rol;
        this.usuario = usuario;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString()
    {
        return this.user;
    }
 
    
}
