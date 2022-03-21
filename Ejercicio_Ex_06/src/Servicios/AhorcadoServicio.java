/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class AhorcadoServicio {

    public Scanner leer = new Scanner(System.in);
//funka
    public void CrearJuego(Ahorcado a1) {
        System.out.print("Ingrese la palabra a adivinar: ");
        String aux = leer.next();

        String[] aux2 = new String[aux.length()];

        for (int i = 0; i < aux.length(); i++) {
            aux2[i] = aux.substring(i, i + 1);
        }

        a1.setPalabra(aux2);

        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        
        a1.setJugadasMax(leer.nextInt());
        
        a1.setLetrasEncontradas(0);
    }

    public int Longitud(Ahorcado a1) {
        return a1.getPalabra().length;
    }
//funka
    public boolean Buscar(Ahorcado a1, String letra) {
        boolean encontrado = false;
        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i].equals(letra)) {
                encontrado = true;
            }
        }
        return encontrado == true;
    }

    public void Encontradas(Ahorcado a1, String letra,int[] faltantes) {

        int enc = 0;

        for (int i = 0; i < a1.getPalabra().length; i++) {
            if (a1.getPalabra()[i].equals(letra)) {
                enc++;
            }
        }
        a1.setLetrasEncontradas(a1.getLetrasEncontradas()+enc);
        
        faltantes[0]-=enc;
        
        System.out.print("Letras: encontradas " + a1.getLetrasEncontradas() + ",faltantes "+faltantes[0]);
    }
//funka
    public void Intentos(Ahorcado a1) {
        System.out.println("\nIntentos restantes: " + a1.getJugadasMax());
    }

    public void Juego(Ahorcado a1) {
        CrearJuego(a1);
        
        int[] faltantes = new int[1];
        faltantes[0]=Longitud(a1);
        
        do {
            System.out.print("\nIngrese una letra: ");
            String letra = leer.next();
            System.out.println("Longitud de la palabra: " + Longitud(a1));

            if (Buscar(a1, letra)) {
                System.out.println("La letra pertenece a la palabra.");
                Encontradas(a1,letra,faltantes);
                Intentos(a1);
            } else {
                System.out.println("La letra no pertenece a la palabra.");
                a1.setJugadasMax(a1.getJugadasMax()-1);
                Encontradas(a1,letra,faltantes);
                Intentos(a1);
            }
        } while (a1.getJugadasMax() > 0 && a1.getLetrasEncontradas() < Longitud(a1));
        
        if(a1.getLetrasEncontradas()==Longitud(a1)){
            System.out.println("\nBien hecho ganaste");
        }else if(a1.getJugadasMax()==0){
            System.out.println("\nTe quedaste sin intentos.");
        }
    }

}
