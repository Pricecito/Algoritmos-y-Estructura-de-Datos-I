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
public class Per_Juridica extends Usuario implements Bono {

    public Per_Juridica(int cod_usu, String nom_usu, char tipo) {
        super(cod_usu, nom_usu, tipo);
    }

    public double descuento() {
        double m=0,des;
        for(int c=0;c<this.getIndice_p();c++){
            m+=this.getP()[c];
        }
        des=m*0.2;
        return m-(des+especial());
    }

    public double especial() {
        double m=0;
        for(int c=0;c<this.getIndice_p();c++){
            m+=this.getP()[c]*0.05;
        }
        return m;
    }
    
}
