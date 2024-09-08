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
public abstract class Administrativo extends Persona{
    private String area;
    private int horastrabajadas;
    private double sueldoporhora;
    public Administrativo(){
        super();
        this.area=Utilitario.getMensaje("INGRESE AREA").toUpperCase();
        int c=Integer.parseInt(Utilitario.getMensaje("INGRESE HORAS"));
        if(c<=40){
            this.horastrabajadas=c;
            this.sueldoporhora=Integer.parseInt(Utilitario.getMensaje("INGRESE SUELDO POR HORA"));
        }else{
            Utilitario.setMensajeError("Las horas trabajadas tiene que ser\nmenores o iguales que 40");
        }
    }
    public Administrativo(String area,int horastrabajadas,double sueldoporhora,String nombre,String apellido,String genero,int dni){
        super(nombre,apellido,genero,dni);
        this.area=area;
        this.horastrabajadas=horastrabajadas;
        this.sueldoporhora=sueldoporhora;
    }
    public String getArea(){
        return area;
    }
    public int getHorastrabajadas(){
    return horastrabajadas;
    }
    public double getSueldoporhora(){
        return sueldoporhora;
    }  
}
