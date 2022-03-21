/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_ex_02;

import Entidades.Puntos;
import Servicios.PuntosServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos p1 = new Puntos();
        PuntosServicio pS = new PuntosServicio();
        
        System.out.println("Este programa recibe 2 puntos de un eje de coordenadas y luego dice la distancia entre ellos.");
        pS.CrearPuntos(p1);
        System.out.println("\nLa distancia entro los 2 puntos es: "+pS.DistanciaPuntos(p1));
    }
    
}
