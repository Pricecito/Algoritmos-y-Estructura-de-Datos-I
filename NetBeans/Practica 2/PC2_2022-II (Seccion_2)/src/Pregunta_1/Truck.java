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
public class Truck extends Vehicle{
    private String tipo;
    private double carga;
    public Truck(){
        this.matricula=Utilitario.generarAleatorio(5000, 9999);
        this.marca=JOptionPane.showInputDialog(null,"INSERTAR MARCA:").toUpperCase();
        this.modelo=JOptionPane.showInputDialog(null,"INSERTAR MODELO:").toUpperCase();
        this.cap_tanque=Utilitario.generarAleatorio(250, 300);
        String t=JOptionPane.showInputDialog(null,"INSERTAR TIPO:").toUpperCase();
        if(t.compareTo("PESADO")==0||t.compareTo("SEMIPESADO")==0){
            this.tipo=t;
        }else{
            JOptionPane.showMessageDialog(null, "TIPO INCORRECTO, VUELVA A INGRESARLO");
        }
        this.carga=Double.parseDouble(JOptionPane.showInputDialog(null,"INSERTAR CARGA:"));
    }
    public String getTipo(){
        return tipo;
    }
    public double getCarga(){
        return carga;
    } 
    public void setTipo(String t){
        this.tipo=t;
    }
    public void setCarga(double c){
        this.carga=c;
    }
    public void combustible(){
        double pr=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE PRECIO DEL GALON DE DIESEL"));
        double precio=(this.cap_tanque*3.78541)*pr;
        double km=(this.cap_tanque/38.0)*100.0;
        JOptionPane.showMessageDialog(null, "TANQUEADA: "+precio+" SOLES\nRECORRIDO ESPERADO: "+km);
    }
}
