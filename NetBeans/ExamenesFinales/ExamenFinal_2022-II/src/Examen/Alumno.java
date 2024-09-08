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
public class Alumno extends Persona implements Int_Pension{
    private String carrera;
    private int creditos;
    public Alumno(int c,String na,String s,int e,String car,int cre){
        super(c, na, s, e);
        this.carrera=car;
        this.creditos=cre;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getCreditos(){
        return creditos;
    }
    public void Mostrar(){
        Herramientas.mensaje("SE REGISTRO UN ALUMNO");
    }
    public double Calcular(){
        if(this.carrera.equals("ODONTOLOGIA")){
            return Math.round((this.creditos*189)*10)/10;
        }else if(this.carrera.equals("PSICOLOGIA")){
            return Math.round((this.creditos*151.20)*10)/10;
        }else{
            return Math.round((this.creditos*138.60)*10)/10;
        }
    }
}
