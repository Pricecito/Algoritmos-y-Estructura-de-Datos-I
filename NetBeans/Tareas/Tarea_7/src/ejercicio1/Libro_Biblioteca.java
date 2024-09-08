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
public class Libro_Biblioteca {
    private int codigo;
    private String autor;
    private String categoria;
    private String Nombre;
    private int nPag;
    public Libro_Biblioteca(){
    }
    public void setCodigo(int codi){
        this.codigo=codi;
    }
    public void setAutor(String Aut){
        this.autor=Aut;
    }
    public void setCategoria(String Cat){
        this.categoria=Cat;
    }
    public void setNpag(int nP){
        this.nPag=nP;
    }
    public void setNombre(String nom){
        this.Nombre=nom;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getAutor(){
        return autor;
    }
    public String getCategoria(){
        return categoria;
    }
    public int getNpag(){
        return nPag;
    }
    public String getNombre(){
        return Nombre;
    }
}
