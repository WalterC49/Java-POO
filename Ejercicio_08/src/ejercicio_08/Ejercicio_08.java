/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio_08;

import Entidades.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        String letra;
        Cadena c1 = new Cadena();
        CadenaServicio cS = new CadenaServicio();

        System.out.println("Este programa te permite crear una Cadena y manipularla con disdintas opciones.");

        do {
            if(c1.getLongitud()!=0){
                System.out.print("\nFrase actual: "+c1.getFrase());
            }
            System.out.println("\nMenú:"
                    + "\n1- Ingresar frase"
                    + "\n2- Mostrar la cant. de vocales"
                    + "\n3- Invertir frase"
                    + "\n4- ¿Cuántas veces se repite un carácter?"
                    + "\n5- Comparar la longitud de la cadena con otra"
                    + "\n6- Concatenar una nueva frase"
                    + "\n7- Reemplazar las A de la frase con un nuevo carácter"
                    + "\n8- Verificar si un carácter se encuentrar en la frase"
                    + "\n9- Salir");
            System.out.print("Ingrese una opción: ");
            op = cS.leer.nextInt();

            switch (op) {
                case 1:
                    cS.CrearCadena(c1);
                    break;
                case 2:
                    cS.MostrarVocales(c1);
                    break;
                case 3:
                    cS.InvertirFrase(c1);
                    break;
                case 4:
                    System.out.print("\nIngrese el carácter a verificar: ");
                    letra=cS.leer.next();
                    if(cS.VecesRepetido(c1,letra)==1){
                        System.out.println("El carácter se repite 1 vez.");
                    }else{
                        System.out.println("El carácter se repite "+cS.VecesRepetido(c1, letra)+" veces.");
                    }
                    break;
                case 5:
                    System.out.print("\nIngrese la frase comparar: ");
                    cS.leer.nextLine();
                    cS.ComprarLongitud(c1,cS.leer.nextLine());
                    break;
                case 6:
                    cS.leer.nextLine();
                    System.out.print("\nIngrese la nueva frase: ");
                    cS.UnirFrases(c1,cS.leer.nextLine());
                    break;
                case 7:
                    System.out.print("\nIngrese el carácter: ");
                    cS.Reemplazar(c1,cS.leer.next());
                    break;
                case 8:
                    System.out.print("\nIngrese el carácter a verificar: ");
                    letra=cS.leer.next();
                    if(cS.Contiene(c1,letra)){
                        System.out.println("El carácter "+letra+" se encuentra en la frase.");
                    }else{
                        System.out.println("El carácter "+letra+" no se encuentra en la frase.");
                    }
                    break;
                case 9:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        } while (op != 9);

    }

}
