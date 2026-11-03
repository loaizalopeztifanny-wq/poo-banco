/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ASUS
 */
import java.util.Date;

public class contrato {
    private Date fecha;
    private String nombre;
    private Boolean arma;

    public contrato(Date fecha, String nombre, Boolean arma) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.arma = arma;
    }

    public Boolean getArma() {
        return arma;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setArma(Boolean arma) {
        this.arma = arma;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
