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
public class Rectangulo extends Cuadrilatero {
    protected double area;
    public Rectangulo(double ladA,double ladB,double ladC,double ladD){
        super(ladA, ladB, ladC, ladD);
    }
    public boolean esRectangulo(){
        boolean xR=false;
        double a=this.lA;
        double b=this.lB;
        double c=this.lC;
        double d=this.lD;
        if(a+b==c+d||a+c==b+d){
                xR=true;
        }
        return xR;
    }
    public double calcularArea(){
        double ladMa=Math.max(this.lA,Math.max(this.lB,this.lC));
        double ladMe=Math.min(this.lA,Math.min(this.lB,this.lC));
        this.area =ladMa*ladMe;
        return area;
    }
}
