/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Guia4_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num=leer.nextInt();
        System.out.println("El numero ingresado es primo: "+primo(num));
        
        
    }
    
    public static boolean primo(int num){
        int cont=0;
        boolean primo=true;
        for (int i = 1; i <= num; i++) {
            
            if (num%i==0) cont++;
           
        }
        if (cont>2) primo=false;
        return primo;
       
    }
    
}
