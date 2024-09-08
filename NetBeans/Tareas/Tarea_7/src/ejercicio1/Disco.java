/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author JM Gutierrez
 */
public class Disco {
    private String artista;
    private String album;
    private String genero;
    private int año;
    public Disco(){
    }
    public void setArtista(String art){
        this.artista=art;
    }
    public void setAlbum(String alb){
        this.album=alb;
    }
    public void setGenero(String gen){
        this.genero=gen;
    }
    public void setAño(int Año){
        this.año=Año;
    }
    public String getArtista(){
        return artista;
    }
    public String getAlbum(){
        return album;
    }
    public String getGenero(){
        return genero;
    }
    public int getAño(){
        return año;
    }
}
