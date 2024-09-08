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
public class Enfermera extends Personal{
    public Enfermera(int c,String n,String a,String s){
        super(c,n,a,s);
    }
    public void mensaje(){
        Herramientas.setMensaje("PROCESO - ENFERMERA");
    }
    public void Salario(){
        int s=20*getHrs_tra();
        Herramientas.setMensaje("EL SALARIO DE LA ENFERMERA ES: "+String.valueOf(s));
    }
}
