
package principal;

import entidades.Punto;

/**
 *Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos
 * serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos usando un método 
 * crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
 * Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos
 * que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:

 * d=√((x_2-x_1)²+(y_2-y_1)²)
 */
public class Principal {
    
    public static void main(String[] args) {
        
       Punto coordenadas1 = new Punto();
       
       coordenadas1.crearPuntos();

       coordenadas1.calcularDistancia();
       
       
        
        
    }
    
    
}
