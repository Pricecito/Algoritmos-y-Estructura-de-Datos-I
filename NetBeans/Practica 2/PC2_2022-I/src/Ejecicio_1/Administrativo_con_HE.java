/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecicio_1;

/**
 *
 * @author jmgut
 */
public class Administrativo_con_HE extends Administrativo{
    private int horasExtras;
    public Administrativo_con_HE(){
        
    }
    public Administrativo_con_HE(int horasextras,String area,int horastrabajadas,double sueldoporhora,String nombre,String apellido,String genero,int dni){
        super(area,horastrabajadas,sueldoporhora,nombre,apellido,genero,dni);
        this.horasExtras=horasextras;
    }    
    public int calcular(){
        return (int)(this.getHorastrabajadas()*this.getSueldoporhora());
    }
}
