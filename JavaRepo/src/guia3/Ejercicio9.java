/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;

import java.util.Scanner;

/**
 *Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
 * El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 * Nota: recordar el uso de la sentencia break.

 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    	Scanner leer = new Scanner(System.in);

    	//String respuesta;
        int cont =0;
        int num;
        int suma=0;
    	do {

    	System.out.println("Ingrese un numero entero");
    	num = leer.nextInt();
        if (num>0) suma=suma+num;
        cont++;
    	} while ( cont<20 && num!=0 );

        
    }
    
}
