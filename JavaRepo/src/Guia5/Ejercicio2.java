
package Guia5;

import java.util.Scanner;

/**
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida
* al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido


*/
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el rango del vector");
        int n = leer.nextInt();
        int vector[]=new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]=(int)(Math.random()*10);
            System.out.print(vector[i]+" ");
            
        }
        System.out.println("");
        System.out.println("Ingrese un numero a buscar en el vector");
        int num=leer.nextInt();
        int cont=0;
        for (int i = 0; i < n; i++) {
            if (num==vector[i]){
                System.out.println("El numero se encuentra en la posicion: "+(i+1));
                cont++;
            }
            
        }
        if (cont>1) System.out.println("El numero se encuentra repetido");
    }
    
}
