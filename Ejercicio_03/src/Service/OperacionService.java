/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class OperacionService {

    public Scanner leer = new Scanner(System.in);

    public void crearOperacion(Operacion o1) {
        System.out.print("Ingrese el 1er número: ");
        o1.setNumero1(leer.nextDouble());
        System.out.print("Ingrese el 2do número: ");
        o1.setNumero2(leer.nextDouble());
    }

    public double sumar(Operacion o1) {
        return o1.getNumero1() + o1.getNumero2();
    }

    public double restar(Operacion o1) {
        int op;
        System.out.println("Elija el ordén:"
                + "\n1- " + o1.getNumero1() + "-" + o1.getNumero2()
                + "\n2- " + o1.getNumero2() + "-" + o1.getNumero1());
        System.out.print("Ingrese una opción: ");
        do {
            op = leer.nextInt();
            if(op!=1 &&op!=2){
                System.out.println("Opción no valida.");
            }
        } while (op != 1 && op != 2);

        if (op == 1) {
            return o1.getNumero1() - o1.getNumero2();
        } else {
            return o1.getNumero2() - o1.getNumero1();
        }
    }

    public double multiplicar(Operacion o1) {
        return o1.getNumero1() * o1.getNumero2();
    }

    public double dividir(Operacion o1) {
        int op;
        System.out.println("Elija el ordén:"
                + "\n1- " + o1.getNumero1() + "/" + o1.getNumero2()
                + "\n2- " + o1.getNumero2() + "/" + o1.getNumero1());
        do {
            System.out.print("Ingrese una opción: ");
            op = leer.nextInt();
            if(op!=1 &&op!=2){
                System.out.println("Opción no valida.");
            }
        } while (op != 1 && op != 2);

        if (op == 1) {
            if (o1.getNumero2() == 0) {
                System.out.print("La división por cero no está definida."
                +"\nElija otro 2do número: ");
                o1.setNumero2(leer.nextDouble());
                return o1.getNumero1() / o1.getNumero2();
            } else {
                return o1.getNumero1() / o1.getNumero2();
            }
        } else {
            if (o1.getNumero1() == 0) {
                System.out.print("La división por cero no está definida."
                +"\nElija otro 1er número: ");
                o1.setNumero1(leer.nextDouble());
                return o1.getNumero2() / o1.getNumero1();
            } else {
                return o1.getNumero2() / o1.getNumero1();
            }
        }

    }
}
