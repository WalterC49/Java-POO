/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
package ejercicio_06;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        CafeteraServicio cS = new CafeteraServicio();
        int op,t;
        
        System.out.println("Este programa simula el uso de una cafetera.");
        
        do {
            System.out.println("Nespresso"
                    + "\nMenú:"
                    + "\n1- Crear Cafetera"
                    + "\n2- Llenar Cafetera"
                    + "\n3- Servir taza de café"
                    + "\n4- Vaciar Cafetera"
                    + "\n5- Agregar café"
                    + "\n6- Salir");
            System.out.print("Ingrese una opción: ");
            op = cS.leer.nextInt();

            switch (op) {
                case 1:
                    cS.CrearCafetera(c1);
                    break;
                case 2:
                    cS.LlenarCafetera(c1);
                    break;
                case 3:
                    
                    System.out.print("\nIngrese el tamaño de la taza(mL): ");
                    t=cS.leer.nextInt();
                    cS.ServirTaza(t, c1);
                    break;
                case 4:
                    cS.VaciarCafetera(c1);
                    break;
                case 5:
                    System.out.print("\n¿Cuánto café desea agregar? ");
                    t=cS.leer.nextInt();
                    cS.AgregarCafe(t, c1);
                    break;
                case 6:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (op != 6);
    }
    
}
