/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_2023.i;

/**
 *
 * @author USMP
 */
public abstract class Usuario {
    private int cod_usu;
    private String nom_usu;
    private char tipo;
    private int []p;
    private int indice_p;

    public Usuario(int cod_usu, String nom_usu, char tipo) {
        this.cod_usu = cod_usu;
        this.nom_usu = nom_usu;
        this.tipo = tipo;
        this.indice_p = 0;
    }

    public int getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(int cod_usu) {
        this.cod_usu = cod_usu;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int[] getP() {
        return p;
    }

    public void setP(int cant) {
        this.p = new int[cant];
    }

    public int getIndice_p() {
        return indice_p;
    }

    public void setIndice_p(int indice_p) {
        this.indice_p += indice_p;
    }
    
    public abstract double descuento();
}
