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
public class Video implements Reproducible{
    public String Ejecutar(){
        return "Reproduciendo Video...";
    }
    public String Detener(){
        return "Video detenido";
    }
    public String Rebobinar(){
        return "Rebobinando Video...";
    }
    public String Avanzar(){
        return "Avanzando Video...";
    }
    public String Grabar(){
        return "Grabando Video...";
    }
}
