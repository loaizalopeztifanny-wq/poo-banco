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

public class atraco {
    private Date fecha;
    private String sentencia;
    private int anosCondena;

    public atraco(Date fecha, String sentencia, int anosCondena) {
        this.fecha = fecha;
        this.sentencia = sentencia;
        this.anosCondena = anosCondena;
    }

    public int getAnosCondena() {
        return anosCondena;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setAnosCondena(int anosCondena) {
        this.anosCondena = anosCondena;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }
       
}
