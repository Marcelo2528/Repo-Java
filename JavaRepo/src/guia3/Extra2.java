/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;

/**
 *
 * @author yonyo
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a,b,c,d,aux;
        a=5;
        b=8;
        c=12;
        d=9;
        System.out.println(+a+ "/" +b+ "/" +c+ "/" +d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.print(+a+ "/" +b+ "/" +c+ "/" +d);
        
    }
    
}
