/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecicio_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Utilitario {
    public static void setMensajeError(String m){
        JOptionPane.showMessageDialog(null,m,"ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
    }
    public static void setMensaje(String m){
        JOptionPane.showMessageDialog(null,m,"INFORMACION",JOptionPane.INFORMATION_MESSAGE);
    }
    public static String getMensaje(String m){
        return JOptionPane.showInputDialog(null,m,"ENTRADA",JOptionPane.QUESTION_MESSAGE);
    } 
}
