/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_2023.ii;
/**
 *
 * @author JM Gutierrez
 */
public abstract class Docente extends Persona{
    protected int horas;
    protected String gradoAcademico;
    
    public Docente(int horas, String gradoAcademico, String nom_ape, String sexo, int edad, int codigo) {
        super(nom_ape, sexo, edad, codigo);
        this.horas = horas;
        this.gradoAcademico = gradoAcademico;
    }

    public int getHoras() {
        return horas;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }
    
}
