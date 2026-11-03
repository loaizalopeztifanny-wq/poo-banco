/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author User
 */
public class Banco {
    private String codigo;
    private String domicilioCentral;

    public Banco(String codigo, String domicilioCentral) {
        this.codigo = codigo;
        this.domicilioCentral = domicilioCentral;
    }
    
    public String getCodigo (){
        return codigo;
    }
    
    public void setCodigo (String codigo){
        
    }
}
