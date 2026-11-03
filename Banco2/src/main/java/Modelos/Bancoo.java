/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author User
 */
public class Bancoo {
    private String codigo;
    private String domicilioCentral;
    private Sucursal[] sucursales;

    public Bancoo(String codigo, String domicilioCentral, Sucursal[] sucursales) {
        this.codigo = codigo;
        this.domicilioCentral = domicilioCentral;
        this.sucursales = sucursales;
    }
    
    public String getCodigo(){
        return codigo;
    }

    public Sucursal[] getSucursales() {
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
    
    
}
