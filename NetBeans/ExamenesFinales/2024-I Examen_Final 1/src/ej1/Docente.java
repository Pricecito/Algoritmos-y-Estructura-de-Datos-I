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
public class Docente extends Persona {

    protected int horas;
    protected String gradoacademico;

    public Docente(int codigo, String nombre, String sexo, int edad, int horas, String gradoacademico) {
        super(codigo, nombre, sexo, edad);
        this.horas = horas;
        this.gradoacademico = gradoacademico;
    }

    public int getHoras() {
        return horas;
    }

    public String getGradoacademico() {
        return gradoacademico;
    }

    public void Mostrar() {
        Herramientas.mensaje("SE REGISTRO UN DOCENTE");
    }
}
