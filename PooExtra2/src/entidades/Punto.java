package entidades;

import java.util.Scanner;

public class Punto {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Punto() {
    }

    public Punto(int x1, int y1, int x2, int y2) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    @Override
    public String toString() {
        return "Punto{" + "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + '}';
    }

    public void crearPuntos() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas");
        System.out.print("X1: ");
        this.x1 = leer.nextInt();
        System.out.print("y1: ");
        this.y1 = leer.nextInt();
        System.out.print("X2: ");
        this.x2 = leer.nextInt();
        System.out.print("y2: ");
        this.y2 = leer.nextInt();

    }

    public void calcularDistancia() {
        // d=√((x2-x1)²+(y2-y1)²)
        System.out.println("La distancia entre los puntos es: " + (Math.sqrt(Math.pow((this.x2 - this.x1), 2)
                + Math.pow((this.y2 - this.y1), 2))));
    }
}
