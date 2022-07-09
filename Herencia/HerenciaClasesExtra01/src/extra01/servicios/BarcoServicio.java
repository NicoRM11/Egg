/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra01.servicios;

import extra01.entidades.Alquiler;
import extra01.entidades.Barco;
import extra01.entidades.BarcoAMotor;
import extra01.entidades.Velero;
import extra01.entidades.Yate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Nicolas Romano
 */
public class BarcoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void eleccionBarco(Alquiler a1) {
        BarcoServicio bs = new BarcoServicio();
        Barco bb1 = new Barco();
        Velero v1 = new Velero();
        BarcoAMotor b1 = new BarcoAMotor();
        Yate y1 = new Yate();
        System.out.println("Eliga el tipo de barco que desee alquilar:");
        System.out.println("1- Barco comun");
        System.out.println("2- Velero");
        System.out.println("3- Barco a motor");
        System.out.println("4- Yate");
        int eleccion = 0;
        long precioFinalAlquiler;
        while (eleccion == 0) {
            eleccion = leer.nextInt();
            if (eleccion == 1) {
                bs.alquilerBarcoComun(bb1);
                //logica para establecer el precio del alquiler
                long diferenciaFecha = ChronoUnit.DAYS.between(a1.getFechaAlquiler(), a1.getFechaDevolucion());
                precioFinalAlquiler = diferenciaFecha * (bb1.getEslora() * 10);
                System.out.println("Estimado " + a1.getNombreCliente());
                System.out.println("El precio final del alquiler del barco comun es de: $" + precioFinalAlquiler);
            } else if (eleccion == 2) {
                bs.alquilerVelero(v1);
                //logica para establecer el precio del alquiler
                long diferenciaFecha = ChronoUnit.DAYS.between(a1.getFechaAlquiler(), a1.getFechaDevolucion());
                precioFinalAlquiler = diferenciaFecha * ((v1.getEslora() + v1.getNumeroMastiles()) * 10);
                System.out.println("Estimado " + a1.getNombreCliente());
                System.out.println("El precio final del alquiler del velero es de: $" + precioFinalAlquiler);
                break;
            } else if (eleccion == 3) {
                bs.alquilerBarcoAMotor(b1);
                //logica para establecer el precio del alquiler
                long diferenciaFecha = ChronoUnit.DAYS.between(a1.getFechaAlquiler(), a1.getFechaDevolucion());
                precioFinalAlquiler = diferenciaFecha * ((b1.getEslora() + b1.getPotenciaCV()) * 10);
                System.out.println("Estimado " + a1.getNombreCliente());
                System.out.println("El precio final del alquiler de barco a motor es de: $" + precioFinalAlquiler);
                break;
            } else if (eleccion == 4) {
                bs.alquilerYate(y1);
                //logica para establecer el precio del alquiler
                long diferenciaFecha = ChronoUnit.DAYS.between(a1.getFechaAlquiler(), a1.getFechaDevolucion());
                precioFinalAlquiler = diferenciaFecha * ((y1.getEslora() + y1.getPotenciaCV() + y1.getNumeroCamarotes()) * 10);
                System.out.println("Estimado " + a1.getNombreCliente());
                System.out.println("El precio final del alquiler del yate es de: $" + precioFinalAlquiler);
                break;
            }
        }
    }

    //metodo para cargar un barco comun
    public Barco alquilerBarcoComun(Barco bb1) {
        System.out.println("----------");
        System.out.println("Barco comun:");
        System.out.println("Ingrese su eslora(valor en metros):");
        bb1.setEslora(leer.nextInt());
        System.out.println("Ingrese su matricula:");
        bb1.setMatricula(leer.next());
        System.out.println("Ingrese año de fabricacion:");
        bb1.setAnioFabricacion(leer.nextInt());
        return bb1;
    }

    public Velero alquilerVelero(Velero v1) {
        System.out.println("----------");
        System.out.println("Velero:");
        System.out.println("Ingrese su eslora(valor en metros):");
        v1.setEslora(leer.nextInt());
        System.out.println("Ingrese su matricula:");
        v1.setMatricula(leer.next());
        System.out.println("Ingrese año de fabricacion:");
        v1.setAnioFabricacion(leer.nextInt());
        System.out.println("Ingrese cantidad de mastiles:");
        v1.setNumeroMastiles(leer.nextInt());
        return v1;
    }

    public BarcoAMotor alquilerBarcoAMotor(BarcoAMotor b1) {
        System.out.println("----------");
        System.out.println("Barco a motor:");
        System.out.println("Ingrese su eslora(valor en metros):");
        b1.setEslora(leer.nextInt());
        System.out.println("Ingrese su matricula:");
        b1.setMatricula(leer.next());
        System.out.println("Ingrese año de fabricacion:");
        b1.setAnioFabricacion(leer.nextInt());
        System.out.println("Ingrese potencia(en CV):");
        b1.setPotenciaCV(leer.nextInt());
        return b1;
    }

    public Yate alquilerYate(Yate y1) {
        System.out.println("----------");
        System.out.println("Barco a motor:");
        System.out.println("Ingrese su eslora(valor en metros):");
        y1.setEslora(leer.nextInt());
        System.out.println("Ingrese su matricula:");
        y1.setMatricula(leer.next());
        System.out.println("Ingrese año de fabricacion:");
        y1.setAnioFabricacion(leer.nextInt());
        System.out.println("Ingrese potencia(en CV):");
        y1.setPotenciaCV(leer.nextInt());
        System.out.println("Ingrese su numero de camarotes:");
        y1.setNumeroCamarotes(leer.nextInt());
        return y1;
    }

}
