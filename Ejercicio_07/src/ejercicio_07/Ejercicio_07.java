/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejercicio_07;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] edad = {0, 0};
        int[] peso = {0, 0, 0};
        //Declarando vector de objeto
        Persona[] p2 = new Persona[4];
        PersonaServicio pS = new PersonaServicio();

        System.out.println("Este programa recibe los datos de 4 personas y luego"
                + " calcula si esta en su peso ideal y si es mayor de edad o no.");

        for (int i = 0; i < 4; i++) {
            //Instanciando Vector de objeto
            p2[i]= new Persona();
            pS.CrearPersona(p2, i);
            pS.leer.nextLine();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("\nLa "+(i + 1) + "º persona:");
            switch (pS.CalcularMC(p2, i)) {
                case -1:
                    peso[0]++;
                    System.out.println("Está debajo de su peso ideal.");
                    break;
                case 0:
                    peso[1]++;
                    System.out.println("Está en su peso ideal.");
                    break;
                case 1:
                    peso[2]++;
                    System.out.println("Tiene sobrepeso.");
                    break;
            }
            if (pS.EsMayorDeEdad(p2, i)) {
                edad[0]++;
                System.out.println("Es mayor de edad.");
            } else {
                edad[1]++;
                System.out.println("No es mayor de edad.");
            }
        }

        System.out.println("\nDe las 4 personas:"
                + "\nEl " + (peso[0] * 25) + "% están debajo de su pero ideal."
                + "\nEl " + (peso[1] * 25) + "% están en su peso ideal."
                + "\nEl " + (peso[2] * 25) + "% tienen sobrepeso."
                + "\nEl " + (edad[0] * 25) + "% es mayor de edad."
                + "\nEl " + (edad[1] * 25) + "% es menor de edad.");
    }

}
