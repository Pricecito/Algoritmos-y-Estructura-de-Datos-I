/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Usmp
 */
public abstract class Persona {
    private int codigo;
    private String nom_ape;
    private String sexo;
    private int edad;
    public Persona(){

    }
    public Persona(int c,String na,String s,int e){
        this.codigo=c;
        this.edad=e;
        this.nom_ape=na;
        this.sexo=s;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNom_ape(){
        return nom_ape;
    }
    public String getSexo(){
        return sexo;
    }
    public int getEdad(){
        return edad;
    }
    public abstract void Mostrar();
}
