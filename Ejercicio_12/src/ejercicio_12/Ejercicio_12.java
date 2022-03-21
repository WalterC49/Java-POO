/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Nota: encontraras un ejemplo descargable de un Date como atributo en Moodle.
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
*/
package ejercicio_12;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        PersonaServicio pS = new PersonaServicio();
        
        System.out.println("Este programa recibe los datos de una persona:");
        pS.CrearPersona(p1);
        
        System.out.println("\nCalcula su edad.");
        
        pS.CalcularEdad(p1);
        
        System.out.print("\nCompara si es menor que otra persona."
                + "\nIngrese los datos de la 2da persona:\n");
        pS.CrearPersona(p2);
        
        if(pS.MenorQue(p1, p2)){
            System.out.println("\nLa 1ra persona no es menor que la 2da.");
        }else{
            System.out.println("\nLa 1ra persona es menor que la 2da.");
        }
        
        System.out.println("\nMostrando los datos de la 2da persona.");
        pS.MostrarPersona(p2);
        
    }
    
}
