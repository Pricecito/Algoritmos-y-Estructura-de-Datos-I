/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import javax.swing.JOptionPane;

/**
 *
 * @author jmgut
 */
public class Utilitario {
    public static void setMensajeError(String m){
        JOptionPane.showMessageDialog(null, m,"ERROR",JOptionPane.WARNING_MESSAGE);
    }
    public static void setMensaje(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    public static String getMensaje(String m){
        return JOptionPane.showInputDialog(null, m);
    }
    
}
