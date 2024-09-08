/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author JM Gutierrez
 */
public class Triangulo{
    private double lado1;
    private double lado2;
    private double lado3;
    private double angulo;
    public Triangulo(){
    }
    public Triangulo(double lad1, double lad2, double lad3, double angulo)
    {
            this.lado1=lad1;
            this.lado2=lad2;
            this.lado3=lad3;
            this.angulo=angulo;
    }
    public boolean esTriangulo(){
        boolean x=false;
        double a=this.lado1;
        double b=this.lado2;
        double c=this.lado3;
        if(a+b>c&&a+c>b&&b+c>a){
                x=true;
        }
        return x;
    }
    public boolean esEquilatero(){
        boolean x=false;
        if (this.lado1==this.lado2&&this.lado2==this.lado3){
            x=true;
        }
        return x;
    }	

    public boolean esEscaleno(){
        boolean x=false;
        if (this.lado1!=this.lado2&&this.lado2!=this.lado3){
                x=true;
        }
        return x;
    }

    public boolean esIsoceles(){
        boolean x=false;
        if (this.lado1!=this.lado2&&this.lado2==this.lado3){
                x=true;
        }
        return x;
    }

    public boolean esRectangulo(){
        boolean x=false;
        if (this.angulo==90){
                x=true;
        }
        return x;
    }
}
