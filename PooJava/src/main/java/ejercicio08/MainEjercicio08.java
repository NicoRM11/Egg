/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CadenaService cs = new CadenaService();
        Cadena c1 = cs.creacionCadena();
        cs.mostrarCantidadVocales(c1);
        cs.invertirFrase(c1);
        cs.letraRepetida(c1);
        cs.compararLongitud(c1);
        cs.unirFrases(c1);
        System.out.println("Ingrese un caracter para que reemplace a la letra 'a':");
        System.out.println(cs.reemplazar(c1));
        System.out.println("Ingrese una letra(true si la contiene, o false si NO la contiene:");
        System.out.println(cs.contiene(c1));
    }

}
