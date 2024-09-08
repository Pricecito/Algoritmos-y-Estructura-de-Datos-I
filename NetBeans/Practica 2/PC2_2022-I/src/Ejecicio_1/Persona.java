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
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int dni;
    public Persona(){
        this.nombre=Utilitario.getMensaje("INGRESAR NOMBRE").toUpperCase();
        this.apellido=Utilitario.getMensaje("INGRESAR APELLIDO").toUpperCase();
        this.genero=Utilitario.getMensaje("INGRESAR GENERO").toUpperCase();
        this.dni=Integer.parseInt(Utilitario.getMensaje("INGRESAR DNI"));
    }
    public Persona(String n,String a,String g,int dni){
        this.nombre=n;
        this.apellido=a;
        this.genero=g;
        this.dni=dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getGenero(){
        return genero;
    }
    public int getDni(){
        return dni;
    }
    public abstract int calcular();
}
