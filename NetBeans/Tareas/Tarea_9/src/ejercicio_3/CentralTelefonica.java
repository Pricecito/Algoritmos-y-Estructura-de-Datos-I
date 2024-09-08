/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

/**
 *
 * @author Admin
 */
public class CentralTelefonica {
    protected String nDestino;
    protected String nOrigen;
    protected int duracion;
    public CentralTelefonica(String nO,String nD,int d){
        this.nOrigen=nO;
        this.nDestino=nD;
        this.duracion=d;
    }
    public String getnDestino(){
        return nDestino;
    }
    public String getnOrigen(){
        return nOrigen;
    }
    public int getDuracion(){
        return duracion;
    }
}
