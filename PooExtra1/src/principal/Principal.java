
package principal;

import principal.entidades.Cancion;

/**
 *
 *Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el título
 * y el autor a cadenas vacías y otro que reciba como parámetros el título y el 
 * autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.
 
 * 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Cancion tema1 = new Cancion();
        Cancion tema2 = new Cancion("Las flores","La Bersuit");
        tema1.cargarCancion();
        System.out.println(tema1.toString());
        Cancion tema3=new Cancion();
        tema3.setTitulo("Tiempos modernos");
        tema3.setAutor("Pablo alcaraz");
        System.out.println(tema3.toString());
        System.out.println(tema2.toString());
                            
        
        
    }
}
