/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author jmgut
 */
public class Utilitario {
    public static int generarAleatorio(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }
    public static char generarAleatorio(){
        int c=Utilitario.generarAleatorio(1, 3);
        char car;
        switch(c){
            case 1: car='O';
            break;
            case 2: car='R';
            break;
            default: car='M';
        }
        return car;
    }
}
