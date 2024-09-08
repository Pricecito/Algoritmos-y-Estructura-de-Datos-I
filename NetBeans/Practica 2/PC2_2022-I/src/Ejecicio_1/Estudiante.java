/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecicio_1;

/**
 *
 * @author jmgut
 */
public class Estudiante extends Persona{
    private String carrera;
    private int creditos;
    public Estudiante(){
        super();
        String c=Utilitario.getMensaje("INGRESE CARRERA").toUpperCase();
        if(c.equals("SISTEMAS")||c.equals("INDUSTRIAL")){
            this.carrera=c;
            this.creditos=Integer.parseInt(Utilitario.getMensaje("INGRESE CREDITOS"));
        }else{
            Utilitario.setMensajeError("ERROR EN CARRERA, INGRESE SOLO\nINDUSTRIAL/SISTEMAS");
        }
    }
    public String getCarrera(){
        return carrera;
    }
    public int getCreaditos(){
        return creditos;
    }
    public int calcular(){
        if(this.carrera.equals("INDUSTRIAL")){
            return this.creditos*60;
        }else{
            return this.creditos*40;
        }
    }
}
