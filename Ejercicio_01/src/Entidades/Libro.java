/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Walter
 */
public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int nPags;

    public Libro() {
    }
    
    public Libro(String ISBN, String titulo, String autor, int nPags) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPags = nPags;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nPags=" + nPags + '}';
    }    
}
