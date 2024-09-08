/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author JM Gutierrez
 */
public class Libro_Libreria {
    private String nombre;
    private String autor;
    private String seccion;
    public Libro_Libreria(){
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public void setAutor(String aut){
        this.autor=aut;
    }
    public void setSeccion(String sec){
        this.seccion=sec;
    }
    public String getNombre(){
        return nombre;
    }
    public String getAutor(){
        return autor;
    }
    public String getSeccion(){
        return seccion;
    }
}
