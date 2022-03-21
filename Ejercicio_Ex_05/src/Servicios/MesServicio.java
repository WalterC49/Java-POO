/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Mes;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Walter
 */
public class MesServicio {
    Scanner leer = new Scanner(System.in);
    
    public void JugarMesSecreto(Mes m1){
        m1.setMesSecreto(m1.getMeses()[(int)(Math.random()*(12-1+1)+1)]);
        System.out.println(m1.getMesSecreto());
        System.out.println("Adivina el mes.");
        System.out.print("Indroduzca el nombre de un mes: ");
        
        if(m1.getMesSecreto().equals(toLowerCase(leer.next()))){
            System.out.println("\n¡Bien hecho ha acertado!");
        }else{
            System.out.println("No ha acertado.");
            System.out.print("Intenta de vuelta: ");
            boolean acierto=false;
            do{
                if(m1.getMesSecreto().equals(toLowerCase(leer.next()))){
                    System.out.println("\n¡Bien hecho ha acertado!");
                    acierto=true;
                }else{
                    System.out.println("No ha acertado.");
                    System.out.print("Intenta de vuelta: ");
                }
            }while(acierto==false);
        }
    }
}
