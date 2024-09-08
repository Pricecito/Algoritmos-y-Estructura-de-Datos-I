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
public class Docente extends Persona{
    private String tipo;
    private int horas;
    private String gradoAcademico;
    public Docente(){
        super();
        String t=Utilitario.getMensaje("DOCENTE A TIEMPO\nCOMPLETO/PARCIAL").toUpperCase();
        int h=Integer.parseInt(Utilitario.getMensaje("INGRESE HORAS"));
        switch(t){
                case "COMPLETO":this.tipo=t;
                                if(h==40){
                                    this.horas=h;
                                }else{
                                    Utilitario.setMensajeError("LAS HORAS NO CORRESPONDEN CON EL HORARIO");
                                }
                                break;
                case "PARCIAL": this.tipo=t;
                                if(h<40){
                                    this.horas=h;
                                }else{
                                    Utilitario.setMensajeError("LAS HORAS DEBEN SER MENORES A 40");
                                }
                                break;
                default: Utilitario.setMensajeError("VALOR INCORRECTO, INGRESAR NUEVAMENTE");
                }
        String g=Utilitario.getMensaje("INGRESE GRADO ACADEMICO\nBACHILLER/MAGISTER/DOCTOR").toUpperCase();
        switch(g){
            case "BACHILLER":
            case "MAGISTER":
            case "DOCTOR":this.gradoAcademico=g;break;
            default:Utilitario.setMensajeError("VALOR INCORRECTO, INGRESAR NUEVAMENTE");
        }
    }
    public String getTipo(){
        return tipo;
    }
    public int getHoras(){
        return horas;
    }
    public String getGradoacademico(){
        return gradoAcademico;
    }
    public int calcular(){
        int p;
        switch(this.gradoAcademico){
            case "BACHILLER": p=this.horas*25;break;
            case "MAGISTER":p=this.horas*30;break;
            default:p=this.horas*35;
        }
        return p;
    }
}
