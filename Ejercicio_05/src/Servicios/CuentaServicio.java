/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class CuentaServicio {
    public Scanner leer = new Scanner(System.in);
    
    public void CrearCuenta(Cuenta c1){
        System.out.print("\nIngrese un número para la cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese su DNI: ");
        c1.setDNI(leer.nextLong());
        System.out.print("Ingrese su saldo actual: ");
        c1.setSaldoActual(leer.nextDouble());
    }
    
    public void IngresarS(Cuenta c1){
        System.out.print("\nIngrese el saldo a ingresar: ");
        c1.setSaldoActual(c1.getSaldoActual()+leer.nextDouble());
    }
    
    public void RetirarS(Cuenta c1){
        System.out.print("\nIngrese el saldo a retirar: ");
        c1.setSaldoActual(c1.getSaldoActual()-leer.nextDouble());
        if(c1.getSaldoActual()<0){
            c1.setSaldoActual(0);
        }
    }
    
    public void ExtracionRapida(Cuenta c1){
        System.out.println("\nSe extrayerón $"+c1.getSaldoActual()*0.2);
        c1.setSaldoActual(c1.getSaldoActual()-c1.getSaldoActual()*0.2);        
    }
    
    public void ConsultarSaldo(Cuenta c1){
        System.out.println("\nSu saldo actual es: $"+c1.getSaldoActual());
    }
    
    public void ConsultarDatos(Cuenta c1){
        System.out.println("\nSus datos son:"
        +"\nNúmero de cuenta: "+c1.getNumeroCuenta()
        +"\nDNI: "+c1.getDNI()
        +"\nSaldo Actual: $"+c1.getSaldoActual());
    }
}
