/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5;

/**
 *
 * @author yonyo
 */
public class Ejercicio5 {

    
    public static void main(String[] args) {
        int matriz1 [][] = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1 [i][j]= (int) (Math.random()*20-10);
                System.out.print(matriz1 [i] [j]+" ");
            }
            System.out.println("");
        }
 int matriz2 [][] = new int [3][3];
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j]=matriz1 [j][i];
                System.out.print(matriz2 [i][j]+" ");
            }
            System.out.println("");
            
            
        }boolean x = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz1 [i][j]!=-matriz2 [i][j])
                    x=false;
                
            }
        }if (x==true) System.out.println("LAS MATRICES SON ANTISIMETRICAS");
        else System.out.println("LAS MATRICES NO SON ANTISIMETRICAS");
    }
    
}