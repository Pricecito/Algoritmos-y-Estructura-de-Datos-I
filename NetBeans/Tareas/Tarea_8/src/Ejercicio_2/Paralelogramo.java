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
public class Paralelogramo extends Cuadrilatero{
    public Paralelogramo(double ladA,double ladB,double ladC,double ladD){
        super(ladA,ladB,ladC,ladD);
    }
    public boolean esParalelogramo(){
        boolean xP=false;
        double a=this.lA;
        double b=this.lB;
        double c=this.lC;
        double d=this.lD;
        if(a+b==c+d||a+c==b+d){
                xP=true;
        }
        return xP;
    }
    public double calcularArea(){
        double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Escrbir la altura del paralelogramo"));
        double ladMa=Math.max(this.lA,Math.max(this.lB,this.lC));
        this.area=altura*ladMa;
        return area;
    }
}
