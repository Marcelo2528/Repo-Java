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
public class Extra9 {

    /**
     * @param args the command line arguments
     * 
     * Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,coc,res;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        a=leer.nextInt();
        b=leer.nextInt();
        res=0;
        coc= a;
        while (b<=coc){
            coc=coc-b;
            res++;
        }
        System.out.println("El resultado es "+res+" y el residuo "+coc);
    }
    
}
