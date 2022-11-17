/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioLibros;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author ema
 */
public class ServicioLibro1 {

    private Scanner leer = new Scanner(System.in);

    public Libro crearLibro() {

        System.out.println("Ingrese el numero de ISBN: ");
        int ISBN = leer.nextInt();

        System.out.println("Ingrese el titulo del libro: ");
        String titulo = leer.next();

        System.out.println("Ingrese el autor del libro: ");
        String autor = leer.next();

        System.out.println("Numeros de paginas");
        int npaginas = leer.nextInt();

        return new Libro(ISBN, titulo, autor, npaginas);
        
        

    }

}
