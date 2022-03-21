/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
*/
package ejercicio_ex_01;

import Entidades.Cancion;
import Servicios.CancionServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        CancionServicio cS = new CancionServicio();
        
        System.out.println("Este programa carga los datos de una canción y los muestra en pantalla.");
        
        cS.CrearCancion(c1);
        cS.MostrarCancion(c1);
    }
    
}
