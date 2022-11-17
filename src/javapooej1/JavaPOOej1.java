/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapooej1;

import Entidades.Libro;
import ServicioLibros.ServicioLibro1;


public class JavaPOOej1 {

  
    public static void main(String[] args) {
          
        ServicioLibro1 sl = new ServicioLibro1();
        
        Libro L1 = sl.crearLibro();
        
        System.out.println(L1.toString());
        
    }
    
}
