/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author jmgut
 */
public abstract class Usuario {
    protected int codigo;
    protected String nombre;
    protected String apellido;
    protected String sexo;
    public Usuario(int c,String n,String a,String s){
        this.codigo=c;
        this.nombre=n;
        this.apellido=a;
        this.sexo=s;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getSexo (){
        return sexo;
    }
    
    
    public abstract void mensaje();
}
