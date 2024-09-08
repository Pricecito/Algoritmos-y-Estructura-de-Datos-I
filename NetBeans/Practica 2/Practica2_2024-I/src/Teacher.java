/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Teacher extends Employee{
     private int hours;

    public Teacher(String nombre, String dni, int edad, int sueldobase,int hours) {
        super(nombre, dni, edad, sueldobase);
        this.hours=hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int horas) {
        this.hours = horas;
    }

    public int calcularPago() {
        return this.salary+this.hours*25;
    }
    
}
