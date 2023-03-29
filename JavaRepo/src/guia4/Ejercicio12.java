/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero enteros");
        int a = leer.nextInt();
        int b = leer.nextInt();
        EsMultipli(a, b);

    }

    public static void EsMultipli(float a, float b) {

        if (a % b == 0) {
            System.out.println("El primer numero es multiplo del segundo");
        } else {
            System.out.println("El primer numero No es multiplo del segundo");
        }

    }
}
