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
public class Truck extends Vehicle{
    private String tipo;
    private double carga;

    public Truck() {
        super();
        String t;boolean x;
        do{
            x=false;
            t=JOptionPane.showInputDialog(null,"INGRESE TIPO:", "ENTRADA", JOptionPane.QUESTION_MESSAGE).toUpperCase();
            if(t.equals("PESADO")==false&&t.equals("SEMIPESADO")==false){
                JOptionPane.showMessageDialog(null, "TIPO INCORRECTO, VUELVA A INGRESARLO");x=true;
            }
        }while(x);
        this.tipo=t;
        this.carga=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE CARGA:", "ENTRADA", JOptionPane.QUESTION_MESSAGE));
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public String mensaje(){
        return "OBJETO TRUCK CREADO";
    }
}

