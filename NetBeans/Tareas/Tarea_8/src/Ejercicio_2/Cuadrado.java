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
public class Cuadrado extends Cuadrilatero {
    protected double area;
    
    public Cuadrado(double ladA,double ladB,double ladC,double ladD){
        super(ladA, ladB, ladC, ladD);
    }
    public boolean esCuadrado(){
        boolean xC=false;
        double a=this.lA;
        double b=this.lB;
        double c=this.lC;
        double d=this.lD;
        if(a==b&&b==c&&c==d){
                xC=true;
        }
        return xC;
    }
    public double calcularArea(){
        this.area=lA*lB;
        return area;
    }
}
