/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Estudiante extends Persona{
    private String carrera;
    public Estudiante(String tipo,String nombre,int edad,String carrera){
        super(tipo,nombre,edad);
        this.carrera=carrera;
    }
    public String getCarrera(){
        return carrera;
    }
    public void modificarDatos(){
        this.nombre=JOptionPane.showInputDialog(null,"INSERTAR NUEVO NOMBRE").toUpperCase();
        this.edad=Integer.parseInt(JOptionPane.showInputDialog(null,"INSERTAR NUEVA EDAD"));
        this.carrera=JOptionPane.showInputDialog(null,"INSERTAR NUEVA CARRERA").toUpperCase();
    }
}
