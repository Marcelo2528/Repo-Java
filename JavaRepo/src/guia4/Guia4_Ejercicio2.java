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
public class Guia4_Ejercicio2 {

    /**
     *
     * Diseñe una función que pida el nombre y la edad de N personas e imprima
     * los datos de las personas ingresadas por teclado e indique si son mayores
     * o menores de edad. Después de cada persona, el programa debe preguntarle
     * al usuario si quiere seguir mostrando personas y frenar cuando el usuario
     * ingrese la palabra “No”.
     *
     *
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        int cont = 0;
        String op = "";
        do {
            carga();

            System.out.println("Desea seguir crgando:S/N");
            op = leer.next();
            cont++;

        } while (cont < n && op.equalsIgnoreCase("S"));

    }

    public static void carga() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos de la persona");
        System.out.println("Nombre:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:   " + edad);
        if (edad > 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }

}
