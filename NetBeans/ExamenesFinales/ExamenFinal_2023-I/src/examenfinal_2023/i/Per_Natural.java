/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_2023.i;

/**
 *
 * @author USMP
 */
public class Per_Natural extends Usuario {

    public Per_Natural(int cod_usu, String nom_usu, char tipo) {
        super(cod_usu, nom_usu, tipo);
    }

    public double descuento() {
        int m=0;
        for(int c=0;c<this.getIndice_p();c++){
            m+=this.getP()[c];
        }
        
        return m*0.15;
    }
    
}
