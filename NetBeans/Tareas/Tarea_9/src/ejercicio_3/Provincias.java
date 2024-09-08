/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author JM Gutierrez
 */
public class Provincias extends CentralTelefonica implements Costo{
    protected int hora;
    public Provincias(String nO,String nD,int d,int h){
        super(nO,nD,d);
        this.hora=h;
    }
    public double CalcularCosto(){
        double costo;
        if(this.hora<5){
            costo=0.2*this.duracion;
        }else if(this.hora<17){
            costo=0.5*this.duracion;
        }else{
            costo=0.8*this.duracion;
        }
        return costo;
    }
}
