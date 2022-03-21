/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b
y c. Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en
caso de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package ejercicio_ex_03;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        Raices r1 = new Raices();
        RaicesServicio rS = new RaicesServicio();

        System.out.println("Este programa crea una ecuación de 2do grado y te permite interactuar con ella con un menú.");

        rS.CrearEcuacion(r1);

        do {

            System.out.println("\nEcuación ingresada: " + r1.getA() + "x^2+" + r1.getB() + "x+" + r1.getC()
                    + "\nMenú:"
                    + "\n1- Obtener el valor del discriminante."
                    + "\n2- Revisar si tiene 2 raices."
                    + "\n3- Revisar si tiene 1 raíz."
                    + "\n4- Mostrar raices"
                    + "\n5- Mostrar raíz."
                    + "\n6- Calcular Respuesta."
                    + "\n7- Salir");
            System.out.print("Ingrese una opción: ");
            op = rS.leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\nEl valor del discriminanate es: " + rS.GetDiscriminante(r1));
                    break;
                case 2:
                    if (rS.TieneRaices(r1)) {
                        System.out.println("\nTiene 2 raices.");
                    } else {
                        System.out.println("\nNo tiene raices o lo tiene una..");
                    }
                    break;
                case 3:
                    if (rS.TieneRaiz(r1)) {
                        System.out.println("\nTiene 1 raíz.");
                    } else {
                        System.out.println("\nNo tiene raíz o tiene dos.");
                    }
                    break;
                case 4:
                    rS.ObtenerRaices(r1);
                    break;
                case 5:
                    rS.ObtenerRaiz(r1);
                    break;
                case 6:
                    rS.Calcular(r1);
                    break;
                case 7:
                    System.out.println("\nHasta luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }

        } while (op != 7);

    }

}
