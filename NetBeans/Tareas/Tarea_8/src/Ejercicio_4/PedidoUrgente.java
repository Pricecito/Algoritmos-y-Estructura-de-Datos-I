/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author JM Gutierrez
 */
public class PedidoUrgente extends Pedido{
    public PedidoUrgente(String fI,String fE,String t){
        super(fI, fE,t);
        this.tPed="URGENTE";
    }
}
