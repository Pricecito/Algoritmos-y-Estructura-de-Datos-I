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
public class P_Orina implements PruebaEmbarazo{
    public String realizarPrueba(){
        int cTiraReac=Integer.parseInt(Utilitario.ingreso("COLOR DE LA TIRA REACTIVA\n1.Intenso\n2.Tenue"));
        int qDiasR2=Integer.parseInt(Utilitario.ingreso("HACE CUANTOS DIAS TUVO RELACIONES"));
        int qDRetra2=Integer.parseInt(Utilitario.ingreso("CUANTOS DIAS DE RETRASO TIENE"));
        boolean A=false,B=false,C=false;
        String msj;
        switch(cTiraReac){
            case 1: A=true;break;
            case 2: A=false;break;
            default: Utilitario.MensajeError("LA RESPUESTA NO CORRESPONDE CON LAS ALTERNATIVAS");
        }
        if(qDiasR2>=10&&qDiasR2<=15){
            B=true;
        }
        if(qDRetra2>=3){
            C=true;
        }
        if(A){
            Utilitario.Mensaje("POSTIVO");
            msj="POSITIVO - PRUEBA DE ORINA";
        }else if(A==false&&B&&C){
            Utilitario.Mensaje("VISITE A SU MEDICO O HACERSE OTRA PRUEBA EN 3 DIAS");
            msj="FALSO POSITVO - PRUEBA DE ORINA";
        }else{
            Utilitario.Mensaje("NEGATIVO");
            msj="NEGATIVO - PRUEBA DE ORINA";
        }
        return msj;
    }
}
