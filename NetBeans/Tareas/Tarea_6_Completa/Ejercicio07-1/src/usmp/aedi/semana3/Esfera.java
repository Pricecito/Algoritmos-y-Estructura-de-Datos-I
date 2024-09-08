 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana3;

/**
 *
 * @author Alumno
 */
public class Esfera {
    
    double radio;

    public Esfera(double ra)
    {
        this.radio=ra;
    }

    public Esfera(double ra,double x)
    {
        this.radio=ra+x;
    }

    public double volumen()
    {
        return Math.round(4.0 * Math.PI * Math.pow(this.radio,2.0)*100.0)/100.0;
    }	

    public double superficie()
    {
        return Math.round((4.0/3.0) * Math.PI * Math.pow(this.radio,3.0)*100.0)/100.0;
    }
    
}



//return Math.round(4.0 * Math.PI * Math.pow(this.radio,2.0)*100.0)/100.0;
//return Math.round((4.0/3.0) * Math.PI * Math.pow(this.radio,3.0)*100.0)/100.0;	