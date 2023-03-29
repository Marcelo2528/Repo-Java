package Guia4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Ruben
 * 
 * Diseñe una función que pida el nombre y la edad de N personas e
 * imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores
 * de edad. Después de cada persona,
 * el programa debe preguntarle al usuario si quiere seguir mostrando personas
 * y frenar cuando el usuario ingrese la palabra “No”.
 * 
 */
public class Guia4_Ejercicio2Bis    {
    public static void main(String[] args) {
        
        int n;
        System.out.println("Ingrese la cantidad de personas que desea cargar:");
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("""
                           Ingrese los datos:
                           """);
        String nombre;
        int edad;
        String seguir;
        seguir = "";
        
        for (int i = 0; i < n; i++) {
            
        
 
            System.out.println("Ingrese el nombre: ");
            nombre = in.next();
            System.out.println("Ingrese la edad: ");
            edad = in.nextInt();
            
            //invoco metodo
            persona(nombre, edad);
            
            System.out.println("Desea seguir cargando?\n(Escriba \"NO\" para salir) ");
            seguir = in.next();
            if (seguir.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
    public static void persona(String nombre, int edad) {
        System.out.println("\nLos Datos de la persona son:\n" +
                "Nombre: " + nombre +
                "\nEdad " + edad);
        if (edad > 18) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
    }
}