
package com.modelo;

/**
 * Nombre de la clase: Pais
 * Fecha: 22/08/2017
 * Versión: 1.0
 * Copyright: Fernando Montes   
 * @author fernando.montes
 */
public class Pais {
    private int id_pais;
    private String nombre;
    private String aeropuerto;
    private String area;
    private String restricciones;

    public Pais() {
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }
    
    @Override
    public String toString(){
        return this.getNombre();
    }
    

}
