/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author Nicolas Romano
 */
public class MainEjercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaService ps = new PersonaService();
        System.out.println("Para persona numero 1:");
        Persona p1 = ps.crearPersona();
        System.out.println("Para persona numero 2:");
        Persona p2 = ps.crearPersona();
        System.out.println("Para persona numero 3:");
        Persona p3 = ps.crearPersona();
        System.out.println("Para persona numero 4:");
        Persona p4 = ps.crearPersona();
        //contador de personas por pesos
        int contPesoBajo = 0;
        int contPesoIdeal = 0;
        int contPesoMayor = 0;
        int contMayorEdad = 0;
        int contMenorEdad = 0;
        //PERSONA 1
        if (ps.calcularMC(p1) == 1) {
            System.out.println("La persona 1 esta por encima de su peso ideal");
            contPesoMayor = contPesoMayor + 1;
        } else if (ps.calcularMC(p1) == 0) {
            System.out.println("La persona 1 esta en su peso ideal");
            contPesoIdeal = contPesoIdeal + 1;
        } else if (ps.calcularMC(p1) == -1) {
            System.out.println("La persona 1 esta por debajo de su peso ideal");
            contPesoBajo = contPesoBajo + 1;
        }
        //verificacion si la persona es mayor de edad
        if (ps.mayorDeEdad(p1) == true) {
            System.out.println("La persona 1 es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        } else {
            System.out.println("La persona 1 no es mayor de edad");
            contMenorEdad = contMenorEdad + 1;
        }

        //PERSONA 2
        if (ps.calcularMC(p2) == 1) {
            System.out.println("La persona 2 esta por encima de su peso ideal");
            contPesoMayor = contPesoMayor + 1;
        } else if (ps.calcularMC(p2) == 0) {
            System.out.println("La persona 2 esta en su peso ideal");
            contPesoIdeal = contPesoIdeal + 1;
        } else if (ps.calcularMC(p2) == -1) {
            System.out.println("La persona 2 esta por debajo de su peso ideal");
            contPesoBajo = contPesoBajo + 1;
        }
        //verificacion si la persona es mayor de edad
        if (ps.mayorDeEdad(p2) == true) {
            System.out.println("La persona 2 es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        } else {
            System.out.println("La persona 2 no es mayor de edad");
            contMenorEdad = contMenorEdad + 1;
        }

        //PERSONA 3
        if (ps.calcularMC(p3) == 1) {
            System.out.println("La persona 3 esta por encima de su peso ideal");
            contPesoMayor = contPesoMayor + 1;
        } else if (ps.calcularMC(p3) == 0) {
            System.out.println("La persona 3 esta en su peso ideal");
            contPesoIdeal = contPesoIdeal + 1;
        } else if (ps.calcularMC(p3) == -1) {
            System.out.println("La persona 3 esta por debajo de su peso ideal");
            contPesoBajo = contPesoBajo + 1;
        }
        //verificacion si la persona es mayor de edad
        if (ps.mayorDeEdad(p3) == true) {
            System.out.println("La persona 3 es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        } else {
            System.out.println("La persona 3 no es mayor de edad");
            contMenorEdad = contMenorEdad + 1;
        }

        //PERSONA 4
        if (ps.calcularMC(p4) == 1) {
            System.out.println("La persona 4 esta por encima de su peso ideal");
            contPesoMayor = contPesoMayor + 1;
        } else if (ps.calcularMC(p4) == 0) {
            System.out.println("La persona 4 esta en su peso ideal");
            contPesoIdeal = contPesoIdeal + 1;
        } else if (ps.calcularMC(p4) == -1) {
            System.out.println("La persona 4 esta por debajo de su peso ideal");
            contPesoBajo = contPesoBajo + 1;
        }
        //verificacion si la persona es mayor de edad
        if (ps.mayorDeEdad(p4) == true) {
            System.out.println("La persona 4 es mayor de edad");
            contMayorEdad = contMayorEdad + 1;
        } else {
            System.out.println("La persona 4 no es mayor de edad");
            contMenorEdad = contMenorEdad + 1;
        }

        //porcentaje de personas que estan en los distintos pesos
        double porcentajePesoMenor = (contPesoBajo * 100 / 4);
        double porcentajePesoIdeal = (contPesoIdeal * 100 / 4);
        double porcentajePesoMayor = (contPesoMayor * 100 / 4);
        //porcentaje de personas mayor o menor de edad
        double porcentajeMayorEdad = (contMayorEdad * 100 / 4);
        double porcentajeMenorEdad = (contMenorEdad * 100 / 4);
        //muestra por pantalla
        System.out.println("El porcentaje de personas por debajo de su peso ideal es de: " + porcentajePesoMenor + "%");
        System.out.println("El porcentaje de personas que estan en su peso ideal es de: " + porcentajePesoIdeal + "%");
        System.out.println("El porcentaje de personas por encima de su peso ideal es de: " + porcentajePesoMayor + "%");
        System.out.println("El porcentaje de personas mayores de edad es de: " + porcentajeMayorEdad + "%");
        System.out.println("El porcentaje de personas menores de edad es de: " + porcentajeMenorEdad + "%");
    }

}
