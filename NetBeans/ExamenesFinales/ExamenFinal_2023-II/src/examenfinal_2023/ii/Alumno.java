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
public class Alumno extends Persona implements Int_Pension{
    private String carrera;
    private int creditos;

    public Alumno(String carrera, int creditos, String nom_ape, String sexo, int edad, int codigo) {
        super(nom_ape, sexo, edad, codigo);
        this.carrera = carrera;
        this.creditos = creditos;
    }
    public String getCarrera() {
        return carrera;
    }

    public int getCreditos() {
        return creditos;
    }
    public String Mostrar(){
        return  "\nCÓDIGO: "+getCodigo()+
                "\nNOMBRE: "+getNom_ape()+
                "\nSEXO: "+getSexo()+
                "\nEDAD: "+getEdad()+
                "\nCARRERA: "+getCarrera()+
                "\nCREDITOS: "+getCreditos();
    }
    public double Calcular(){
        double vCredito;
        switch(carrera){
            case "PSICOLOGIA": vCredito=151.2;
            case "ODONTOLOGIA": vCredito=189.0;
            default: vCredito=138.6;
        }
        return Math.round((this.creditos*vCredito)*100.00)/100.00;
    }
}
