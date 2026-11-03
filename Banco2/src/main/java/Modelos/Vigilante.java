/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.util.Date;
/**
 *
 * @author User
 */
public class Vigilante {
    private String codigo;
    private Date fechaNacimiento;

    public Vigilante(String codigo, Date fechaNacimiento) {
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public String getCodigo (){
        return codigo;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public Date getFechaNacimiento (){
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento (Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
}
