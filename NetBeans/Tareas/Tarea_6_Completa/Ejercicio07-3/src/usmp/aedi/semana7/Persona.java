/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana7;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Persona {
        public static String empresa = "USMP";//Atributo de clase
        public String nombre;//Atributo de instancia
        public int edad;//Atributo de instancia
        public double estatura;//Atributo de instancia

        public Persona()//Constructor
        { }

        public Persona(String no, int ed, double es)//Constructor
        {
            this.nombre = no;
            this.edad = ed;
            this.estatura = es;
        }

        public Persona(String no)//Constructor
        {
            this.nombre = no;
            this.edad = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EDAD"));
            this.estatura = Double.parseDouble(JOptionPane.showInputDialog("INGRESE ESTATURA"));
        }

        public Persona(String em,String no,int ed, double est)//Constructor
        {
            empresa = em;
            this.nombre = no;
            this.edad = ed;
            this.estatura = est;
        }

        public void mostrarDatos()//Metodo de instancia
        {
            JOptionPane.showMessageDialog(null,"EMPRESA: "+empresa+"\nNOMBRE: "+this.nombre+"\nEDAD: "+this.edad+"\nESTATURA: "+this.estatura,
                "MOSTRAR INFORMACION",JOptionPane.INFORMATION_MESSAGE);
        }

        public static void impMensaje()//Metodo de clase
        {
            JOptionPane.showMessageDialog(null,"Mensaje - Método de Clase", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
        }
    
}
