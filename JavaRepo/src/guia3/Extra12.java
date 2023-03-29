/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia3;

/**
 *
 * @author yonyo
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     *
     * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
     * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
     * aparezca un 3 lo sustituya por una E. Ejemplo: 0-0-0 0-0-1 0-0-2 0-0-E
     * 0-0-4 Nota: investigar función contains() y replace() de Java
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        int n;
        cadena = "";
        n = 0;
        do {

            cadena = Integer.toString(n);
            if (cadena.length() == 1) {
                cadena = "0" + "-" + "0" + "-" + cadena;
            } else if (cadena.length() == 2) {
                cadena = "0" + "-" + cadena.substring(0, 1) + "-" + cadena.substring(1, 2);
            } else {
                cadena = cadena.substring(0, 1) + "-" + cadena.substring(1, 2) + "-" + cadena.substring(2, 3);
            }
            if (cadena.contains("3")) {
                cadena = cadena.replace("3", "E");
            }
            System.out.println(cadena);
            n++;
        } while (n < 1000);

    }

}
