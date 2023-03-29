

package guia5;

import java.util.Scanner;

/**
 *
 * Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
 * adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
 * Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos
 * y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
* Al final del programa los profesores necesitan obtener por pantalla la cantidad 
* de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
* con promedio mayor o igual al 7 de sus notas del curso.

 * 
 * 
 */
public class Extra4 {
    public static void main(String[] args) {
        
        double a,b,c,d;
        double[] vec=new double[10];
        Scanner leer = new Scanner(System.in);
        
        for (int i=0;i<10;i++){
            System.out.println("Ingrese las notas para el alumno "+(i+1));
            System.out.println("Primer TP evaluativo: ");
            a=leer.nextInt();
            System.out.println("Segundo TP evaluativo: ");
            b=leer.nextInt();
            System.out.println("Primer Integrador: ");
            c=leer.nextInt();
            System.out.println("Segundo Integrador: ");
            d=leer.nextInt();
            vec[i]=.1*a+.15*b+.25*c+.5*d;
        }
        int cont=0;
        int cont1=0;
        for (int i=0;i<10;i++){
            if(vec[i]>=7){
                cont++;
            }else cont1++;
        }
        System.out.println(cont+" fueron los alumnos que aprobaron el curso!");
        System.out.println(cont1+" fueron los alumnos que tienen que recuperar :(" );
    }
    
}
