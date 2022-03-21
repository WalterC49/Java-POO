/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Matematicas;
import static java.lang.Double.max;
import static java.lang.Double.min;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class MatematicasServicio {
    public Scanner leer = new Scanner(System.in);
    
    public double DevolverMayor(Matematicas m1){
        return max(m1.getNum1(),m1.getNum2());
    }
    
    public void CalcularPotencia(Matematicas m1){
        System.out.println("\nLos números se redondearón a "+round(m1.getNum1())+" y "+round(m1.getNum2())
                + "\nLa potencia del mayor Nº elevado en el menor es: "+pow(round(max(m1.getNum1(),m1.getNum2())),round(min(m1.getNum1(),m1.getNum2()))));
    }
    
    public void CalcularRaiz(Matematicas m1){
        System.out.println("\nEl menor número se redondeó a "+round(min(m1.getNum1(),m1.getNum2()))
                + "\nLa raíz cuadrada del menor Nº es: "+sqrt(round(min(m1.getNum1(),m1.getNum2()))));
    }
}
