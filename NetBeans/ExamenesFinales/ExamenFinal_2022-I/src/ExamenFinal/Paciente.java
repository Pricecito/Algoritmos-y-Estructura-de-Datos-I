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
public class Paciente extends Usuario{
    private String citas[];
    private int indice_c;
    public Paciente(int c,String n,String a,String s){
        super(c,n,a,s);
        this.citas=new String[3];
        this.indice_c=0;
    }
    public String [] getCitas(){
        return citas;
    }
    public void setIndice(int ind_c){
        this.indice_c+=ind_c;
    }
    public int getIndice(){
        return indice_c;
    }
    public void mensaje(){
        Herramientas.setMensaje("PROCESO - PACIENTE");
    }
}
