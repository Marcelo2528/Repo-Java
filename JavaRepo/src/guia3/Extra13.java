/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;

import java.util.Scanner;
import javax.xml.transform.Source;

/**
 *
 * @author yonyo
 */
public class Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num=leer.nextInt();
        String cadena="";
        String cad="";
        for (int i = 1; i <= num; i++) {
            cadena= Integer.toString(i);
            cad= cad + cadena;
            System.out.println(cad);
        }
         
    }  
    
}
