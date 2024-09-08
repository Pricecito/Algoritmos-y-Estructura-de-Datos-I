/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author JM Gutierrez
 */
public class Carta {
    private String Lugar;
    private String Dia;
    private String Mes;
    private String Año;
    private String Saludo;
    private String Emisor;
    private String Receptor;
    private String Mensaje;
    public Carta(){
    }
    public void setLugar(String Lug){
        this.Lugar=Lug;
    }
    public void setDia(String D){
        this.Dia=D;
    }
    public void setMes(String M){
        this.Mes=M;
    }
    public void setAño(String A){
        this.Año=A;
    }
    public void setSaludo(String Salu){
        this.Saludo=Salu;
    }
    public void setEmisor(String Emi){
        this.Emisor=Emi;
    }
    public void setReceptor(String Rec){
        this.Receptor=Rec;
    }
    public void setMensaje(String Msj){
        this.Mensaje=Msj;
    }
    public void Mensaje(){
        JOptionPane.showMessageDialog(null,"Fecha: "+this.Dia+"/"+this.Mes+"/"+this.Año+"\nLugar: "+this.Lugar+"\nA: "+this.Receptor+"\nDe parte de: "+this.Emisor+"\n"+this.Saludo+"\n"+this.Mensaje);
    }
}
