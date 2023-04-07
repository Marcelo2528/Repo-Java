/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.entidades;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    
    public static Libro cargaDatos(){
        
        Scanner leer = new Scanner(System.in);
        
        int ISBN,numeroPaginas;
        String titulo, autor;
        
        System.out.println("Ingerse los datos del libro: ");
        System.out.println("ISBN: ");
        ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Titulo: ");
        titulo = leer.nextLine();
        System.out.println("Autor: ");
        autor = leer.nextLine();
        System.out.println("Cantodad de paginas: ");
        numeroPaginas = leer.nextInt();
        leer.nextLine();
        
        return new Libro(ISBN,titulo,autor,numeroPaginas);   
  
        
    }
    
    public void mostrarLibro() {
		System.out.printf("\nISBN: %d\n"
				+ "Titulo: %-15s\n"
				+ "Autor: %-15s\n"
				+ "Paginas: %d\n", this.getISBN(), this.getTitulo(), this.getAutor(), this.getNumeroPaginas());
	}
    
    
    
    
    
    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
    
    
    
    
    
}
