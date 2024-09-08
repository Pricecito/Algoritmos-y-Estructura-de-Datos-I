/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Admin
 */
public class Alumno {
    private Asignatura a1;
    private Asignatura a2;
    private Asignatura a3;
    public Alumno(Asignatura a1,Asignatura a2,Asignatura a3){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
    }
    public Asignatura getA1(){
        return a1;
    }
    public Asignatura getA2(){
        return a2;
    }
    public Asignatura getA3(){
        return a3;
    }
}
