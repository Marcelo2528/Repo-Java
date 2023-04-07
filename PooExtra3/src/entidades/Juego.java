/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author yonyo
 */
public class Juego {
    
    private int jugador1;
    private int jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador1=" + jugador1 + ", jugador2=" + jugador2 + '}';
    }
    
    public void iniciarJuego(){
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero que sera buscado jugador1: ");
        this.jugador1 = leer.nextInt();
        //ahora el jugador 2 tiene que adivinar el numero 
        int cont = 0;
        int intentos = 4;
        do{
            System.out.println("Jugador2, adivine el numero: ");
            this.jugador2 = leer.nextInt();
            
            if (this.jugador1>this.getJugador2()){
                System.out.println("El numero es mas alto");
                System.out.println("Le quedan "+intentos+" intentos");
            }else {
                System.out.println("El numero es mas bajo");
                System.out.println("Le quedan "+intentos+" intentos");
            }
            intentos--;
            cont++;
        }while(cont<5 && this.jugador1!=this.getJugador2());
        
        if (this.jugador1==this.getJugador2()){
            System.out.println("Acerto!");
        }else System.out.println("Perdio, vuelva a intentarlo");
    }
    
}
