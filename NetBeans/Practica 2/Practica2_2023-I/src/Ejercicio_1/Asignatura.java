/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Admin
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private double clacificacion;
    public Asignatura(int codigo,String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCalificacion(){
        return clacificacion;
    }
    public void setCalificacion(double clacificacion){
        this.clacificacion=clacificacion;
    }
    
}
