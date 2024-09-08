/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_2023.i;

import javax.swing.JOptionPane;

/**
 *
 * @author USMP
 */
public class Utilitario {
    public static int generarAleatorio(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static String ingreso (String msg){
        return JOptionPane.showInputDialog(msg);
    }
    public static void mensaje(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
