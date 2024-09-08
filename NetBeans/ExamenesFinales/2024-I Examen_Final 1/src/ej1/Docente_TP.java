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
public class Docente_TP extends Docente implements Int_Salario {

    private String unidad_acad;

    public Docente_TP(int codigo, String nombre, String sexo, int edad, int horas, String gradoacademico, String unidad_acad) {
        super(codigo, nombre, sexo, edad, horas, gradoacademico);
        this.unidad_acad = unidad_acad;
    }

    public String getUnidad_acad() {
        return unidad_acad;
    }

    public double Salario() {
        double s;
        switch (this.gradoacademico) {
            case "BACHILLER":
                s = this.horas * 25;
            case "MAGISTER":
                s = this.horas * 30;
            default:
                s = this.horas * 35;
        }
        return s;
    }
}
