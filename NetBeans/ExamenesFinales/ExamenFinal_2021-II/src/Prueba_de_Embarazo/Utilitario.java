/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba_de_Embarazo;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Utilitario {
    public static int generarAleatorio(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static String generarAleatorio(){
        switch((int)(Math.random()*(1-0+1)+0)){
            case 0: return "FEMENINO";
            default: return "MASCULINO";
        }
    }
    public static void MensajeError(String m){
        JOptionPane.showMessageDialog(null,m,"ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
    }
    public static void Mensaje(String m){
        JOptionPane.showMessageDialog(null,m,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
    }
    public static String ingreso(String m){
        return JOptionPane.showInputDialog(null,m,"ENTRADA",JOptionPane.QUESTION_MESSAGE);
    } 
}
