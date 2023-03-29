/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia4;

import java.util.Scanner;

/**
 *
 * 2. Implementar una función que permita obtener el valor absoluto de un número positivo
 * y otra que obtenga la raíz cuadrada. Para ello utilice los métodos abs() y sqrt() de la clase Math.
 * 
 * @author yonyo
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:");
        int a = leer.nextInt();
        System.out.println("El valor absoluto del numero es: "+abs(a));
        System.out.println("La raiz cuadrada del numero es:"+raiz(a));
    }
    
    
    public static int abs(int a){
        
        return Math.abs(a);
        
    }
    
    public static double raiz(double a){
        
        return Math.sqrt(a);
    }
    
}
