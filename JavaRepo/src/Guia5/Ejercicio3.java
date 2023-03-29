/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 *
 * @author yonyo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese rango del vector");
        int n = leer.nextInt();
        int vector[] = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100000);

        }
        int cont = 0, a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 0; i < n; i++) {
            cont=0;
            do {
                vector[i] = vector[i] / 10;
                cont++;
            } while (vector[i] > 0);

            switch (cont) {
                case 1 ->
                    a++;
                case 2 ->
                    b++;
                case 3 ->
                    c++;
                case 4 ->
                    d++;
                case 5 ->
                    e++;
            }

        }
        System.out.println("Con una cifra hay "+a+" numeros");
        System.out.println("Con dos cifras hay "+b+" numeros");
        System.out.println("Con tres cifras hay "+c+" numeros");
        System.out.println("Con cuatro cifras hay "+d+" numeros");
        System.out.println("Con cinco cifras hay "+e+" numeros");

    }

}
