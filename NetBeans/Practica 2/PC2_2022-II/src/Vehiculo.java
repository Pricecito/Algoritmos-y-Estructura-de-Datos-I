
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlumnoUSMP
 */
public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    public Vehiculo(){
        this.matricula=JOptionPane.showInputDialog(null, "INGRESE MATRICULA");
        this.marca=JOptionPane.showInputDialog(null, "INGRESE MARCA");
        this.modelo=JOptionPane.showInputDialog(null, "INGRESE MODELO");
    }
    public Vehiculo(String matricula,String marca,String modelo){
        this.marca=marca;
        this.matricula=matricula;
        this.modelo=modelo;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"MATRICULA: "+this.matricula+"\nMARCA: "+this.marca+"\nMODELO: "+this.modelo,"MOSTRAR INFORMACION",JOptionPane.INFORMATION_MESSAGE);   
    }
}
