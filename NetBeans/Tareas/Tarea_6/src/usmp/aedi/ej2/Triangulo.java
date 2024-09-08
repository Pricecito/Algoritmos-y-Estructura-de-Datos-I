/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.ej2;

/**
 *
 * @author jmgut
 */
public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;
    public double area;
    public double perimetro;
    public Triangulo(){
        
    }
    public Triangulo(double a,double b,double c){
        this.lado1=a;
        this.lado2=b;
        this.lado3=c;
    }
    public double obtenerArea(){
        this.area=calcularArea();
        return this.area;
    }
    public double obtenerPerimetro(){
        this.perimetro=calcularPerimetro();
        return this.perimetro;
    }
    public void obtenerLado(int numLado){
        
    }
    public boolean esTriangulo(){
        
        return false;
    }
    public double calcularArea(){
        double area=(this.lado1*this.lado2)/2.0;
        return area; 
    }
    public double calcularPerimetro(){
        double perimetro=this.lado1+this.lado2+this.lado3;
        return perimetro;
    }
}
