/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio_04;

import Entidades.Rectangulo;
import Servicios.RectanguloServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio rS = new RectanguloServicio();
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Este programa pide la base y altura de un rectángulo"
                + " y luego calcula su superficie, perímetro y lo dibuja.");
        
        rS.CrearRec(r1);
        
        System.out.println("\nLa superficie del rectángulo es: "+rS.Superficie(r1));
        System.out.println("El perímetro del rectángulo es: "+rS.Perimetro(r1));
        
        System.out.println("\nRectángulo hecho con asteriscos:");
        rS.DibujarR(r1);
    }

}
