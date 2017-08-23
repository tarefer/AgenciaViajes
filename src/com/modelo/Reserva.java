
package com.modelo;

/**
 * Nombre de la clase: Reserva
 * Fecha: 22/08/2017
 * Versión: 1.0
 * Copyright: Fernando Montes
 * @author fernando.montes
 */
public class Reserva {
    private int id_reserva;
    private String num_reserva;
    private String fecha_salida;
    private String fecha_ingreso;
    private int num_dia;
    private String tipo_reserva;
    private int id_paquete;

    public Reserva() {
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getNum_reserva() {
        return num_reserva;
    }

    public void setNum_reserva(String num_reserva) {
        this.num_reserva = num_reserva;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getNum_dia() {
        return num_dia;
    }

    public void setNum_dia(int num_dia) {
        this.num_dia = num_dia;
    }

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }
    
    
    

}
