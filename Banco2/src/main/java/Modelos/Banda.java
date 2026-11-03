/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author User
 */
public class Banda {
    private String codigo;
    private int numeroMiembros;

    public Banda(String codigo, int numeroMiembros) {
        this.codigo = codigo;
        this.numeroMiembros = numeroMiembros;
    }
    
    public String getCodigo (){
        return codigo;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public int getNumeroMiembros (){
        return numeroMiembros;
    }
    
    public void setNumeroMiembros (int numeroMiembros){
        this.numeroMiembros = numeroMiembros;
    }
}
