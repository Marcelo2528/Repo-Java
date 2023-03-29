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
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 10:");
        num = leer.nextInt();
        
        if (num >= 1 && num <= 10) {
            
            switch (num) {
                case 1 -> System.out.println("En numero romanos se reprenta asi: I");
                case 2 -> System.out.println("En numero romanos se reprenta asi: II");
                case 3 -> System.out.println("En numero romanos se reprenta asi: III");
                case 4 -> System.out.println("En numero romanos se reprenta asi: IV");
                case 5 -> System.out.println("En numero romanos se reprenta asi: V");
                case 6 -> System.out.println("En numero romanos se reprenta asi: VI");
                case 7 -> System.out.println("En numero romanos se reprenta asi: VII");
                case 8 -> System.out.println("En numero romanos se reprenta asi: VIII");
                case 9 -> System.out.println("En numero romanos se reprenta asi: IX");
                case 10 -> System.out.println("En numero romanos se reprenta asi: X");
            }
         
        } else if (num < 0) {
            System.out.println("Error, intente nuevamente");
            
        }  else if (num == 0) {
             System.out.println("El valor " + num + " no es valido y no se tomara en cuenta");
        } else {
            System.out.println(num + "!Wow se te fue la mano!");
            
        }
        System.out.println("Hasta la proxima");
    }
    
}
