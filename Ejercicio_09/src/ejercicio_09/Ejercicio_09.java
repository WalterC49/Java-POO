/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio_09;

import Entidades.Matematicas;
import Servicios.MatematicasServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Matematicas m1 = new Matematicas();
        MatematicasServicio mS = new MatematicasServicio();

        System.out.println("Este programa crea 2 Nº reales aleatorios y ver distintas opciones con un menú.");

        m1.setNum1(Math.random() * 10);
        m1.setNum2(Math.random() * 10);
        do {

            System.out.println("\nNúmero creados: " + m1.getNum1() + " y " + m1.getNum2()
                    + "\nMenú:"
                    + "\n1- Indicar cual es el mayor de los 2 números."
                    + "\n2- Calcular la potencia del mayor Nº elevado en el menor."
                    + "\n3- Calcular la raíz cuadrada del menor Nº."
                    + "\n4- Salir");
            System.out.print("Ingrese una opción: ");
            op = mS.leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\nEl mayor número es: "+mS.DevolverMayor(m1));
                    break;
                case 2:
                    mS.CalcularPotencia(m1);
                    break;
                case 3:
                    mS.CalcularRaiz(m1);
                    break;
                case 4:
                    System.out.println("\nHasta luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }

        } while (op != 4);
    }

}
