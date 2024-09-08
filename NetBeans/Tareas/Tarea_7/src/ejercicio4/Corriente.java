/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author jmgut
 */
public class Corriente {
    private double V;
    private double R1;
    private double R2;
    private double Req;
    public Corriente(double r1,double r2,double t){
        this.R1=r1;
        this.R2=r2;
        this.V=t;
    }
    public double CalcularParalelo(){
        double IP;
        this.Req=(this.R1*this.R2)/(this.R1+this.R2);
        IP=this.V/this.Req;
        return IP;
    }
    public double CalcularSerie(){
        double IS;
        this.Req=this.R1+this.R2;
        IS=this.V/this.Req;
        return IS;
    }
    
}
