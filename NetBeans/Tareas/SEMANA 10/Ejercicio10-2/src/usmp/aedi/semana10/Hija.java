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
public class Hija extends Padre
{
  protected String carrera;
  
  public Hija(String nombre,int edad)
  {
  	super(nombre,edad);
  }
  
  public Hija(String nombre, int edad, double sueldo, String carrera)
  {
  	super(nombre,edad,sueldo);
  	this.carrera = carrera;
  }
  
  public void setCarrera(String carrera)
  {this.carrera = carrera;}
  
  public String getCarrera()
  {return carrera;}    
  
  public String verMensaje()
  {return "OBJETO DE LA CLASE HIJA";}
}
