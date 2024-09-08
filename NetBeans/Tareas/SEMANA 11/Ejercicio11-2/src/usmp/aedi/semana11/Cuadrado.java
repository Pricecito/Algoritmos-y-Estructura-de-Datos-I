/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana11;

/**
 *
 * @author Alumno
 */
public class Cuadrado extends FiguraGeometrica
{
    private double lado;
    
    public Cuadrado(double lado)
    {
        this.lado=lado;
    }
   
    public Cuadrado(String nombre,double lado)
    {
        super(nombre);
        this.lado=lado;
    }
    
    public double getLado()
    {
        return this.lado;
    }
    

     public double area()
    {
        return Math.pow(this.lado,2);
    }    
}
