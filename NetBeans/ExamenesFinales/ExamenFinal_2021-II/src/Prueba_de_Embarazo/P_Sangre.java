/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba_de_Embarazo;

/**
 *
 * @author jmgut
 */
public class P_Sangre implements PruebaEmbarazo{
    public String realizarPrueba(){
        int horHCG=Integer.parseInt(Utilitario.ingreso("VALOR hormonar beta-hCG"));
        int qDiasR1=Integer.parseInt(Utilitario.ingreso("HACE CUANTOS DIAS TUVO RELACIONES"));
        int qDRetraso=Integer.parseInt(Utilitario.ingreso("CUANTOS DIAS DE RETRASO TIENE"));
        boolean A1=false,B1=false,C1=false;
        String msj;
        if(horHCG>5){
           A1=true;
        }
        if(qDiasR1>=10&&qDiasR1<=15){
            B1=true;
        }
        if(qDRetraso>=3){
            C1=true;
        }
        if(A1&&B1&&C1){
             Utilitario.Mensaje("POSTIVO");
            msj="POSITIVO - PRUEBA DE SANGRE";
        }else if(A1){
            Utilitario.Mensaje("TIENE QUE HACERSE OTRA PRUEBA EN 3 DIAS");
            msj="FALSO POSITIVO - PRUEBA DE SANGRE";
        }else{
            Utilitario.Mensaje("NEGATIVO");
            msj="NEGATIVO - PRUEBA DE SANGRE";
        }
        return msj;
    }
}
