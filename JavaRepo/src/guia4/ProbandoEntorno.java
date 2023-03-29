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
public class ProbandoEntorno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int numero = leer.nextInt();
        int num = 125;
        if (num == numero) {
            System.out.println("OK");
        }
        int op=0;
        do {

            System.out.println("""
                                    Menu principal
                               Eija una de las opciones
                                 
                                    1- Suma
                                    2- Resta
                                    3- Division
                                    4- Multiplicacion
                                    5- Raiz Cuadrada
                                    6- Salir
                            """);
            System.out.println("");
            op = leer.nextInt();

            switch (op) {
                case 1 ->
                    System.out.println("Suma");
                case 2 ->
                    System.out.println("Resta");
                case 3 ->
                    System.out.println("Divi");
                case 4 ->
                    System.out.println("Multi");
                case 5 ->
                    System.out.println("Raiz2");
                case 6 ->
                    System.out.println("Salir");
                default ->
                    System.out.println("Ingreso incorrecto");
            }

        } while (op != 6);

        mensaje();
    }

    public static void mensaje() {
        //Scanner leer = new Scanner(System.in);
        System.out.println("""
                                Ingrese los datos que van a pedir
                                Nombre
                                Edad
                                Sexo
                                """);
        

    }
    
   
   
}
