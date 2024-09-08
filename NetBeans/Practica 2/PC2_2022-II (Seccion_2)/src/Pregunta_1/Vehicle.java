/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta_1;

/**
 *
 * @author jmgut
 */
public abstract class Vehicle {
    protected int matricula;
    protected String marca;
    protected String modelo;
    protected int cap_tanque;
    public Vehicle(){
        
    }
    public int getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getCap_tanque(){
        return cap_tanque;
    }
    public void setCap_tanque(int cap){
        this.cap_tanque=cap;
    }
    public abstract void combustible();
}
