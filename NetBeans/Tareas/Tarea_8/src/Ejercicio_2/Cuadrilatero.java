/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author jmgut
 */
public abstract class Cuadrilatero {
    protected double lA;
    protected double lB;
    protected double lC;
    protected double lD;
    protected double perimetro;
    protected double area;
    public Cuadrilatero(double ladA,double ladB,double ladC,double ladD){
        this.lA=ladA;
        this.lB=ladB;
        this.lC=ladC;
        this.lD=ladD;
        this.perimetro=ladA+ladB+ladC+ladD;
    }
    public double getPerimetro(){
        return perimetro;
    }
    public abstract double calcularArea();
}
