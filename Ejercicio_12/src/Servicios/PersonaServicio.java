/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

    public void CrearPersona(Persona p1) {
        Date fecha = new Date();
        System.out.print("\nIngrese el nombre: ");
        p1.setNombre(leer.nextLine());
        System.out.println("Fecha de nacimiento:");
        System.out.print("Ingrese el día: ");
        fecha.setDate(leer.nextInt());
        System.out.print("Ingrese el mes: ");
        fecha.setMonth(leer.nextInt());
        System.out.print("Ingrese el año: ");
        fecha.setYear(leer.nextInt());
        p1.setNacimiento(fecha);
        leer.nextLine();
    }

    public void CalcularEdad(Persona p1) {
        LocalDate fA = LocalDate.now();
        LocalDate fN = LocalDate.of(p1.getNacimiento().getYear(), p1.getNacimiento().getMonth(), p1.getNacimiento().getDate());
        Period p = Period.between(fN, fA);
        if (p.getYears() == 1) {
            if (p.getMonths() == 1) {
                if (p.getDays() == 1) {
                    System.out.println("\nSu edad es " + p.getYears() + " año, " + p.getMonths() + " mes y " + p.getDays() + " día.");
                }else{
                    System.out.println("\nSu edad es " + p.getYears() + " año, " + p.getMonths() + " mes y " + p.getDays() + " días.");
                }
            }else{
                if (p.getDays() == 1) {
                    System.out.println("\nSu edad es " + p.getYears() + " año, " + p.getMonths() + " meses y " + p.getDays() + " día.");
                }else{
                    System.out.println("\nSu edad es " + p.getYears() + " año, " + p.getMonths() + " meses y " + p.getDays() + " días.");
                }
            }
        }else{
            if (p.getMonths() == 1) {
                if (p.getDays() == 1) {
                    System.out.println("\nSu edad es " + p.getYears() + " años, " + p.getMonths() + " mes y " + p.getDays() + " día.");
                }else{
                    System.out.println("\nSu edad es " + p.getYears() + " años, " + p.getMonths() + " mes y " + p.getDays() + " días.");
                }
            }else{
                if (p.getDays() == 1) {
                    System.out.println("\nSu edad es " + p.getYears() + " años, " + p.getMonths() + " meses y " + p.getDays() + " día.");
                }else{
                    System.out.println("\nSu edad es " + p.getYears() + " años, " + p.getMonths() + " meses y " + p.getDays() + " días.");
                }
            }
        }
    }
    
    public boolean MenorQue(Persona p1,Persona p2){
    LocalDate fA = LocalDate.now();
    LocalDate fN = LocalDate.of(p1.getNacimiento().getYear(), p1.getNacimiento().getMonth(), p1.getNacimiento().getDate());
    LocalDate f2 = LocalDate.of(p1.getNacimiento().getYear(), p2.getNacimiento().getMonth(), p2.getNacimiento().getDate());
    Period per1 = Period.between(fN,fA);
    Period per2 = Period.between(f2,fA);
    return per2.getYears()<per1.getYears();
    }
    
    public void MostrarPersona(Persona p1){
        System.out.print("\nNombre: "+p1.getNombre());
        CalcularEdad(p1);
    }
    
    
}
