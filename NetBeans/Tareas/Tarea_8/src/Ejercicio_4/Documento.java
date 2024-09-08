/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import javax.swing.JOptionPane;

/**
 *
 * @author JM Gutierrez
 */
public class Documento {
    protected String emisor;
    protected String fecha;
    protected String producto;
    protected double precio;
    public Documento(String f){
        this.fecha=f;
    }
    public String getEmisor(){
        return emisor;
    }
    public String getFecha(){
        return fecha;
    }
    public String getProducto(){
        return producto;
    }
    public double getPrecio(){
        return precio;
    }
}
