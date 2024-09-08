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
public abstract class Personal extends Usuario implements Calculo{
    private String centro;
    private int hrs_tra;
    public Personal(int c,String n,String a,String s){
        super(c,n,a,s);
    }
    public String getCentro(){
        return centro;
    }
    public int getHrs_tra(){
        return hrs_tra;
    }
    public void setHrs_tra(int hrs){
        this.hrs_tra=hrs;
    }
    public void setCentro(String c){
        this.centro=c;
    }
}
