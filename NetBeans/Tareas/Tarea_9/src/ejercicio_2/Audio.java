/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author JM Gutierrez
 */
public class Audio implements Reproducible{
    public String Ejecutar(){
        return "Reproduciendo audio...";
    }
    public String Detener(){
        return "Audio detenido";
    }
    public String Rebobinar(){
        return "Rebobinando audio...";
    }
    public String Avanzar(){
        return "Avanzando audio...";
    }
    public String Grabar(){
        return "Grabando audio...";
    }
}
