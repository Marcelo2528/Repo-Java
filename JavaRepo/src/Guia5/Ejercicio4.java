/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Ejercicio4 {

    /**
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
     * se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner leer = new Scanner(System.in);
        int matriz[][]=new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
