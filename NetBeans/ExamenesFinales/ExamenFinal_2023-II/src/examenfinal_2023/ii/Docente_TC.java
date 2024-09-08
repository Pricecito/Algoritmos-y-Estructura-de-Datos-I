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
public class Docente_TC extends Docente implements Int_Salario{
    private String periodo_con;
   
    public Docente_TC(String periodo_con, int horas, String gradoAcademico, String nom_ape, String sexo, int edad, int codigo) {
        super(horas, gradoAcademico, nom_ape, sexo, edad, codigo);
        this.periodo_con = periodo_con;
    }
    public String getPeriodo_con(){
        return periodo_con;
    }
    public double Salario(){
        if(this.periodo_con.equalsIgnoreCase("anual")){
            switch(this.gradoAcademico){
                case "BACHILLER": return 4200;
                case "MAGISTER": return 4500;
                default:return 4800;
            }
        }else{
           switch(this.gradoAcademico){
                case "BACHILLER": return 3000;
                case "MAGISTER": return 3250;
                default:return 3500;
            }
        }
    }
    public String Mostrar(){
        return  "\nCÓDIGO: "+getCodigo()+
                "\nNOMBRE: "+getNom_ape()+
                "\nSEXO: "+getSexo()+
                "\nEDAD: "+getEdad()+
                "\nHORAS: "+getHoras()+
                "\nGRADO ACADEMICO: "+getGradoAcademico()+
                "\nP. DEL CONTRATO: "+getPeriodo_con();
        
    }
}
