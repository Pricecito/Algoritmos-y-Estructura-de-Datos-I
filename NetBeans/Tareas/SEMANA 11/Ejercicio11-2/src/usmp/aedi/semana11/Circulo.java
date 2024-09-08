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
public class Circulo extends FiguraGeometrica
{
    private double radio;
    public Circulo(double radio)
    {
        this.radio=radio;
    }
    
    public Circulo(String nombre,double radio)
    {
        super(nombre);
        this.radio=radio;
    }    
    
    public double area()
    {
        return Math.PI*radio*radio;
    }
}
