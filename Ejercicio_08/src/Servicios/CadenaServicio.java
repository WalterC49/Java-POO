/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Walter
 */
public class CadenaServicio {

    public Scanner leer = new Scanner(System.in);

    public void CrearCadena(Cadena c1) {
        leer.nextLine();
        System.out.print("\nIngrese una palabra o frase: ");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
    }

    public void MostrarVocales(Cadena c1) {
        int[] vocal = {0, 0, 0, 0, 0};
        for (int i = 0; i < c1.getLongitud(); i++) {
            switch (toLowerCase(c1.getFrase().substring(i, i + 1))) {
                case "a":
                    vocal[0]++;
                    break;
                case "e":
                    vocal[1]++;
                    break;
                case "i":
                    vocal[2]++;
                    break;
                case "o":
                    vocal[3]++;
                    break;
                case "u":
                    vocal[4]++;
                    break;
            }
        }

        if (vocal[0] + vocal[1] + vocal[2] + vocal[3] + vocal[4] == 1) {
            System.out.println("\nLa frase: " + c1.getFrase() + " tiene 1 vocal.");
        } else {
            System.out.println("\nLa frase: " + c1.getFrase() + " tiene " + (vocal[0] + vocal[1] + vocal[2] + vocal[3] + vocal[4])
                    + " vocales:");
        }
        System.out.println(vocal[0] + " A, " + vocal[1] + " E, " + vocal[2] + " I, " + vocal[3] + " O y " + vocal[0] + " U.");
    }
    
    public void InvertirFrase(Cadena c1){
        String aux="";
        for(int i=c1.getLongitud()-1;i>=0;i--){
            aux+=c1.getFrase().substring(i, i+1);
        }
        
        System.out.println("\nLa frase invertida es: " +aux);
    }
    
    public int VecesRepetido(Cadena c1,String letra){
        int vr=0;
        for(int i=0;i<c1.getLongitud();i++){
            if(c1.getFrase().substring(i, i+1).equals(letra)){
                vr++;
            }
        }
        return vr;
    }
    
    public void ComprarLongitud(Cadena c1,String frase){
        if(frase.length()>c1.getLongitud()){
            System.out.println("\nLa frase: "+frase+" es más larga que la frase: "+c1.getFrase());
        }else if(frase.length()==c1.getLongitud()){
            System.out.println("\nLa frase: "+frase+" es igual de larga que la frase: "+c1.getFrase());
        }else{
            System.out.println("\nLa frase: "+frase+" es más corta que la frase: "+c1.getFrase());
        } 
    }
    
    public void UnirFrases(Cadena c1,String frase){
        frase=c1.getFrase().concat(frase);
        //frase=c1.getFrase()+frase;
        System.out.println("\nLa nueva frase es: "+frase);
    }
    
    public void Reemplazar(Cadena c1,String letra){
        //NO modificó la frase original
        String aux=c1.getFrase().replace("a", letra);
        System.out.println("\nLa nueva frase es: "+aux);
        /*Modificó la frase original
        c1.setFrase(c1.getFrase().replace("a", letra));
        System.out.println("\nLa nues frase es: "+c1.getFrase());
        */
    }
    
    public boolean Contiene(Cadena c1,String letra){
        return c1.getFrase().contains(letra);
    }
    
}
