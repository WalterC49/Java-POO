/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Circunferencia;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class CircunferenciaService {
    
    private Scanner leer = new Scanner(System.in);
    
    public void CrearC(Circunferencia c1){
        System.out.print("Ingrese el radio de una circunferencia: ");
        c1.setRadio(leer.nextDouble());
    }
    
    public Circunferencia Crear(){
        System.out.print("Ingrese el radio de una circunferencia: ");
        double radio = leer.nextDouble();
        
    return new Circunferencia(radio);
    }
    
    public void Area(Circunferencia c1){
        System.out.println("Su radio es: "+String.format("%.2f",pow(c1.getRadio(),2)*3.14));
    }
    
    public void Perimetro(Circunferencia c1){
        System.out.println("Su perimetro es: "+String.format("%.2f",2*c1.getRadio()*3.14));
    }
    
}
