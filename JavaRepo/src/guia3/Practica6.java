/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros");
        float a = leer.nextFloat();
        float b = leer.nextFloat();
        String sal = "";

        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicacion");
            System.out.println("4 - Division");
            System.out.println("5 - Salir");

            int op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("La suma es: " + (a + b));
                    break;
                case 2:
                    System.out.println("La resta es: " + (a - b));
                    break;

                case 3:
                    System.out.println("La multiplicaion es: " + (a * b));
                    break;
                case 4:
                    System.out.println("La division es: " + (a / b));
                    break;
                case 5: {
                    System.out.println("Esta seguro de salir? S/N");
                    sal = leer.next();
                    break;
                }

            }
        } while (!sal.equals("S"));

        System.out.println("Gracias por usar nuestros servicios!");
    }
}