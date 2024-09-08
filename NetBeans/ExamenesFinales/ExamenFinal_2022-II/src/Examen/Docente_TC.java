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
public class Docente_TC extends Docente implements Int_Salario{
    private String periodo_con;
    public Docente_TC(int c,String na,String s,int e, int h,String gA,String pC){
        super(c, na, s, e, h, gA);
        this.periodo_con=pC;
    }
    public String getPeriodo_con(){
        return periodo_con;
    }
    public double Salario(){
        switch(this.periodo_con){
            case "ANUAL": switch(this.gradoacademico){
                            case "BACHILLER": return 4200.00;
                            case "MAGISTER":return 4500.00;
                            default:return 4800.00;
                            }
            default:    switch(this.gradoacademico){
                        case "BACHILLER": return 3000.00;
                        case "MAGISTER":return 3250.00;
                        default:return 3500.00;
                        }
        }
    }
}
