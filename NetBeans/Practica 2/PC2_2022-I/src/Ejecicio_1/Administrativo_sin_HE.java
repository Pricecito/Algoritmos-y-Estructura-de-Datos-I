/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecicio_1;

/**
 *
 * @author jmgut
 */
public class Administrativo_sin_HE extends Administrativo{
    public Administrativo_sin_HE(){
        super();
    }
    public int calcular(){
        return (int) (getHorastrabajadas()*getSueldoporhora());
    }
}
