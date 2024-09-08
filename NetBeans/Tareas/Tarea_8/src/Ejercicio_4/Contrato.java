/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author JM Gutierrez
 */
public class Contrato extends Documento{
    protected int DNI;
    protected String emisor;
    protected String rSocial;
    protected String Pais;
    public Contrato(String f){
        super(f);
        this.emisor=JOptionPane.showInputDialog(null,"INGRESAR NOMBRE DE EMISOR:").toUpperCase();
        this.DNI=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESAR NUMERO DE DNI:"));
        this.Pais=JOptionPane.showInputDialog(null,"INGRESAR PAIS:").toUpperCase();
        this.rSocial=JOptionPane.showInputDialog(null,"INGRESAR RAZON SOCIAL:").toUpperCase();
    }
    public String getEmisor(){
        return emisor;
    }
    public int getDNI(){
        return DNI;
    }
    public String getRSocial(){
        return rSocial;
    }
    public String getPais(){
        return Pais;
    }
}
