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
public class Factura extends Documento{
    protected String fPago;
    public Factura(String f,String fp){
        super(f);
        this.emisor=JOptionPane.showInputDialog(null,"INGRESAR NOMBRE DEL EMISOR:");
        this.producto=JOptionPane.showInputDialog(null,"INGRESAR PRODUCTO");
        this.precio=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESAR PRECIO DEL PRODUCTO"));
        this.fPago=fp;
    }
    public String getFormaPago(){
        return fPago;
    }
}
