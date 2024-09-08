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
public abstract class Persona {
    private int codigo;
    private String nom_ape;
    private String sexo;
    private int edad;
    
    public Persona(){
        
    }

    public Persona(String nom_ape, String sexo, int edad, int codigo) {
        this.nom_ape = nom_ape;
        this.sexo = sexo;
        this.edad = edad;
        this.codigo=codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNom_ape() {
        return nom_ape;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }
    
    public abstract String Mostrar();
}
