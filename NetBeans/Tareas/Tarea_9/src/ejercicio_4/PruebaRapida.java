/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

/**
 *
 * @author jmgut
 */
public class PruebaRapida implements PruebaCovid{
    public char realizarPrueba(){
        int temp=UtilitarioCovid.generarAleatorio(35,40);
        String tos=UtilitarioCovid.getMensaje("Tiene tos?\nPonga S (si) o N (no):").trim();
        int dR=UtilitarioCovid.generarAleatorio(0, 1);
        if(temp>=38&&tos.equals("S")&&dR==1){
            return 'P';
        }else{
            return 'N';
        }
    }
}
