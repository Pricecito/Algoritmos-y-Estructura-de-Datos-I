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
public class Circulo extends ObjetoGeometrico
{
    private double radio;

    public Circulo(double r, String nom)
    {
            this.nombre=nom;
            this.radio=r;
    }

    public Circulo()
    {
            this.nombre="XXXXXXX";
            this.radio=1.0;
    }

    public double getRadio()
    {
            return radio;
    }

    public String getNombre()
    {
            return nombre;
    }

    public double calcularArea()
    {
            return radio*radio+Math.PI;
    }

    public double calcularPerimetro()
    {
            return 2*Math.PI*radio;
    }
    
}
