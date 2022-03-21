/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class CancionServicio {

    public Scanner leer = new Scanner(System.in);

    public void CrearCancion(Cancion c1) {
        System.out.print("\nIngrese el titulo de la canción: ");
        c1.setTitulo(leer.nextLine());
        System.out.print("Ingrese el autor: ");
        c1.setAutor(leer.nextLine());
    }

    public void MostrarCancion(Cancion c1) {
        System.out.println("\nDatos de la canción:"
                + "\nTitulo: " + c1.getTitulo()
                + "\nAutor: " + c1.getAutor());
    }

}
