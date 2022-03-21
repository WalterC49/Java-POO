/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import static java.lang.Math.pow;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Walter
 */
public class PersonaServicio {
    public Scanner leer = new Scanner(System.in);
    
    public void CrearPersona(Persona[] p1,int i){
        System.out.println("\n"+(i+1)+" º persona:");
        System.out.print("Ingrese el nombre: ");
        p1[i].setNombre(leer.nextLine());
        System.out.print("Ingrese la edad: ");
        p1[i].setEdad(leer.nextInt());
        do{
            System.out.print("Ingrese el sexo(H- hombre,M- mujer,O- otro): ");
            p1[i].setSexo(toUpperCase(leer.next()));
            if(!(p1[i].getSexo().equals("H")||p1[i].getSexo().equals("M")||p1[i].getSexo().equals("O"))){
                System.out.println("Opción no valida.");
            }
        }while(!(p1[i].getSexo().equals("H")||p1[i].getSexo().equals("M")||p1[i].getSexo().equals("O")));
        System.out.print("Ingrese el peso(Kg): ");
        p1[i].setPeso(leer.nextDouble());
        System.out.print("Ingrese la altura(mts): ");
        p1[i].setAltura(leer.nextDouble());
    }
    
    public int CalcularMC(Persona[] p1,int i){
        
        if(p1[i].getPeso()/pow(p1[i].getAltura(),2)<20){
            return -1;
        }else if(p1[i].getPeso()/pow(p1[i].getAltura(),2)>=20||p1[i].getPeso()/pow(p1[i].getAltura(),2)<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean EsMayorDeEdad(Persona[] p1,int i){
        return p1[i].getEdad()>=18;
    }
}
