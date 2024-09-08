
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
public class Student extends Person{
    private String profession;
    private int credits;

    public Student() {
    }

    public Student(String nombre, String dni, int edad, String carrera, int credito) {
        super(nombre, dni,edad);
        this.profession=carrera;
        this.credits=credito;
    }

    public String getProfession() {
        return profession;
    }

    public int getCredits() {
        return credits;
    }

    public int calcularPension() {
        switch(this.profession.toLowerCase()){
            case "sistemas": return this.credits*120;
            case "industrial":return this.credits*80;
            default: JOptionPane.showMessageDialog(null, "ERROR IN PROFFESSION");
        }
        return 0;
    }
}
