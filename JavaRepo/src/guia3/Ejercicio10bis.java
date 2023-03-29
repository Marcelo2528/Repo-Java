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
public class Ejercicio10bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  
Scanner leer = new Scanner(System.in);
        
        int num;
        int y=0;
        
        do{
        System.out.println("\ningrese 4 numeros entre el 1 y el 20");
        num = leer.nextInt();
            System.out.print(num);
        for(int i=0; i < num; i++){
            System.out.print("*");
        }
        y++;
        }
        while(y<4);
 }
    }
    

