/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta2;

/**
 *
 * @author jmgut
 */
public abstract class Persona {
    protected String nombre;
    protected int edad;
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public abstract void modificarDatos();
}
