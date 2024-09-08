/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana10;

/**
 *
 * @author Alumno
 */
public class Padre 
{
  protected String nombre;
  protected int edad;
  protected double sueldo;
  
  public Padre(String nombre,int edad)
  {
  	this.nombre=nombre;
  	this.edad=edad;
  }
  
  public Padre(String nombre, int edad, double sueldo)
  {
  	this.nombre = nombre;
  	this.edad = edad;
  	this.sueldo = sueldo;
  }

  public void setNombre(String nom)
  { this.nombre=nom;}

  public void setEdad(int e)
  { this.edad=e;}

  public void setSueldo(double s)
  { this.sueldo=s;}

  public String getNombre()
  {return nombre;}

  public int getEdad()
  {return edad;}

  public double getSueldo()
  {return sueldo;}
  
  public void cumplirAños()
  {this.edad++;}
  
  public String verMensaje()
  {return "OBJETO DE LA CLASE PADRE";}
}
