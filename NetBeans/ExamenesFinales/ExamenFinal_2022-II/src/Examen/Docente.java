/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

/**
 *
 * @author Usmp
 */
public class Docente extends Persona {
    protected int horas;
    protected String gradoacademico;
    public Docente(int c,String na,String s,int e, int h,String gA){
        super(c, na, s, e);
        this.horas=h;
        this.gradoacademico=gA;
    }
    public int getHoras(){
        return horas;
    }
    public String getGradoacademico(){
        return gradoacademico;
    }
    public void Mostrar(){
        Herramientas.mensaje("SE REGISTRO UN DOCENTE");
    }
}
