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
public class Extra5 {

    /**
     *
     * 1. Implementar una función que permita obtener un número entero aleatorio
     * comprendido entre dos límites que introduciremos por teclado. El número
     * obtenido se debe mostrar por pantalla.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El numero que se genero aleatoriamente es: " + aleatorio());
    }

    public static int aleatorio() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero enteros limites");
        int a = leer.nextInt();
        int b = leer.nextInt();
        int c = (int) (Math.random() * (b - a + 1) + a);
        return (c);
    }

}
