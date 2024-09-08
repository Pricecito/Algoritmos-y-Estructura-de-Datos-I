/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author JM Gutierrez
 */
public abstract class Vehicle {
    protected int matricula;
    protected String marca;
    protected String modelo;
    protected int cap_tanque;

    public Vehicle(String marca, String modelo) {
        this.matricula = Utilitario.generarAleatorio(5000,9999);
        this.marca = marca;
        this.modelo = modelo;
        this.cap_tanque = Utilitario.generarAleatorio(40,120);
    }

    public Vehicle() {
        this.matricula = Utilitario.generarAleatorio(5000,9999);
        this.marca = JOptionPane.showInputDialog(null,"INGRESE MARCA:","ENTRADA", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        this.modelo = JOptionPane.showInputDialog(null,"INGRESE MODELO:","ENTRADA", JOptionPane.QUESTION_MESSAGE).toUpperCase();
        this.cap_tanque = Utilitario.generarAleatorio(40,120);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCap_tanque() {
        return cap_tanque;
    }

    public void setCap_tanque(int cap_tanque) {
        this.cap_tanque = cap_tanque;
    }
    
    public abstract String mensaje();
}
