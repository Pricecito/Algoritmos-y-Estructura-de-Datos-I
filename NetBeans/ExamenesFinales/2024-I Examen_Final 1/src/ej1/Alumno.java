/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona implements Int_Pension {

    private String carrera;
    private int creditos;

    public Alumno(int codigo, String nombre, String sexo, int edad, String carrera, int creditos) {
        super(codigo, nombre, sexo, edad);
        this.carrera = carrera;
        this.creditos = creditos;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void Mostrar() {
        Herramientas.mensaje("SE REGISTRO UN ALUMNO");
    }

    public double Calcular() {
        double n;
        if (this.carrera.equals("ODONTOLOGIA")) {
            n = Math.round((this.creditos * 189) * 10) / 10;
        } else if (this.carrera.equals("PSICOLOGIA")) {
            n = Math.round((this.creditos * 151.20) * 10) / 10;
        } else {
            n = Math.round((this.creditos * 138.60) * 10) / 10;
        }
        return n;
    }
}
