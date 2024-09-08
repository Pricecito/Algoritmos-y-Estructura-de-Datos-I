/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author JM Gutierrez
 */
public class Astros {
    protected String nombre;
    protected double excentricidadOrbita;
    protected String mCuerpo;
    protected double diametroMe;
    protected double perRotEje;
    protected int qLunas;
    protected double distanciaMediaSol;
    protected double perTras;
    public Astros(){
    }
    public Astros(String nom,String mC,double dMe,double pR,double pT,int qL,double exO,double dMS){
        this.nombre=nom;
        this.mCuerpo=mC;
        this.diametroMe=dMe;
        this.perRotEje=pR;
        this.perTras=pT;
        this.qLunas=qL;
        this.excentricidadOrbita=exO;
        this.distanciaMediaSol=dMS;
    }
    public Astros(String nom,String mC,double dMe,double pR,double pT,int qL){
        this.nombre=nom;
        this.mCuerpo=mC;
        this.diametroMe=dMe;
        this.perRotEje=pR;
        this.perTras=pT;
        this.qLunas=qL;
    }
    public String getNombre(){
        return nombre;
    }
    public String getMCuerpo(){
        return mCuerpo;
    }
    public double getDiaMe(){
        return diametroMe;
    }
    public double getPerRot(){
        return perRotEje;
    }
    public double getPerTras(){
        return perTras;
    }
    public double getqLunas(){
        return qLunas;
    }
    public double getExcent(){
        return excentricidadOrbita;
    }
    public double getDistanciaMediaSol(){
        return distanciaMediaSol;
    }
}
