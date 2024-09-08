/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana10;

/**
 *
 * @author Alumno
 */
public class Nieta extends Hija
{
    private String musica;

    public Nieta(String nombre, int edad, String musica)
    {
            super(nombre,edad);
            this.musica = musica;
    }

    public void setMusica(String musica)
    {this.musica = musica;}

    public String getMusica()
    {return musica;}
    
    public String verMensaje()
    {return "OBJETO DE LA CLASE NIETA";}
}
