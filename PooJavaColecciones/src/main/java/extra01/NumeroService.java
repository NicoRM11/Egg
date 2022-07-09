/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class NumeroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Numero agregarNumero(Integer num) {
        Numero n1 = new Numero();
        n1.setValor(num);
        return n1;
    }
}
