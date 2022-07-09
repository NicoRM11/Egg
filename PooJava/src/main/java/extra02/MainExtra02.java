/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntosService ps = new PuntosService();
        Puntos p1 = ps.crearPuntos();
        ps.distanciaPuntos(p1);
    }
    
}
