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
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int fam=leer.nextInt();
        double suma=0;
        int h=0;
        int cont=0;
        for (int i = 1; i <= fam; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+i);
            h=leer.nextInt();
            for (int j = 1; j <= h; j++) {
                System.out.println("Ingrese la edad del hijo "+j);
                suma+=leer.nextInt();
                cont++;
            }
            
        }
        System.out.println("La media de las edades de todas las familias es: "+(suma/cont));
    }
    
}
