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
public abstract class  Empleado extends Persona {
    protected static double salario;
    public Empleado(){
    }
    public Empleado(String n,int e,String g, double s){
        super(n, e,g);
        salario=s;
    }
    public double LeerSalario(){
        return salario;
    }
    public static void CambiarSalario(double s){
        salario=s;
    }
    public abstract String LeerTipo();
}
