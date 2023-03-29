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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
        
        String num ;
        int y=0;
        System.out.println("Ingrese 4 numeros entre el 1 y el 20");
        do{
        num = leer.next();
        
           for(int i = 0; i < Integer.parseInt(num); i++){
            System.out.print("*");}
        y++;
            System.out.println("");
        }
        while  (y<4) ;
        System.out.println("");
    }
        }
    
    

