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
public class TestCamion implements Test {
    protected int seguridad;
    protected int ecologia;
    protected char Rendimiento;
    protected int pun;
    public TestCamion(){
        this.seguridad=Utilitario.generarAleatorio(50, 100);
        this.ecologia=Utilitario.generarAleatorio(0, 100);
        this.Rendimiento=Utilitario.generarAleatorio();
        this.pun=this.ecologia+this.seguridad;
    }
    public char realizarTest(){
        if((this.pun>=220&&260<=260)&&(this.Rendimiento=='R'||this.Rendimiento=='O')){
            return 'R';
        }else if((this.pun>=261&&this.pun<=280)&&this.Rendimiento=='O'){
            return 'V';
        }else{
            return 'D';
        }
    }
}
 