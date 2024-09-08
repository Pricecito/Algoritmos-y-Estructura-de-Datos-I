
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class Employee extends Person {

    protected int salary;

    public Employee(String nombre, int sueldobase) {
        this.name = nombre;
        this.salary = sueldobase;
    }

    public Employee(String nombre, String dni, int edad, int sueldobase) {
        super(nombre, dni, edad);
        this.salary = sueldobase;
    }

    public double getSalary() {
        return salary;
    }

    public void mostrar() {
       JOptionPane.showMessageDialog(null,"NAME: " + name+"\nDNI: " + dni+"\nAGE: " + age+"\nSALARY:"+salary);
    }
}
