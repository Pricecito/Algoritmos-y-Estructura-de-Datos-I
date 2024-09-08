
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
public class Camion extends Vehiculo{
    private String tipo;
    private double carga;
    public Camion (String mat,String mar,String mod){
        super(mat,mar,mod);
        String t=JOptionPane.showInputDialog(null, "INGRESE TIPO").toUpperCase();
        if(t.compareTo("SEMILIVIANO")==0||t.compareTo("SEMILIVIANO")==0){
            this.tipo=t;
        }else{
            JOptionPane.showMessageDialog(null, "TIPO INCORRECTO, VUELVA A INGRESARLO");
        }
        this.carga=Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE CARGA"));
    }
    public String getTipo(){
        return tipo;
    }
    public double getCarga(){
        return carga;
    }
    public void modificarDatos(){
        this.carga+=Double.parseDouble(JOptionPane.showInputDialog(null, "INSERTAR CARGA A AGREGAR:"));
        mostrar();
    }
    public void mostrar(){
        JOptionPane.showMessageDialog(null,"MATRICULA: "+this.matricula+"\nMARCA: "+this.marca+"\nMODELO: "+this.modelo+"\nTIPO: "+this.tipo+"\nCARGA: "+this.carga);   
    }
}
