/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ASUS
 */
public class juez {
    private String clave;
    private String nombre;
    private int anosServicio;

    public juez(String clave, String nombre, int anosServicio) {
        this.clave = clave;
        this.nombre = nombre;
        this.anosServicio = anosServicio;
    }

    public int getAnosServicio() {
        return anosServicio;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAnosServicio(int anosServicio) {
        this.anosServicio = anosServicio;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
