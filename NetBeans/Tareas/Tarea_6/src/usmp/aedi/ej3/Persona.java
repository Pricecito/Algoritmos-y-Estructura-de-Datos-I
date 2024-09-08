/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.ej3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Persona {
    static String empresa="USMP";
    String Nombre;
    int Edad;
    double Estatura;
    public Persona(){
        this.Nombre=JOptionPane.showInputDialog("INGRESE NOMBRE");
        this.Edad= Integer.parseInt(JOptionPane.showInputDialog("INGRESE EDAD"));
        this.Estatura=Double.parseDouble(JOptionPane.showInputDialog("INGRESE ESTATURA"));
    }
    public Persona(String E,String N,int ED,double ES){
        empresa=E;
        this.Nombre=N;
        this.Edad=ED;
        this.Estatura=ES;            
    }  
    public String Mostrar(){
        String datos=empresa+"\n"+this.Nombre+"\n"+String.valueOf(this.Edad)+"\n"+String.valueOf(this.Estatura);
        return datos;
    }
}
