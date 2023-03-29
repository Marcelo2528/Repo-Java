/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Guia4_Ejercicio1 {

    /**
     *
     *
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int op = 0;
        while (op != 5) {
            System.out.print("""
                                Menu operaciones
                                
                                1 - Suma
                                2 - Resta
                                3 - Multiplicacion
                                4 - Division
                                5 - Salir
                         Elija una de las opciones: """);

            op = leer.nextInt();
            switch (op) {

                case 1 ->
                    System.out.println("La suma es: " + suma(num1, num2));
                case 2 ->
                    System.out.println("La resta es: " + resta(num1, num2));
                case 3 ->
                    System.out.println("La multiplicacion es: " + multi(num1, num2));
                case 4 ->
                    System.out.println("La division es: " + div(num1, num2));

            }
        }
    }

    public static int suma(int a, int b) {

        int suma = a + b;
        return suma;

    }

    public static int resta(int a, int b) {

        int resta = a - b;
        return resta;

    }

    public static int multi(int a, int b) {

        int multi = a * b;
        return multi;

    }

    public static float div(float a, float b) {

        float div = a / b;
        return div;

    }
}
