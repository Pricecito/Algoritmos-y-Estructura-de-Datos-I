
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
public class Person {  
    protected String name;
    protected String dni;
    protected int age;

    public Person() {
    }

    public Person(String nombre) {
        this.name = nombre;
    }

    public Person(String nombre, String dni, int edad) {
        this.name = nombre;
        this.dni = dni;
        this.age = edad;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public int getAge() {
        return age;
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null,"NAME: " + name+"\nDNI: " + dni+"\nAGE: " + age);
    }
}
