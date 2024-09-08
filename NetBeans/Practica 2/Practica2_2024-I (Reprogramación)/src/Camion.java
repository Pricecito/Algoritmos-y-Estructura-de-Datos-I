
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
public class Camion extends Vehiculo {

    private String tipo;
    private double carga;

    public Camion(String matricula, String marca, String modelo, String tipo, double carga) {
        super(matricula, marca, modelo);
        this.tipo = tipo;
        this.carga = carga;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCarga() {
        return carga;
    }

    public void modificarDatos() {
        this.carga += Double.parseDouble(JOptionPane.showInputDialog("INGRESAR AUMENTO DE CARGA"));
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null,
                "\nMATRICULA:" + this.matricula
                + "\nMARCA:" + this.marca
                + "\nMODELO:" + this.modelo
                + "\nTIPO: " + this.tipo
                + "\nCARGA: " + this.carga);
    }
}
