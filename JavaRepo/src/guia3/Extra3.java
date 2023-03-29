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
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una vocal");
        letra = leer.nextLine();

        switch (letra) {
            case "a","e","i","o","u" ->
                System.out.println("La letra ingresada es una vocal");
            case "A","E","I","O","U" ->
                System.out.println("La letra ingresada es una vocal y en mayusculas");
            default ->
                System.out.println("La letra ingresada no es una vocal");

        }

        /*
        if (letra == "A") {
                System.out.println("Coorecto, la letra ingresada es una vocal");
                
        }else{
            System.out.println("Incoorecto, la letra ingresada no es una vocal" +letra);
        }*/
    }
}
