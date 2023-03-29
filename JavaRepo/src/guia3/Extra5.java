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
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String letra;
         double precio;
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio: A-B-C");
        letra = leer.nextLine();
        System.out.println("Ingrese el valor normal del tratamiento");
        precio = leer.nextInt();
        switch (letra) {
            case "A" -> System.out.println("DeBera abonar $" +precio*.5);    
            case "B" -> System.out.println("DeBera abonar $" +precio*.65); 
            case "C" -> System.out.println("DeBera abonar $" +precio); 
        }
    }
    
}
