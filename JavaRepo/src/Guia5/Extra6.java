/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Extra6 {

    /**
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
     * a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
     * de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
     * en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
     * de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
     * Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
* de Java substring(), Length() y Math.random().

     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int cant=0;
        String frase=" ";
       String sopa[][]=new String [20][20];
        int fila=0;
        int col=0;
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j]=Integer.toString((int)(Math.random()*10));
            }
            
        }
        do{
            
            System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
            do {    
                frase = leer.nextLine();
            }while(frase.length()<3 || frase.length()>5);
            
            fila=(int)(Math.random()*20);
            
            col=(int)(Math.random()*10);
            System.out.println(fila+" "+col);
            int c=frase.length()+col;
           
            for (int i = col, k = 0; i < c; i++, k++) {
                 sopa[fila][i] = frase.substring(k, k+1).toUpperCase();
            }
            cant++;
        }while (cant<5);
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]+" ");
                
            }
            System.out.println("");
            
        }
    }
    
}
