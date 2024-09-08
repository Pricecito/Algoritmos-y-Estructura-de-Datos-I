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
public class TestAuto implements Test {
    protected int seguridad;
    protected int ecologia;
    protected int pun;
    public TestAuto(){
        this.seguridad=Utilitario.generarAleatorio(50, 100);
        this.ecologia=Utilitario.generarAleatorio(0, 100);
        this.pun=this.ecologia+this.seguridad;
    }
    public char realizarTest(){
        if(this.pun<100){
            return 'D';
        }else if(this.pun<=130){
            return 'R';
        }else{
            return 'V';
        }
    }
}
