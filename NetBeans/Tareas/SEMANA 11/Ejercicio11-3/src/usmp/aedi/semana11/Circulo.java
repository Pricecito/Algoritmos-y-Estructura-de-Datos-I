/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana11;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Circulo extends Figura implements Dibujable
{
    private double radio;
    
    public Circulo (String nombre,double radio)
    {
        super(nombre);
        this.radio = radio;
    }	

    public double area ()
    {
        return Math.PI*radio*radio;
    }
    
    public void dibujar(double x,double y)
    {
        JOptionPane.showMessageDialog(null,"EN EL CIRCULO SE DIBUJO \nUN PUNTO EN ("+x+","+y+")"
                ,"INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);  
    }
}
