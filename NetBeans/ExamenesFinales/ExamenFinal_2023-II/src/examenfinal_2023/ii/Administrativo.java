/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_2023.ii;

/**
 *
 * @author JM Gutierrez
 */
public class Administrativo extends Persona{
    protected String area;
    protected int horas_traba;
    protected double pago_hora;
    
    public Administrativo(String area, int horas_traba, double pago_hora, String nom_ape, String sexo, int edad, int codigo) {
        super(nom_ape, sexo, edad, codigo);
        this.area = area;
        this.horas_traba = horas_traba;
        this.pago_hora = pago_hora;
    }

    public String getArea() {
        return area;
    }

    public int getHoras_traba() {
        return horas_traba;
    }

    public double getPago_hora() {
        return pago_hora;
    }
    
    public double Sueldo(){
        if(this.horas_traba<=40){
            return this.horas_traba*this.pago_hora;
        }else if(this.horas_traba<=48){
            double pagoNormal=40*this.pago_hora;
            double pagoDoble=(this.horas_traba-40)*(this.pago_hora*2);
            return pagoNormal+pagoDoble;
        }else{
            double pagoNormal=40*this.pago_hora;
            double pagoDoble=8*(this.pago_hora*2);
            double pagoTriple=(this.horas_traba-48)*(this.horas_traba*3);
            return pagoNormal+pagoDoble+pagoTriple;
        }
    }
    public String Mostrar(){
        return  "\nCÓDIGO: "+getCodigo()+
                "\nNOMBRE: "+getNom_ape()+
                "\nSEXO: "+getSexo()+
                "\nEDAD: "+getEdad()+
                "\nAREA: "+getArea()+
                "\nHORAS TRABAJADAS A LA SEMANA: "+getHoras_traba()+
                "\nPAGO POR HORAS: "+getPago_hora();
    }
}
