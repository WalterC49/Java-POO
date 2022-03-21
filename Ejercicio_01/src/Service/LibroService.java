/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class LibroService {
    
    public Scanner s=new Scanner(System.in);
    
    public Libro llenar(){
        System.out.print("Ingrese el ISBN del libro: ");
        String isbn =s.nextLine();
        
        System.out.print("Ingrese el título del libro: ");
        String titulo =s.nextLine();
        
        System.out.print("Ingrese el autor del libro: ");
        String autor =s.next();
        
        System.out.print("Ingrese el Nº de páginas del libro: ");
        int npags = s.nextInt();
        
        return new Libro(isbn, titulo, autor, npags);
    }
    
    public void mostrar(Libro l1){
        
        System.out.println("\nInformación del libro:");
        System.out.println("ISBN: "+l1.ISBN);
        System.out.println("Título: "+l1.titulo);
        System.out.println("Autor: "+l1.autor);
        System.out.println("Número de páginas: "+l1.nPags);
    }
    
}


