/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author User
 */
import java.util.ArrayList;

public class Bancoo {
    private String codigo;
    private String nombreBanco;
    private String domicilioCentral;
    private ArrayList<Sucursal> sucursales;

    public Bancoo(String codigo, String nombreBanco, String domicilioCentral, ArrayList<Sucursal> sucursales) {
        this.codigo = codigo;
        this.nombreBanco = nombreBanco;
        this.domicilioCentral = domicilioCentral;
        this.sucursales = sucursales;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }
    
    public String getCodigo(){
        return codigo;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public String getDomicilioCentral (){
        return domicilioCentral;
    }
    
    public void setDomicilioCentral(String domicilioCentral){
        this.domicilioCentral = domicilioCentral;
    }

    public void setSucursales(Sucursal[] sucursales) {
        this.sucursales = sucursales;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
}
