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
public class Poligono {
    private int lados;
    private int vertice;
    public Poligono(){
        this.lados=Integer.parseInt(JOptionPane.showInputDialog(null,"NUMERO DE LADOS","ENTRADA",JOptionPane.QUESTION_MESSAGE));
        this.vertice=Integer.parseInt(JOptionPane.showInputDialog(null,"NUMERO DE VERTICES:","ENTRADA",JOptionPane.QUESTION_MESSAGE));
    }
    public boolean esPoligono(){
        boolean x=false;
        if(this.lados>=3&&this.vertice==this.lados&&this.vertice>=3){
            x=true;
        }
        return x;
    }
}
