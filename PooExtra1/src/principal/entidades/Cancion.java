package principal.entidades;

import java.util.Scanner;

public class Cancion {

    public String titulo;
    public String autor;

    public Cancion() {

        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo= " + titulo + ", autor= " + autor + '}';
    }

    public void  cargarCancion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la cancion");
        this.titulo = leer.nextLine();
        System.out.println("Ingrese en autor de la cancion");
        this.autor = leer.nextLine();

      
    }

}
