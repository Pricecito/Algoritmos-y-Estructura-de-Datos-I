/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author jmgut
 */
public class Ejecutivo extends Empleado {
    protected String tipo;
    public Ejecutivo(){
    }
    public Ejecutivo(String n,int e,String g,double s,String t){
        super(n, e, g, s);
        this.tipo=t;
    }
    public String LeerTipo(){
        return tipo;
    }
}
