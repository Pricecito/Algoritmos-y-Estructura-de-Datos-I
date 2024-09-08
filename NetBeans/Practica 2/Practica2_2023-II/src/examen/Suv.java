/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author JM Gutierrez
 */
public class Suv extends Car{
    private String traccion;

    public Suv(String marca, String modelo) {
        super(marca, modelo);
        this.traccion=JOptionPane.showInputDialog("INGRESE TRACCIÓN:");
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String mensaje(){
        return "OBJETO SUV CREADO";
    }
    
}
