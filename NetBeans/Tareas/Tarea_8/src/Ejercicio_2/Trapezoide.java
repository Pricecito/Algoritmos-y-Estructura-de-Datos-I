/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Trapezoide extends Cuadrilatero {
    protected double area;
    public Trapezoide(double ladA,double ladB,double ladC,double ladD){
        super(ladA, ladB, ladC, ladD);
    }
    public boolean esTrapezoide(){
        boolean xT=false;
        double a=this.lA;
        double b=this.lB;
        double c=this.lC;
        double d=this.lD;
        if(b==a||b==c||b==d){
            if(a>c||c>d){
              xT=true; 
            }
        }
        return xT;
    }
    public double calcularArea(){
        double Bma,Bme;
        double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Escrbir la altura del paralelogramo"));
        if(this.lA==this.lB){
            Bma=Math.max(this.lB,this.lD);
            Bme=Math.min(this.lB,this.lD);
        }else if(this.lB==this.lD){
            Bma=Math.max(this.lA,this.lC);
            Bme=Math.min(this.lA,this.lC);
        }else if(this.lA==this.lB){
            Bma=Math.max(this.lC,this.lD);
            Bme=Math.min(this.lC,this.lD);
        }else{
            Bma=Math.max(this.lA,this.lB);
            Bme=Math.min(this.lA,this.lB);
        }
        this.area=(Bma+Bme)/2.0*altura;
        return area;
    }
}
