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
public class PruebaMolecular implements PruebaCovid{
    public char realizarPrueba(){
        int cGB=UtilitarioCovid.generarAleatorio(1500, 10000);
        int vOx=UtilitarioCovid.generarAleatorio(60, 100);
        char res='N';
        if(cGB>=5000&&vOx<=90){
            res='P';
        }
        return res;
    }
}
