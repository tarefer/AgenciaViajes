
package com.modelo;

/**
 * Nombre de la clase: Aerolinea
 * Fecha: 22/08/2017
 * Versión: 1.0
 * Copyright: Fernando montes
 * @author fernando.montes
 */
public class Aerolinea {
    private int id_Aerolinea;
    private String nombre_Aerolinea;
    private String numero_vuelo;
    private String destino;
    private String numero_asiento;
    private int telefono;
    private String sito_web;
    private String notas;

    public Aerolinea() {
    }

    public int getId_Aerolinea() {
        return id_Aerolinea;
    }

    public void setId_Aerolinea(int id_Aerolinea) {
        this.id_Aerolinea = id_Aerolinea;
    }

    public String getNombre_Aerolinea() {
        return nombre_Aerolinea;
    }

    public void setNombre_Aerolinea(String nombre_Aerolinea) {
        this.nombre_Aerolinea = nombre_Aerolinea;
    }

    public String getNumero_vuelo() {
        return numero_vuelo;
    }

    public void setNumero_vuelo(String numero_vuelo) {
        this.numero_vuelo = numero_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNumero_asiento() {
        return numero_asiento;
    }

    public void setNumero_asiento(String numero_asiento) {
        this.numero_asiento = numero_asiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSito_web() {
        return sito_web;
    }

    public void setSito_web(String sito_web) {
        this.sito_web = sito_web;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    
    
}
