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
public class Extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n,a,num,max,min;
        double suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros desea ingresar");
        num=leer.nextInt();
        a=0;
        suma=0;
        max=0;
        min=9999999;
        do {
            System.out.println("Ingrese un numero entero positivo");
            n=leer.nextInt();
            suma=suma+n;
            a++;
            if (n<min){
                min=n;
            } if (n>max) {
                max=n;
            }
        } while (a!=num);
        System.out.println("El maximo es " +max+ " el minimo es " +min+ " y el promedio es: " +suma/num);
    }
    
}
