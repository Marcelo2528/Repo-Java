/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Extra10 {

    /**
     * @param args the command line arguments
     * 
     * Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int num = (int) (Math.random()*10+1);
      int num2 = (int) (Math.random()*10+1);
      int multi = num*num2;
      int z;
      Scanner leer = new Scanner(System.in);
        System.out.println(num+" "+num2);
      do{
          
      
        System.out.println("Adivine el resultado:");
        z=leer.nextInt();
      }while (multi!=z);  
        System.out.println("Felicidades, adivino!!");
      /*Random aleatorio = new Random();
      int s = aleatorio.nextInt(8,10);
      System.out.println(s);
      */
                
//System.out.println(num);
        
    }
    
}
