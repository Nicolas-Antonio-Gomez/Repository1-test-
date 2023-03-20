/*
 * Leer la altura de N personas y determinar el promedio de estaturas que se 
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/

package controlstructures;
import java.util.Scanner;

public class Extra6 {
    
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       
       int n, counter;
       double height, prom1, prom2;
        System.out.println("Ingrese la cantidad de personas a medir:");
        n = read.nextInt();
        
        System.out.println("Ahora, ingrese las estaturas:");
        prom1 = 0;
        prom2 = 0;
        counter = 0;
        for (int i = 0; i < n; i++) {
            height = read.nextDouble();
            if (height<1.60) {
                prom1 += height;
                counter++;
            }
            prom2 += height;
        }
        if (counter>0) {
            System.out.println("El promedio de las personas con una altura menor a 1.60 es: " + (prom1/counter));
        } else {
            System.out.println("No se ingresaron personas con altura menor a 1.60");
        }
        if (n>0) {
            System.out.println("El promedio de altura de las personas medidas es: " + (prom2/n));
        } else {
            System.out.println("No se ingresaron datos");
        }
    }

}
