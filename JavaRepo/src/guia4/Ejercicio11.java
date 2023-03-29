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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        
        System.out.println(cambio(frase));
        
    }
    
    public static String cambio(String frase){
        
        String cambia="";
        String cad="";
        //String cadena ="";
        for (int i = 0; i < frase.length() ; i++) {
            
            cad = frase.substring(i, i+1);
            switch (cad){
                case "a","A" ->
                    cad="@";
                case "e","E" ->
                    cad="#";
                case "i","I" ->
                    cad="$";    
                case "o","O" ->
                    cad="%";
                case "u","U" ->
                    cad="*";    
                    
            }
            cambia+=cad;
            
        }
               
        return (cambia);
    }
    
    
    
}
