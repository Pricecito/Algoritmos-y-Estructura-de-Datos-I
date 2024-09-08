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
public class Docente_TP extends Docente implements Int_Salario{
    private String unidad_acad;
    public Docente_TP(int c,String na,String s,int e, int h,String gA,String uA){
        super(c, na, s, e, h, gA);
        this.unidad_acad=uA;
    }
    public String getUnidad_acad(){
        return unidad_acad;
    }
    public double Salario(){
        switch(this.gradoacademico){
            case "BACHILLER": return this.horas*25;
            case "MAGISTER":  return this.horas*30;
            default :return this.horas*35;
        }
    }
}
