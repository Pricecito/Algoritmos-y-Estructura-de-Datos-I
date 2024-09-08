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
public class Locales extends CentralTelefonica implements Costo{
    public Locales(String nO,String nD,int d){
        super(nO,nD,d);
    }
    public double CalcularCosto(){
        return 0.1*this.duracion;
    }
}
