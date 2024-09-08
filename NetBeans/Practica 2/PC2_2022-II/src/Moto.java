
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlumnoUSMP
 */
public class Moto extends Vehiculo{
   private int velocidad;
   public Moto(String matricula,String marca,String modelo,int velocidad){
       super(matricula,marca,modelo);
       this.velocidad=velocidad;
   }
   public int getVelocidad(){
       return velocidad;
   }
   public void modificarDatos(){
       this.velocidad-=50;
       mostrar();
   }
   public void mostrar(){
       JOptionPane.showMessageDialog(null,"MATRICULA: "+this.matricula+"\nMARCA: "+this.marca+"\nMODELO: "+this.modelo+"\nVELOCIDAD:"+this.velocidad);   
   }
}
