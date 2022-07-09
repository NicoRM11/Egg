/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09;

/**
 *
 * @author Nicolas Romano
 */
public class MatematicaService {

    public Matematica obtenerNum() {
        Matematica m1 = new Matematica();
        double num1double = Math.random() * 10;
        int num1 = (int) Math.round(num1double);
        m1.setNum1(num1);
        double num2double = Math.random() * 10;
        int num2 = (int) Math.round(num2double);
        m1.setNum2(num2);
        // int i_val = (int) Math.round(d_val); (instruccion para convertir un double en un entero)
        return m1;
    }

    public int devolverMayor(Matematica m1) {
        int mayor;
        mayor = Math.max(m1.getNum1(), m1.getNum2());
        return mayor;
    }

    public double calcularPotencia(Matematica m1) {
        int mayor;
        mayor = Math.max(m1.getNum1(), m1.getNum2());
        int menor;
        menor = Math.min(m1.getNum1(), m1.getNum2());
        double potencia = Math.pow(mayor, menor);
        return potencia;
    }

    public double calcularRaiz(Matematica m1) {
        int menor;
        menor = Math.min(m1.getNum1(), m1.getNum2());
        double raizCuadrada = Math.sqrt(menor);
        return raizCuadrada;
    }

}
