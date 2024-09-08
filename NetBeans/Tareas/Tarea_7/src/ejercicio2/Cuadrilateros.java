/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author JM Gutierrez
 */
public class Cuadrilateros {
    private double lad1;
    private double lad2;
    private double lad3;
    private double lad4;
    private double area;
    private double perimetro;
    public Cuadrilateros(double lado1,double lado2,double lado3,double lado4){
        this.lad1=lado1;
        this.lad2=lado2;
        this.lad3=lado3;
        this.lad4=lado4;
    }
    public boolean esRectangulo(){
        boolean xR=false;
        double a=this.lad1;
        double b=this.lad2;
        double c=this.lad3;
        double d=this.lad4;
        if(a+b==c+d||a+c==b+d){
                xR=true;
        }
        return xR;
    }
    public boolean esParalelogramo(){
        boolean xP=false;
        double a=this.lad1;
        double b=this.lad2;
        double c=this.lad3;
        double d=this.lad4;
        if(a+b==c+d||a+c==b+d){
                xP=true;
        }
        return xP;
    }
    public boolean esRombo(){
        boolean xRO=false;
        double a=this.lad1;
        double b=this.lad2;
        double c=this.lad3;
        double d=this.lad4;
        if(a==b&&b==c&&c==d){
                xRO=true;
        }
        return xRO;
    }
    public boolean esTrapecio(){
        boolean xT=false;
        double a=this.lad1;
        double b=this.lad2;
        double c=this.lad3;
        double d=this.lad4;
        if(b==a||b==c||b==d){
            if(a>c||c>d){
              xT=true; 
            }
        }
        return xT;
    }
    public double AreaRec(){
        double ladMa=Math.max(this.lad1,Math.max(this.lad2,this.lad3));
        double ladMe=Math.min(this.lad1,Math.min(this.lad2,this.lad3));
        this.area =ladMa*ladMe;
        return area;
    }
    public double AreaPar(double altura){
        double ladMa=Math.max(this.lad1,Math.max(this.lad2,this.lad3));
        this.area=altura*ladMa;
        
        return area;
    }
    public double AreaRom(double Dma,double Dme){
        this.area=Dma*Dme/2.0;
        return area;
    }
    public double AreaTra(double altura){
        double Bma,Bme;
        if(this.lad1==this.lad3){
            Bma=Math.max(this.lad2,this.lad4);
            Bme=Math.min(this.lad2,this.lad4);
        }else if(this.lad2==this.lad4){
            Bma=Math.max(this.lad1,this.lad3);
            Bme=Math.min(this.lad1,this.lad3);
        }else if(this.lad1==this.lad2){
            Bma=Math.max(this.lad3,this.lad4);
            Bme=Math.min(this.lad3,this.lad4);
        }else{
            Bma=Math.max(this.lad1,this.lad2);
            Bme=Math.min(this.lad1,this.lad2);
        }
        this.area=(Bma+Bme)/2.0*altura;
        return area;
    }
    public double Perimetro(){
        this.perimetro=this.lad1+this.lad2+this.lad3+this.lad4;
        return perimetro;
    }
    
}
