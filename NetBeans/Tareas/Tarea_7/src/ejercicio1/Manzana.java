/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author JM Gutierrez
 */
public class Manzana {
    private String color;
    private String consistencia;
    private String sabor;
    public Manzana(){
    }
    public void Modificar(int col, int cons,int sab){
        switch(col){
            case 1:this.color="VERDE";break;
            case 2:this.color="ROJIZA";break;
            case 3:this.color="AMARILLENTA";break;
        }
        switch(cons){
            case 1:this.consistencia="ARINOSA";break;
            case 2:this.consistencia="CRUJIENTE";break;
        }
        switch(sab){
            case 1:this.sabor="AMARGO";break;
            case 2:this.sabor="DULCE";break;
        }
    }
    public String getColor(){
        return this.color;
    }
    public String getConsistencia(){
        return this.consistencia;
    }
    public String getSabor(){
        return this.sabor;
    }
}
