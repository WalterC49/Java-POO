/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
*/
package ejercicio_10;

import java.util.Arrays;

/**
 *
 * @author Walter
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        
        System.out.println("Este programa crea los vectores A[50] y B[20].");
        
        for(int i=0;i<A.length;i++){
            A[i]=Math.random()*10;
        }
        
        Arrays.sort(A);
        
        System.out.println("\nLlena el Arreglo A con números aleatorios:");
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]+" ");
        }
        
        for(int i=0;i<B.length;i++){
                B[i]=A[i];
            if(i>=10){
                B[i]=0.5;
            }
        }
        System.out.println("\nOrdena el Arreglo A de menor a mayor:");
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]+" ");
        }
        System.out.println("\nCopia los primeros 10 Nº de A en B y el resto los llena con 0,5:");
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]+" ");
        }
    }
    
}
