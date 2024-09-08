/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta2;

/**
 *
 * @author jmgut
 */
public class Estudiante extends Persona{
    private String carrera;
    public Estudiante(String n,int e,String c){
        super(n,e);
        this.carrera=c;
    }
    public String getCarrera(){
        return carrera;
    }
    public void modificarDatos(){
        this.edad+=10;
        this.carrera="ING. INDUSTRIAL";
    }
}
