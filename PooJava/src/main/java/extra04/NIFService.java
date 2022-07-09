/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra04;

import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class NIFService {

    Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        NIF n1 = new NIF();
        String[] vector = new String[23];
        long resto;
        System.out.println("Ingrese el numero de DNI:");
        n1.setDni(leer.nextLong());
        resto = n1.getDni() % 23;
        //relleno de vector con letras
        vector[0] = "T";
        vector[1] = "R";
        vector[2] = "W";
        vector[3] = "A";
        vector[4] = "G";
        vector[5] = "M";
        vector[6] = "Y";
        vector[7] = "F";
        vector[8] = "P";
        vector[9] = "D";
        vector[10] = "X";
        vector[11] = "B";
        vector[12] = "N";
        vector[13] = "J";
        vector[14] = "Z";
        vector[15] = "S";
        vector[16] = "Q";
        vector[17] = "V";
        vector[18] = "H";
        vector[19] = "L";
        vector[20] = "C";
        vector[21] = "K";
        vector[22] = "E";
        //asignacion de letra
        if (resto == 0) {
            n1.setLetra(vector[0]);
        } else if (resto == 1) {
            n1.setLetra(vector[1]);
        } else if (resto == 2) {
            n1.setLetra(vector[2]);
        } else if (resto == 3) {
            n1.setLetra(vector[3]);
        } else if (resto == 4) {
            n1.setLetra(vector[4]);
        } else if (resto == 5) {
            n1.setLetra(vector[5]);
        } else if (resto == 6) {
            n1.setLetra(vector[6]);
        } else if (resto == 7) {
            n1.setLetra(vector[7]);
        } else if (resto == 8) {
            n1.setLetra(vector[8]);
        } else if (resto == 9) {
            n1.setLetra(vector[9]);
        } else if (resto == 10) {
            n1.setLetra(vector[10]);
        } else if (resto == 11) {
            n1.setLetra(vector[11]);
        } else if (resto == 12) {
            n1.setLetra(vector[12]);
        } else if (resto == 13) {
            n1.setLetra(vector[13]);
        } else if (resto == 14) {
            n1.setLetra(vector[14]);
        } else if (resto == 15) {
            n1.setLetra(vector[15]);
        } else if (resto == 16) {
            n1.setLetra(vector[16]);
        } else if (resto == 17) {
            n1.setLetra(vector[17]);
        } else if (resto == 18) {
            n1.setLetra(vector[18]);
        } else if (resto == 19) {
            n1.setLetra(vector[19]);
        } else if (resto == 20) {
            n1.setLetra(vector[20]);
        } else if (resto == 21) {
            n1.setLetra(vector[21]);
        } else if (resto == 22) {
            n1.setLetra(vector[22]);
        }

        return n1;
    }
    
    public void mostrarNIF(NIF n1){
        System.out.println("NIF:" + n1.getDni() + "-" + n1.getLetra());
    
    }
}
