/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba_de_Embarazo;

/**
 *
 * @author jmgut
 */
public class Paciente {
    private int cod;
    private String nombre;
    private int edad;
    private String sexo;
    private String prueba[];
    private int indice_p;
    public Paciente(int cod,String nombre,int edad,String sexo){
        this.cod=cod;
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.prueba=new String [3];
        this.indice_p=0;
    }
    public int getCod(){
        return cod;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    public String[] getPrueba(){
        return prueba;
    }
    public int getIndice_p(){
        return indice_p;
    }
    public void setPrueba(String pru){
        this.prueba[indice_p]=pru;
        indice_p++;
    }
}
