/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in);

    public Cadena creacionCadena() {
        Cadena c1 = new Cadena();
        System.out.println("Ingrese la frase o palabra que desee:");
        c1.setFrase(leer.nextLine());
        int longitud = c1.getFrase().length();
        c1.setLongitudFrase(longitud);
        return c1;
    }

    //metodo mostrar vocales
    public void mostrarCantidadVocales(Cadena c1) {
        int cont = 0;
        String letraxletra = "";
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            letraxletra = letraxletra.valueOf(c1.getFrase().charAt(i));
            if (letraxletra.equals("a") || letraxletra.equals("e") || letraxletra.equals("i") || letraxletra.equals("o") || letraxletra.equals("u")) {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales que tiene la frase es:" + cont);
    }

    //metodo para invertir frase
    public void invertirFrase(Cadena c1) {
        String invertida = "";
        for (int i = c1.getLongitudFrase() - 1; i >= 0; i--) {
            invertida = invertida + c1.getFrase().charAt(i);
        }
        System.out.println("La frase invertida es: " + invertida);
    }

    //metodos para la veces que se repite una letra
    public void letraRepetida(Cadena c1) {
        System.out.println("Ingrese la letra y el sistema dira cuantas veces se repite:");
        String letra = leer.nextLine();
        String letraxletra = "";
        int cont = 0;
        for (int i = 0; i < c1.getLongitudFrase(); i++) {
            letraxletra = letraxletra.valueOf(c1.getFrase().charAt(i));
            if (letraxletra.equals(letra)) {
                cont++;
            }
        }
        System.out.println("La letra se repite " + cont + " veces");

    }

    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese una frase y el sistema comparara la longitud con la frase inicial:");
        String frase = leer.nextLine();
        int comparacion = c1.getFrase().compareTo(frase);
        if (comparacion > 0) {
            System.out.println("La frase inicial es mayor que la segunda");
        } else if (comparacion == 0) {
            System.out.println("Las frases tienen la misma longitud");
        } else if (comparacion < 0) {
            System.out.println("La frase ingresada es mayor que la inicial");
        }

    }

    public void unirFrases(Cadena c1) {
        System.out.println("Ingrese una frase para unirla a la inicial:");
        String frase = leer.nextLine();
        String cadenaCompleta = c1.getFrase().concat(frase);
        System.out.println("La frase completa es: " + cadenaCompleta);

    }

    public String reemplazar(Cadena c1) {
        char caracter = leer.next().charAt(0);
        String fraseNueva = c1.getFrase().replace('a', caracter);
        return fraseNueva;

    }

    public boolean contiene(Cadena c1) {
        boolean contiene = false;
        String letra = leer.next();
        String letraxletra = "";

        for (int i = 0; i < c1.getLongitudFrase(); i++) {
          letraxletra = letraxletra.valueOf(c1.getFrase().charAt(i));
          if(letra.equals(letraxletra)){
          contiene = true;
          break;
          }
        }

        return contiene;
    }

}
