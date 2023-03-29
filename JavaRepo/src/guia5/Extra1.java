
package guia5;

import java.util.Scanner;

/**
 *
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
 * con los valores ingresados por el usuario.

 * 
 */
public class Extra1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el rango del vector");
        int n=leer.nextInt();
        int vector[]=new int[n];
        int suma=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingre un valor para el vector["+i+"]: ");
            vector[i]=leer.nextInt();
            suma+=vector[i];
        }
        System.out.println("La suma de los valores ingresados en el vector es: "+suma);
    }
    
}
