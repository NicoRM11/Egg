/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra02.servicios;

import extra02.entidades.Cine;

/**
 *
 * @author Nicolas Romano
 */
public class CineServicio {

    //metodo para crear la sala con numero de filas y letras de asientos
    public Cine crearSala() {
        Cine c1 = new Cine();
        String[][] asientoSala = new String[8][6];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    asientoSala[i][j] = (i + "A");
                }
                if (j == 1) {
                    asientoSala[i][j] = (i + "B");
                }
                if (j == 2) {
                    asientoSala[i][j] = (i + "C");
                }
                if (j == 3) {
                    asientoSala[i][j] = (i + "D");
                }
                if (j == 4) {
                    asientoSala[i][j] = (i + "E");
                }
                if (j == 5) {
                    asientoSala[i][j] = (i + "F");
                }
            }
        }
        c1.setAsientosSala(asientoSala);
        return c1;
    }
    
    
    
    
    

}
