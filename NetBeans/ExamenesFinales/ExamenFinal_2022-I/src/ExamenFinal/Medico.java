/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author jmgut
 */
public class Medico extends Personal{
    private String especialidad;
    public Medico(int c,String n,String a,String s){
        super(c,n,a,s);
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void mensaje(){
        Herramientas.setMensaje("PROCESO - MEDICO");
    }
    public void Salario(){
        int s=40*getHrs_tra();
        Herramientas.setMensaje("EL SALARIO DEL MEDICO ES: "+String.valueOf(s));
    }
    public void setEspecialidad(String e){
        this.especialidad=e;
    }
}
