/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author Alumno
 */
public class P_Orina implements PruebaEmbarazo
{
    public String realizarPrueba()
    {
        String res="";
        int tir=Integer.parseInt(Utilitario.ingreso("COLOR DE LA TIRA REACTIVA 1-TENUE, 2-INTENSO"));
        int rel=Integer.parseInt(Utilitario.ingreso("HACE CUANTOS DIAS TUVO RELACIONES"));
        int ret=Integer.parseInt(Utilitario.ingreso("CUANTOS DÍAS DE RETRASO TIENE"));
        if(tir==2){
            res="POSITIVO - PRUEBA DE ORINA";
            Utilitario.mensaje(res);}
        else if(tir==1 && rel>=10 && rel<=15 && ret>=3){            
            res="FALSO POSITIVO - PRUEBA DE ORINA";
            Utilitario.mensaje(res+"\nTIENE QUE HACERSE UNA PRUEBA EN 3 DÍAS");}
        else{
            res="NEGATIVO - PRUEBA DE ORINA";
            Utilitario.mensaje(res);}
        return res;
    }
}
