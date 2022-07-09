/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra03;

/**
 *
 * @author Nicolas Romano
 */
public class MainExtra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesService rs = new RaicesService();
        Raices r1 = rs.crearRaiz();
        rs.getDiscriminante(r1);
        rs.tieneRaices(r1);
        rs.tieneRaiz(r1);
        rs.obtenerRaices(r1);
        rs.obtenerRaiz(r1);
        rs.calcular(r1);
    }
    
}
