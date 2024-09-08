/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usmp.aedi.semana3;

/**
 *
 * @author Alumno
 */
public class Triangulo {
        public double lado1;
	public double lado2;
	public double lado3;
	public double area;
	public double perimetro;
	
	public Triangulo()
        {}
	public Triangulo(double a,double b,double c)
	{
            this.lado1=a;
            this.lado2=b;
            this.lado3=c;
	}

	public double obtenerArea()
	{
            return this.area;
	}

	public double obtenerPerimetro()
	{
            return this.perimetro;
	}
	
	public double obtenerLado(int numLado)
	{
            double vLado=0;
            switch (numLado) 
            {
            case 1: 
                    vLado=this.lado1;
                    break;
            case 2:
                    vLado=this.lado2;
                    break;
            case 3:
                    vLado=this.lado3;
                    break;
            }
            return vLado;
	}
	
	public boolean esTriangulo()
	{
            boolean xOK=false;
            double a=this.lado1;
            double b=this.lado2;
            double c=this.lado3;
            if(a+b>c&&a+c>b&&b+c>a)
                    xOK=true;
            return xOK;
	}

	public void calcularArea()
	{
            this.calcularPerimetro();
            double s=this.perimetro/2;
            double a=this.lado1;
            double b=this.lado2;
            double c=this.lado3;
            this.area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public void calcularPerimetro()
	{
            double a=this.lado1;
            double b=this.lado2;
            double c=this.lado3;
            this.perimetro=a+b+c;
	}
    
}
