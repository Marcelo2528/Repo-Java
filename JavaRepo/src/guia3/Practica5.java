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
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor limite");
        int limit = leer.nextInt();
        int suma=0;
        int num;
        while (limit > suma){
            System.out.println("Ingrese un numero entero");
            num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("A superado el limite inicial!");
        
        
    }
    
}
