/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        Scanner leer = new Scanner(System.in);
        int num;
        //desarrollo
        System.out.println("Ingrese un numero que se encuentre entre el 1 y el 10");
        num = leer.nextInt();
        while(num > 10 || num < 1){
            System.out.println("Ingrese un numero valido, entre 1 y 10");
            num = leer.nextInt();
        }
        //switch, para el pasaje a numeros romanos
        switch (num) {
            case 1:
                System.out.println("El numero ingresado corresponde a I en numero romano");
                break;
            case 2:
                System.out.println("El numero ingresado corresponde a II en numero romano");
                break;
            case 3:
                System.out.println("El numero ingresado corresponde a III en numero romano");
                break;
            case 4:
                System.out.println("El numero ingresado corresponde a IV en numero romano");
                break;
            case 5:
                System.out.println("El numero ingresado corresponde a V en numero romano");
                break;
            case 6:
                System.out.println("El numero ingresado corresponde a VI en numero romano");
                break;
            case 7:
                System.out.println("El numero ingresado corresponde a VII en numero romano");
                break;
            case 8:
                System.out.println("El numero ingresado corresponde a VIII en numero romano");
                break;
            case 9:
                System.out.println("El numero ingresado corresponde a IX en numero romano");
                break;
            case 10:
                System.out.println("El numero ingresado corresponde a X en numero romano");
                break;
            
            default:
        }
    }
    
}
