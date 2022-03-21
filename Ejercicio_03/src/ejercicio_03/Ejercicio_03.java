/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package ejercicio_03;

import Entidades.Operacion;
import Service.OperacionService;

/**
 *
 * @author Walter
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionService oS = new OperacionService();
        Operacion o1 = new Operacion();
        int op;
        System.out.println("Este programa recibe 2 Nº y a través de un menú se elijen distintas operaciones a realizar.");

        oS.crearOperacion(o1);

        do {
            System.out.println("\nNúmeros ingresados: "+o1.getNumero1()+" y "+o1.getNumero2());
            System.out.println("\nMenú:"
                    + "\n1- Sumar"
                    + "\n2- Restar"
                    + "\n3- Multiplicar"
                    + "\n4- Dividir"
                    + "\n5-Salir");
            System.out.print("Ingrese una opción: ");
            op = oS.leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("El resultado de la suma es "+oS.sumar(o1));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es "+oS.restar(o1));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es "+oS.multiplicar(o1));
                    break;
                case 4:
                    System.out.println("El resultado de la división es "+oS.dividir(o1));
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }

        } while (op != 5);

    }

}
