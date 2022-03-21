/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Puntos;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class PuntosServicio {
    public Scanner leer = new Scanner(System.in);
    
    public void CrearPuntos(Puntos p1){
        System.out.print("\nIngrese la coordenada X del 1er punto: ");
        p1.setX1(leer.nextInt());
        System.out.print("Ingrese la coordenada Y del 1er punto: ");
        p1.setY1(leer.nextInt());
        System.out.print("Ingrese la coordenada X del 2do punto: ");
        p1.setX2(leer.nextInt());
        System.out.print("Ingrese la coordenada Y del 2do punto: ");
        p1.setY2(leer.nextInt());
    }
    
    public double DistanciaPuntos(Puntos p1){
        return sqrt(pow(p1.getX2()-p1.getX1(),2)+pow(p1.getY2()-p1.getY1(),2));
    }
}
