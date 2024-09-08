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
public class Docente_TC extends Docente implements Int_Salario {

    private String periodo_con;

    public Docente_TC(int codigo, String nombre, String sexo, int edad, int horas, String gradoacademico, String periodo_con) {
        super(codigo, nombre, sexo, edad, horas, gradoacademico);
        this.periodo_con = periodo_con;
    }

    public String getPeriodo_con() {
        return periodo_con;
    }

    public double Salario() {
        double p;
        switch (this.periodo_con) {
            case "ANUAL":
                switch (this.gradoacademico) {
                    case "BACHILLER":
                        p = 4200.00;
                    case "MAGISTER":
                        p = 4500.00;
                    default:
                        p = 4800.00;
                }
            default:
                switch (this.gradoacademico) {
                    case "BACHILLER":
                        p = 3000.00;
                    case "MAGISTER":
                        p = 3250.00;
                    default:
                        p = 3500.00;
                }
        }
        return p;
    }
}
