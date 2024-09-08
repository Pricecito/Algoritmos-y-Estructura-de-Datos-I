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
public class Punto {
    public double corEjeY;
    public double corEjeX;
    public Punto(){
        this.corEjeX=Double.parseDouble(JOptionPane.showInputDialog(null,"Coordenada en el eje X: ","ENTRADA",JOptionPane.QUESTION_MESSAGE));
        this.corEjeY=Double.parseDouble(JOptionPane.showInputDialog(null,"Coordenada en el eje Y: ","ENTRADA",JOptionPane.QUESTION_MESSAGE));
    }
    public void Mostrar(){
        JOptionPane.showMessageDialog(null,"("+this.corEjeX+"; "+this.corEjeY+")");
    }
}
