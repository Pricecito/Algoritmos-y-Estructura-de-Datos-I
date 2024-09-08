/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author jmgut
 */
public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;
    public Persona(){
    }
    public Persona(String n,int e,String g){
        this.genero=g;
        this.nombre=n;
        this.edad=e;
    }
    public String LeerNombre(){
        return nombre;
    }
    public int LeerEdad(){
        return edad;
    }
    public String LeerGenero(){
        return genero;
    }
    public void CambiarNombre(String n){
        this.nombre=n;
    }
    public void CambiarEdad(int e){
        this.edad=e;
    }
    public abstract double LeerSalario();
}
