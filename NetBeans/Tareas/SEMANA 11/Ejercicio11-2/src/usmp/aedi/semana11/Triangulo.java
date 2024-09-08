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
public class Triangulo extends FiguraGeometrica
{
    private double base;
    private double altura;
    
    public Triangulo(double base,double altura)
    {
        this.base=base;
        this.altura=altura;
    }

    public Triangulo(String nombre,double base,double altura)
    {
        super(nombre);
        this.base=base;
        this.altura=altura;
    }

    
    public double area()
    {
        return (this.base*this.altura)/2;
    }  
    
}
