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
public class Ordenador {
    private double ROM;
    private double RAM;
    private String procesador;
    private String sistemaOperativo;
    public Ordenador(){
    }
    public void setROM(double rom){
        this.ROM=rom;
    }
    public void setRAM(double ram){
        this.RAM=ram;
    }
    public void setProcesador(String pros){
        if(pros.compareTo("intel")==0){
            this.procesador="Intel";
        }else if(pros.compareTo("amd")==0){
            this.procesador="AMD";
        }else{
            JOptionPane.showMessageDialog(null, "ALTERNATIVA NO VALIDA","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }
    public void setSistemaOperativo(String sis){
        if(sis.compareTo("windows")==0){
            this.sistemaOperativo="Windows";
        }else if(sis.compareTo("mac")==0){
            this.sistemaOperativo="Mac";
        }else if(sis.compareTo("linux")==0){
            this.sistemaOperativo="Linux";
        } else{
            JOptionPane.showMessageDialog(null, "ALTERNATIVA NO VALIDA","ALERTA",JOptionPane.WARNING_MESSAGE);
        }
    }
    public double getROM(){
        return ROM;
    }
    public double getRAM(){
        return RAM;
    }
    public String getProcesador(){
        return procesador;
    }
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }
}
