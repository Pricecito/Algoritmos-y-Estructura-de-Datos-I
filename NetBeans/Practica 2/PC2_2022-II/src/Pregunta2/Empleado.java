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
public class Empleado extends Persona{
    private double salario;
    public Empleado(String n,int e,double s){
        super(n,e);
        this.salario=s;
    }
    public double getSalario(){
        return salario;
    }
    public void modificarDatos(){
        this.edad-=10;
        this.salario+=500;
    }
}
