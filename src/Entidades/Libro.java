/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int npaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int npaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
    }

    

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", npaginas=" + npaginas + '}';
    }
    
    

}
