/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionService os = new OperacionService();
        Operacion o1 = os.peticionUsuarioNumeros();
        System.out.println("La suma de ambos numeros es de:" + os.suma(o1));
        System.out.println("La resta de ambos numeros es de:" + os.resta(o1));
        if (os.multiplicacion(o1) == 0) {
            System.out.println("Error al realizar la multiplicacion por 0");
        } else {
            System.out.println("La multiplicacion de ambos numeros es de:" + os.multiplicacion(o1));
        }
        if (os.division(o1) == 0) {
            System.out.println("Error al realizar la division por 0");
        } else {
            System.out.println("La division de ambos numeros es de:" + os.division(o1));
        }

    }

}
