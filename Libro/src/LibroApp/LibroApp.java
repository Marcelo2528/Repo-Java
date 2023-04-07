/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LibroApp;

import libro.entidades.Libro;

/**
 *
 * @author yonyo
 */
public class LibroApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro lib = new Libro();
        
        lib.setISBN(158);
        lib.setTitulo("Ciudad perdida");
        lib.setAutor("Marcos");
        lib.setNumeroPaginas(542);
        //System.out.println(lib);
        lib.mostrarLibro();
        Libro lib2 = Libro.cargaDatos();
        lib2.mostrarLibro();
        //System.out.println(lib2);
        
        
    }
    
}
