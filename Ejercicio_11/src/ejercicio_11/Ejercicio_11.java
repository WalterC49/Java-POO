/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
package ejercicio_11;

import static java.lang.Math.abs;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int anio,mes,dia;
        Date fecha1 = new Date();
        Date fecha2 = new Date();
        
        System.out.println("Este programa recibe una fecha y muestra la diferencia con la fecha actual.");
        System.out.print("Ingrese el día: ");
        dia=leer.nextInt();
        System.out.print("Ingrese el mes: ");
        mes=leer.nextInt();
        System.out.print("Ingrese el año: ");
        anio=leer.nextInt();
        
        //fecha1(anio,mes,dia);
        //fecha1 = new Date(anio,mes,dia);
        fecha1.setDate(dia);
        fecha1.setMonth(mes);
        fecha1.setYear(anio);
        System.out.println("\nFecha ingresada: "+fecha1.getDate()+"/"+fecha2.getMonth()+"/"+fecha2.getYear()
        +"\nFecha actual: "+fecha2.getDate()+"/"+fecha2.getMonth()+"/"+fecha2.getYear()
        +"\nHay "+abs(fecha1.getYear()-fecha2.getYear())+" años de diferencia.");
        
        
        
    }
    
}
