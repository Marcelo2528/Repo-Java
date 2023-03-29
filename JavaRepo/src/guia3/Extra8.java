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
public class Extra8 {

    /**
     * Escriba un programa que lea números enteros. Si el número es múltiplo de
     * cinco debe detener la lectura y mostrar la cantidad de números leídos, la
     * cantidad de números pares y la cantidad de números impares. Al igual que
     * en el ejercicio anterior los números negativos no deben sumarse. Nota:
     * recordar el uso de la sentencia break.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numeros enteros");
        int a = 0;
        int par = 0;
        int impar = 0;
        int cont = 0;
        do {
            a = leer.nextInt();
            if (a > 0) {
                if (a % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            cont++;
        } while (a % 5 != 0);
        System.out.printf("""
                           La cantidad de numero ingresados es: %d
                           Los pares fueron : %d
                           Y los impares : %d
                           """, cont, par, impar);
    }

}
