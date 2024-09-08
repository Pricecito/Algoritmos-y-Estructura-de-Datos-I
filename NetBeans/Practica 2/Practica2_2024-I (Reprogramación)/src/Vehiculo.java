
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usmp
 */
public class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo() {
        this.matricula = JOptionPane.showInputDialog("INGRESE MATRICULA").toUpperCase();
        this.marca = JOptionPane.showInputDialog("INGRESE MARCA").toUpperCase();
        this.modelo = JOptionPane.showInputDialog("INGRESE MODELO").toUpperCase();
    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null,
                "\nMATRICULA:" + this.matricula
                + "\nMARCA:" + this.marca
                + "\nMODELO:" + this.modelo);
    }

    public void modificarDatos() {
        this.marca = "Toyota";
        this.modelo = "RAV4";
    }
}
