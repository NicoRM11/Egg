/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra05;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MesesService ms = new MesesService();
        Meses m1 = ms.rellenoMes();
        ms.mesSecreto(m1);
    }
    
}
