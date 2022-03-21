/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class CafeteraServicio {
    public Scanner leer = new Scanner(System.in);
    
    public void CrearCafetera(Cafetera c1){
        System.out.print("\nIngrese la capacidad máxima de la cafetera(mL): ");
        do{
            c1.setCapacidadMaxima(leer.nextInt());
        }while(c1.getCapacidadMaxima()<1);
    }
    
    public void LlenarCafetera(Cafetera c1){
        System.out.println("\nLa cafetera de "+c1.getCapacidadMaxima()+" mL se llenó.");
        c1.setCapacidadActual(c1.getCapacidadMaxima());
    }
    
    public void ServirTaza(int t,Cafetera c1){
        if(t<=c1.getCapacidadActual()){
            System.out.println("\nLa taza de "+t+" mL se llenó.");
            c1.setCapacidadActual(c1.getCapacidadActual()-t);
            System.out.println("La cafetera quedó a "+c1.getCapacidadActual()+" mL.");
        }else if(t>c1.getCapacidadActual()){
            System.out.println("\nLa taza de "+t+" mL no se llenó y quedo a "+c1.getCapacidadActual()+" mL."
                    + "\nLa cafetera se vació.");
            c1.setCapacidadActual(0);
        }
    }
    
    public void VaciarCafetera(Cafetera c1){
        c1.setCapacidadActual(0);
    }
    
    public void AgregarCafe(int cc,Cafetera c1){
        if(cc+c1.getCapacidadActual()>c1.getCapacidadMaxima()){
            System.out.println("\nLa cafetera se llenó, pero se rebalzó..");
            c1.setCapacidadActual(c1.getCapacidadMaxima());
        }else if(cc+c1.getCapacidadActual()==c1.getCapacidadMaxima()){
            System.out.println("\nLa cafetera se llenó.");
            c1.setCapacidadActual(c1.getCapacidadMaxima());
        }else{
            System.out.println("\nLa cafetera quedo a "+(cc+c1.getCapacidadActual())+" mL.");
        }
    }
}
