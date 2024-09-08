/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author JM Gutierrez
 */
public class CV extends Contrato{
    protected String carrera;
    protected String escuela;
    protected String especialidad;
    public CV(String f){
        super(f);
        this.carrera=JOptionPane.showInputDialog(null,"INGRESAR CARRERA:").toUpperCase();
        this.especialidad=JOptionPane.showInputDialog(null,"INGRESAR ESPECIALIDAD:").toUpperCase();
        this.escuela=JOptionPane.showInputDialog(null,"INGRESAR ESCUELA:").toUpperCase();
        
    }
    public String getCarrera(){
        return carrera;
    }
    public String getEscuela(){
        return escuela;
    }
    public String getEspecialidad(){
        return especialidad;
    }
}
