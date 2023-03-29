/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 *
 * @author yonyo
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        // creamos la matriz validando que ingresen valores entre 1 y 9
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese valores entre 1 y 9 para matriz[" + i + "][" + j + "]: ");
                do {
                    matriz[i][j] = leer.nextInt();

                } while (matriz[i][j] > 9 || matriz[i][j] < 1);
            }

        }
        //desde aqui hay que poner la logica para comprobar si es un cuadrado magico

        //comprobamos las sumas de las diagonales
        int diagp = 0, diags = 0;
        boolean magica = true;
        for (int i = 0; i < 3; i++) {
            
            
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagp += matriz[i][j];
                }
                if (i + j == 2) {
                    diags += matriz[i][j];
                }
            }

        }
        if (diagp!=diags) magica=false;

        //Ahora comprobamos las sumas de las filas y columnas
        int sumaf;
        int sumac;
        
        for (int i = 0; i < 3; i++) {
            sumaf = 0;
            sumac = 0;
            for (int j = 0; j < 3; j++) {
                sumaf += matriz[i][j];
                sumac += matriz[j][i];
            }
            if (sumac != diags || sumaf != diags) {
                magica = false;
            }
        }
        if (magica == true) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matrisz no es magica");
        }
    }

}
