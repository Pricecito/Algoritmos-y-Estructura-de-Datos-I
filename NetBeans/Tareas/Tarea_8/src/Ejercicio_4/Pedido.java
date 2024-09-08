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
public class Pedido extends Documento {
    protected String tPed;
    protected String fEntrega;
    protected String telefono;
    public Pedido(String fI,String fE,String t){
        super(fI);
        this.emisor=JOptionPane.showInputDialog(null,"INGRESAR NOMBRE DEL EMISOR:");
        this.producto=JOptionPane.showInputDialog(null,"INGRESAR PRODUCTO");
        this.precio=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESAR PRECIO DEL PRODUCTO"));
        this.telefono=t;
        this.fEntrega=fE;
        this.tPed="COMUN";
    }
    public Pedido(String fI,String fE){
        super(fI);
        this.fEntrega=fE;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getTipoPedido(){
        return tPed;
    }
    public String getFecha(){
        return fecha;
    }
    public String getFechaEnt(){
        return fEntrega;
    }
}
