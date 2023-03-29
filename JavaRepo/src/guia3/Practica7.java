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
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String codigo, cod, cod2;
        int correctas, incorrectas;
        Scanner leer = new Scanner(System.in);

        correctas = 0;
        incorrectas = -1;
        do {
            System.out.println("Ingrese la cadena para analizar:");//(codigo.length()-1)
            codigo = leer.nextLine();
            if (codigo.substring(0, 1).equals("X")
                    && codigo.substring(codigo.length() - 1).equals("O")
                    && codigo.length() <= 5) {
                correctas++;
            } else {
                incorrectas++;
            }
            cod = codigo.substring(0, 1);
            cod2 = codigo.substring(codigo.length() - 1);

            System.out.println(cod + " " + cod2);
        } while (!codigo.equals("&&&&&"));
        System.out.printf("Fueron %d  secuencias correctas y %d incorrectas \n",correctas,incorrectas);
        //System.out.println("Fueron " + correctas + " secuencias correctas y " + incorrectas + " incorrectas");

    }

}
