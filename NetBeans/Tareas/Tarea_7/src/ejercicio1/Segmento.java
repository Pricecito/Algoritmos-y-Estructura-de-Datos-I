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
public class Segmento {
    private int pEjeX;
    private int pEjeY;
    public Segmento(){
        this.pEjeX=(int)(Math.random()*(20-10+1)+10);
        this.pEjeY=(int)(Math.random()*(20-10+1)+10);
    }
    public void setSegmento(int cEjeX,int cEjeY){
        this.pEjeX=cEjeX;
        this.pEjeY=cEjeY;
    }
    public int getEjeX(){
        return pEjeX;
    }
    public int getEjeY(){
        return pEjeY;
    }
    public static void MostrarSegmento(Segmento B,Segmento C){
        double Modulo=Math.round(Math.sqrt(Math.pow((B.getEjeX()-C.getEjeX()),2)+Math.pow((B.getEjeY()-C.getEjeY()),2))*100.0)/100.0;
        JOptionPane.showMessageDialog(null,"Punto A: ("+B.getEjeX()+"; "+B.getEjeY()+") \n Punto B: ("+C.getEjeX()+"; "+C.getEjeY()+")"+"\n Su longitud es: "+Modulo);
    }
}
