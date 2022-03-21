/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    
    public void CrearNFI(NIF n1){
        System.out.print("\nIngrese su DNI: ");
        n1.setDNI(leer.nextLong());
        
        String[] PosicionLetra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        for(int i=0;i<PosicionLetra.length;i++){
            if((int)n1.getDNI()%23==i){
                n1.setLetra(PosicionLetra[i]);
            }
        }    
    }
    
    public void MostrarNFI(NIF n1){
        System.out.println("\nMostrando NIF: "+n1.getDNI()+"-"+n1.getLetra());
    }
}
