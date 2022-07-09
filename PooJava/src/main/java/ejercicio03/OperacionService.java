/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class OperacionService {

    //importacion de clase Scanner, para que lea por teclado
    Scanner leer = new Scanner(System.in);

    //peticion a usuario de ambos numeros, num1 y num2
    public Operacion peticionUsuarioNumeros() {
        Operacion o1 = new Operacion();
        System.out.println("Ingrese un primer numero");
        o1.setNum1(leer.nextInt());
        System.out.println("Ingrese un segundo numero:");
        o1.setNum2(leer.nextInt());
        return o1;
    }

    public int suma(Operacion o1) {
        return o1.getNum1() + o1.getNum2();
    }

    public int resta(Operacion o1) {
        return o1.getNum1() - o1.getNum2();
    }

    public double multiplicacion(Operacion o1) {
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {

            return 0;
        } else {
            return o1.getNum1() * o1.getNum2();
        }

    }

    public double division(Operacion o1) {
        if (o1.getNum1() == 0 || o1.getNum2() == 0) {

            return 0;
        } else {
            return o1.getNum1() / o1.getNum2();
        }

    }

}
