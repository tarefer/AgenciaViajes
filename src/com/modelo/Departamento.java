
package com.modelo;

/**
 * Nombre de la clase: Departamento
 * Fecha: 22/08/2017
 * Versión: 1.0
 * Copyright: Fernando Montes
 * @author fernando.montes
 */
public class Departamento {
    
    private int id_departamento;
    private String nombre;
    private int id_municipio;

    public Departamento() {
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(int id_municipio) {
        this.id_municipio = id_municipio;
    }
    
    

}
