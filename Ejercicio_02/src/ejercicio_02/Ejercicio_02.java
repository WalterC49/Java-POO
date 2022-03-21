/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio! ).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package ejercicio_02;

import Entidades.Circunferencia;
import Service.CircunferenciaService;

/**
 *
 * @author Walter
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa calcula el área y perimetro de una circunferencia.");
        CircunferenciaService Sc = new CircunferenciaService();

        //usando set y get
        Circunferencia c1 = new Circunferencia();
        Sc.CrearC(c1);
        Sc.Area(c1);
        Sc.Perimetro(c1);
        
        /*SIN USAR SET Y GET         
        Circunferencia c2 = Sc.Crear();
        Sc.Area(c2);
        Sc.Perimetro(c2);
        */
    }

}
