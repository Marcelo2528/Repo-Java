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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,a,cont;
        double alto;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        n=leer.nextInt();
        a=0;
        double suma1,suma2;
        suma1=0;
        suma2=0;
        cont=0;
        do {
            System.out.println("Ingrese la altura:");
            alto = leer.nextDouble();
            if ( alto < 1.6 ) {
                suma1=suma1+alto;
                cont++;
            
            } else {
                suma2=suma2+alto;
            }a++;
        } while (a!=n);
        System.out.println("El promedio de alturas en general es: " +(suma2+suma1)/n);
        System.out.println("El promedio de alturas menores a 1,60 es: " +suma1/cont);
    }
    
}
