/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author ASUS
 */
public class atracador {
    private String clave;
    private String nombre;
    private int edad;

    public atracador(String clave, String nombre, int edad) {
        this.clave = clave;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
 