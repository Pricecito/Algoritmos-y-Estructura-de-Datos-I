package usmp.aedi.semana11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public abstract class Figura 
{
    protected String nombre;
    
    public Figura(String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public abstract double area();
}
