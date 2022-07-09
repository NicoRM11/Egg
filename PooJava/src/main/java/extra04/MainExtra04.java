/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra04;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService ns = new NIFService();
        NIF n1 = ns.crearNif();
        ns.mostrarNIF(n1);
    }
    
}
