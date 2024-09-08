/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Herramientas {
    public static int generarAleatorio(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static void setMensajeError(String m){
        JOptionPane.showMessageDialog(null,m,"ERROR",JOptionPane.WARNING_MESSAGE);
    }
    public static void setMensaje(String m){
        JOptionPane.showMessageDialog(null,m,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
    }
    public static String getMensaje(String m){
        return JOptionPane.showInputDialog(null,m,"Entrada",JOptionPane.QUESTION_MESSAGE);
    }
}
