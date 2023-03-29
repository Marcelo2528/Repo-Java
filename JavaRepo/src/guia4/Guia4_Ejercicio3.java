/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4;

/**
 *
 * @author yonyo
 */
import java.util.Scanner;

/**
 *
 * @author Ruben
 * 
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 * introducida por teclado a otra moneda,
 * estas pueden ser a dólares, yenes o libras.
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir
 * que será una cadena, este no devolverá ningún valor y mostrará un mensaje
 * indicando el cambio (void).
 * 
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 * 
 */
public class Guia4_Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros (€) a vonvertir");
        float moneda;
        moneda = in.nextFloat();
        String tipoMoneda;
        System.out.println("""
                           Elija a cual moneda convertir:
                           
                                    Libra
                                    Dolar
                                    Yen
                           
                           """);
        tipoMoneda = in.next();
        
        convertir(moneda, tipoMoneda);       
    }
    public static void convertir(float moneda, String tipo) {
        switch (tipo) {
            case "Libra", "LIBRA", "libra":
                    System.out.println( moneda + " €\nequivale a " + (moneda * 0.86) + " Libras");
                break;
            case "dolar", "DOLAR", "Dolar":
                    System.out.println( moneda + " €\nequivale a " + (moneda * 1.28611) + " Dolares");            
                break;
            case "yen", "YEN", "Yen":
                    System.out.println( moneda + " €\nequivale a " + (moneda * 129.852) + " Yenes");            
                break;
            
        }
    }
}