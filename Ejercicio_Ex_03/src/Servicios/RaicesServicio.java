/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class RaicesServicio {
    public Scanner leer = new Scanner(System.in);
    
    public void CrearEcuacion(Raices r1){
        System.out.println("\nForma de la ecuación: Ax^2+Bx+C");
        System.out.print("Ingrese A: ");
        r1.setA(leer.nextInt());
        System.out.print("Ingrese B: ");
        r1.setB(leer.nextInt());
        System.out.print("Ingrese C: ");
        r1.setC(leer.nextInt());
    }
    
    public double GetDiscriminante(Raices r1){
        return pow(r1.getB(),2)-(4*r1.getA()*r1.getC());
    }
    
    public boolean TieneRaices(Raices r1){
        return GetDiscriminante(r1)>0;
    }
    
    public boolean TieneRaiz(Raices r1){
        return GetDiscriminante(r1)==0;
    }
    
    public void ObtenerRaices(Raices r1){
        if(TieneRaices(r1)){
            System.out.println("\nLas raices de la ecuación son x1 = "+(-1*r1.getB()+sqrt(GetDiscriminante(r1)))/(2*r1.getA())+""
                    + " y x2 = "+(-1*r1.getB()-sqrt(GetDiscriminante(r1)))/(2*r1.getA()));
        }else{
            System.out.println("\nLa ecuación no tiene raices en los reales o tiene una raíz.");
        }
    }
    
    public void ObtenerRaiz(Raices r1){
        if(TieneRaiz(r1)){
            System.out.println("\nLa raíz de la ecuación es x = "+(-1*r1.getB()+sqrt(pow(r1.getB(),2)-(4*r1.getA()*r1.getC())))/2*r1.getA());
        }else{
            System.out.println("\nLa ecuación no tiene una raiz en los reales o tiene dos raices.");
        }
    }
    
    public void Calcular(Raices r1){
        if(TieneRaices(r1)==true){
            ObtenerRaices(r1);
        }else if(TieneRaiz(r1)==true){
            ObtenerRaiz(r1);
        }else{
            System.out.println("\nLa ecuación no tiene solucción en los Reales.");
        }
    }
}
