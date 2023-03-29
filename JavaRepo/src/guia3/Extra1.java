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
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int dia,min,hs,aux;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos a calcular");
        min = leer.nextInt();
        dia = min/1440;
        hs = (min%1440)/60; 
        aux=(min%1440)%60;
        System.out.println( +dia+ " Dias - " +hs+ " horas - " +aux+  " Minutos" );
        
    }
    
}
