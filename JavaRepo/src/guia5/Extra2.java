package guia5;

import java.util.Scanner;

/**
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 *
 *
 */
public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el rango de los vectores: ");
        int n = leer.nextInt();
        int vec1[] = new int[n];
        int vec2[] = new int[n];
        for (int i = 0; i < n; i++) {
            vec1[i] = (int) (Math.random() * 2);
            vec2[i] = (int) (Math.random() * 2);
            System.out.println(vec1[i] + " - " + vec2[i]);

        }
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(vec1[i] + " - " + vec2[i]); 
            if (vec1[i]!=vec2[i]){
                System.out.println("No son iguales");
                break;
            }
            
        }
    }
}

