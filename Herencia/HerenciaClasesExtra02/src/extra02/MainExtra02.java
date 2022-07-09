/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02;

import extra02.entidades.EdificioDeOficinas;
import extra02.entidades.Polideportivo;
import extra02.servicios.EdificioDeOficinasServicio;
import extra02.servicios.PolideportivoServicio;
import java.util.ArrayList;

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
        PolideportivoServicio ps = new PolideportivoServicio();
        EdificioDeOficinasServicio es = new EdificioDeOficinasServicio();
        //ArrayList de tipo Edificio, llenados con 2 polideportivos y 2 edificios de oficina
        ArrayList<Polideportivo> listaPolideportivo = new ArrayList();
        ArrayList<EdificioDeOficinas> listaEdificioDeOficinas = new ArrayList();

        for (int i = 0; i < 2; i++) {
            listaPolideportivo.add(ps.crearPolideportivo());
        }

        for (int i = 0; i < 2; i++) {
            listaEdificioDeOficinas.add(es.crearEdificioDeOficinas());
        }

        //recorrido de ambos ArrayList para mostrar metodos
        System.out.println("--------------------------");
        System.out.println("Polideportivos:");
        for (Polideportivo aux : listaPolideportivo) {
             System.out.println("---");
            System.out.println("Nombre:" + aux.getNombre());
            ps.calcularSuperficiePoli(aux);
            ps.calcularVolumenPoli(aux);
        }
        System.out.println("--------------------------");
        System.out.println("Edificio de oficinas:");
        for (EdificioDeOficinas aux : listaEdificioDeOficinas) {
            es.calcularSuperficieEdificio(aux);
            es.calcularVolumenEdificio(aux);
            es.cantPersonas(aux);
        }

    }

}
