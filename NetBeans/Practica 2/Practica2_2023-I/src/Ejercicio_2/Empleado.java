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
public class Empleado extends Persona{
    private double salario;
    public Empleado(String tipo,String nombre,int edad,double salario){
        super(tipo, nombre,edad);
        this.salario=salario;
    }
    public double getSalario(){
        return salario;
    }
    public void modificarDatos(){
        this.nombre=JOptionPane.showInputDialog(null,"INSERTAR NUEVO NOMBRE").toUpperCase();
        this.edad=Integer.parseInt(JOptionPane.showInputDialog(null,"INSERTAR NUEVA EDAD"));
        this.salario=Double.parseDouble(JOptionPane.showInputDialog(null,"INSERTAR NUEVA SALARIO"));
    }
}
    
