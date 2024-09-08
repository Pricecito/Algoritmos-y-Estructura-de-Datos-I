/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author jmgut
 */
public class Cerrojo {
    private static String password;
    public Cerrojo(String tex){
        password=tex;
    }
    public static String getPassword(){
        return password;
    }
    public static void setPassword(String tex){
        password=tex;
    }
}
