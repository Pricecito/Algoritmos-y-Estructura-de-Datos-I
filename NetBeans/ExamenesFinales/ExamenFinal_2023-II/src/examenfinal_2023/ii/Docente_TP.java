package examenfinal_2023.ii;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JM Gutierrez
 */
public class Docente_TP extends Docente implements Int_Salario{
    private String unidad_acad;
    
    public Docente_TP(String unidad_acad, int horas, String gradoAcademico, String nom_ape, String sexo, int edad, int codigo) {
        super(horas, gradoAcademico, nom_ape, sexo, edad, codigo);
        this.unidad_acad = unidad_acad;
    }
    public String getUnidad_acad(){
        return unidad_acad;
    }
    public double Salario(){
        double hora;
        switch(this.gradoAcademico){
             case "BACHILLER":hora=25;
             case "MAGISTER": hora=30;
             default: hora=35;
         }
        return this.horas*hora;
    }
    public String Mostrar(){
        return  "\nCÓDIGO: "+getCodigo()+
                "\nNOMBRE: "+getNom_ape()+
                "\nSEXO: "+getSexo()+
                "\nEDAD: "+getEdad()+
                "\nHORAS: "+getHoras()+
                "\nGRADO ACADEMICO: "+getGradoAcademico()+
                "\nU. ACADEMICA: "+getUnidad_acad();
    }
}
