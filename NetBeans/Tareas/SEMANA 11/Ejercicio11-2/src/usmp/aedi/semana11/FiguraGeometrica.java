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
public abstract class FiguraGeometrica 
{
    protected String nombre;
    
    public FiguraGeometrica()
    {
        this.nombre=JOptionPane.showInputDialog("INGRESE NOMBRE");
    }
    
    public FiguraGeometrica(String nombre)
    {
        this.nombre=nombre;
    }

    public String getNombre() 
    {
        return nombre;
    }
    
    public abstract double area();
}
