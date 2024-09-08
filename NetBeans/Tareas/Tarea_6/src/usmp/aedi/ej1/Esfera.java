/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.ej1;

/**
 *
 * @author Admin
 */
public class Esfera {
    
    double radio;
    
    public Esfera(double rad){
        this.radio=rad;
    }
    public Esfera(double rad, double num){
        this.radio=rad+num;
    }
    double volumen(){//public double Volumen
        return Math.round((4.0/3.0)*Math.PI*Math.pow(this.radio,3.0)*100.00)/100.00;
    }
    double superficie(){//public double Superficie
        return Math.round(4.0*Math.PI*Math.pow(this.radio,2.0)*100.00)/100.00;
    }
}
