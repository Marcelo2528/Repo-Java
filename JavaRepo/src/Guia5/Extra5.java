/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**
 * 
 * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
 * y muestre la suma de sus elementos.

 *
 * @author yonyo
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas: ");
        int n=leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas: ");
        int m= leer.nextInt();
        int matriz[][]=new int[n][m];
        int suma=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                suma+=matriz[i][j];
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("La suma de los valores de los elementos de la matriz es: "+suma);
    }
    
}
