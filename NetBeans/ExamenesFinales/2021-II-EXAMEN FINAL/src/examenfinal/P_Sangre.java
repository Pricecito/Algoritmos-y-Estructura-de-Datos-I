/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class P_Sangre implements PruebaEmbarazo
{
    public String realizarPrueba()
    {
        String res="";
        int hor=Integer.parseInt(Utilitario.ingreso("VALOR hormona beta- hCG"));
        int rel=Integer.parseInt(Utilitario.ingreso("HACE CUANTOS DIAS TUVO RELACIONES"));
        int ret=Integer.parseInt(Utilitario.ingreso("CUANTOS DÍAS DE RETRASO TIENE"));
        if(hor>5 && rel>=10 && rel<=15 &&ret>=3){
            res="POSITIVO - PRUEBA DE SANGRE";
            Utilitario.mensaje(res);}
        else if(hor<=5){            
            res="NEGATIVO - PRUEBA DE SANGRE";
            Utilitario.mensaje(res);}
        else{
            res="FALSO POSITIVO - PRUEBA DE SANGRE";
            Utilitario.mensaje(res+"\nTIENE QUE HACERSE UNA PRUEBA EN 3 DÍAS");}
        return res;
    }
}
