/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author JM Gutierrez
 */
public class Telefono {
    private int numero;
    private String usuario;
    private String plan;
    public Telefono(){
    }
    public void setNumero(int num){
        this.numero=num;
    }
    public void setUsuario(String us){
        this.usuario=us;
    }
    public void setPlan(int pla){
        switch(pla){
            case 1:this.plan="S/.39.90";
            case 2:this.plan="S/.59.90";
            case 3:this.plan="S/.79.90";
            case 4:this.plan="S/.99.90";
        }
    }
    public int getNumero(){
        return numero;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getPlan(){
        return plan;
    }
}
