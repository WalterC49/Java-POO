/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class RectanguloServicio {
    Scanner leer = new Scanner(System.in);
    
    public void CrearRec(Rectangulo r1){
        System.out.print("Ingrese la altura del rectángulo: ");
        r1.setAltura(leer.nextInt());
        System.out.print("Ingrese la base del rectángulo: ");
        r1.setBase(leer.nextInt());
    }
    
    public int Superficie(Rectangulo r1){
        return r1.getAltura()*r1.getBase();
    }
    
    public int Perimetro(Rectangulo r1){
        return 2*(r1.getAltura()+r1.getBase());
    }
    
    public void DibujarR(Rectangulo r1){
        for(int i=0;i<r1.getAltura();i++){
            for(int j=0;j<r1.getBase();j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
