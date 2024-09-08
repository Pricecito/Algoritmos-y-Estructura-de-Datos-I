/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Car extends Vehicle{
    private int velocidad;
    public Car(){
        this.matricula=Utilitario.generarAleatorio(5000, 9999);
        this.marca=JOptionPane.showInputDialog(null,"INSERTAR MARCA:").toUpperCase();
        this.modelo=JOptionPane.showInputDialog(null,"INSERTAR MODELO:").toUpperCase();
        this.cap_tanque=Utilitario.generarAleatorio(40, 120);
        this.velocidad=Integer.parseInt(JOptionPane.showInputDialog(null,"INSERTAR VELOCIDAD:"));
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int vel){
        this.velocidad=vel;
    }
    public void combustible(){
        double pr=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE PRECIO DEL GALON DE GASOLINA"));
        double precio=(this.cap_tanque*3.78541)*pr;
        double km=(this.cap_tanque/12.0)*100.0;
        JOptionPane.showMessageDialog(null, "TANQUEADA: "+precio+" SOLES\nRECORRIDO ESPERADO: "+km);
    }
}
