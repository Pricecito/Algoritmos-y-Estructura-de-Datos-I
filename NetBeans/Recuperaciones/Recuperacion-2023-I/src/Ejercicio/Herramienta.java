/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Herramienta {
    public static int generarAleatorio(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static String ingreso(String t){
        return JOptionPane.showInputDialog(null,t,"ENTRADA",JOptionPane.QUESTION_MESSAGE);
    }
    public static void mensaje(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    public static void mensajeError(String msg){
        JOptionPane.showMessageDialog(null, msg,"ERROR",JOptionPane.WARNING_MESSAGE);
    }
}
