/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author User
 */
public class Sucursal {
    private String codigo;
    private String domicilio;
    private int numeroEmpleados;
    private contrato[] contrato;

    public Sucursal(String codigo, String domicilio, int numeroEmpleados, contrato[] contrato) {
        this.codigo = codigo;
        this.domicilio = domicilio;
        this.numeroEmpleados = numeroEmpleados;
        this.contrato = contrato;
    }
    
    public String getCodigo (){
        return codigo;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
     public String getDomicilio (){
        return domicilio;
    }
     
    public void setDomicilio (String domicilio){
        this.domicilio = domicilio;
    }
     
    public int getNumeroEmpleados(){
        return numeroEmpleados;
    }
    
    public void setNumeroEmpleados(int numeroEmpleados){
        this.numeroEmpleados = numeroEmpleados;
    }

    public contrato[] getContrato() {
        return contrato;
    }

    public void setContrato(contrato[] contrato) {
        this.contrato = contrato;
    }

    
    
    
}
