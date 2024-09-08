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
public class Cuadrado extends Figura implements Rotable,Dibujable
{
    private double lado;
    public Cuadrado (String nombre,double lado)
    {
        super(nombre);
        this.lado = lado;
    }

    public double area()
    {
            return lado*lado;
    }
    
    public void rotar(double x)
    {
        JOptionPane.showMessageDialog(null,"EL CUADRADO ROTO "+x+" GRADOS","INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void dibujar(double x,double y)
    {
        JOptionPane.showMessageDialog(null,"EN EL CUADRADO SE DIBUJO \nUN PUNTO EN ("+x+","+y+")"
                ,"INFORMACIÓN",JOptionPane.INFORMATION_MESSAGE);    
    }
}
