/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author JM Gutierrez
 */
public class Car extends Vehicle{
    private int velocidad;

    public Car() {
        super();
        this.velocidad=Utilitario.generarAleatorio(160,420);
    }
    
    public Car(String marca, String modelo){
        super(marca, modelo);
        this.velocidad=Utilitario.generarAleatorio(160,420);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public String mensaje(){
        return "OBJETO CAR CREADO";
    }
}
