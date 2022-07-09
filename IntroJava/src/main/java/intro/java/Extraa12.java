/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

/**
 *
 * @author Nicolas Romano
 */
public class Extraa12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        String numCadena = "E";
        //desarrollo
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (k == 3) {
                        System.out.println(i + "-" + j + "-" + numCadena);
                    } else if (j == 3) {
                        if (k == 3) {
                            System.out.println(i + "-" + numCadena + "-" + numCadena);

                        } else {
                            System.out.println(i + "-" + numCadena + "-" + k);
                        }

                    } else if (i == 3) {
                        if (j==3){
                        if (k==3){
                        System.out.println(numCadena + "-" + numCadena + "-" + numCadena);
                        } else{
                        System.out.println(numCadena + "-" + numCadena + "-" + k);}
                        }
                        else{
                        System.out.println(numCadena + "-" + j + "-" + k);}
                       

                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }

                }
            }
        }
    }

}
