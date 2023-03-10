/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre
 * su equivalente en romano.
*/
package controlstructures;
import java.util.Scanner;

public class Extra4 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un número del 1 al 10:");
        
        num = read.nextInt();
        
        while(num<1 || num>10){
            System.out.println("El número ingresado es incorrecto, intente nuevamente.");
            num = read.nextInt();
        }
        
        switch (num) {
            case 1:
                System.out.println("El equivalente en n° romano es: I");
                break;
            case 2:
                System.out.println("El equivalente en n° romano es: II");
                break;
            case 3:
                System.out.println("El equivalente en n° romano es: III");
                break;
            case 4:
                System.out.println("El equivalente en n° romano es: IV");
                break;
            case 5:
                System.out.println("El equivalente en n° romano es: V");
                break;
            case 6:
                System.out.println("El equivalente en n° romano es: VI");
                break;
            case 7:
                System.out.println("El equivalente en n° romano es: VII");
                break;
            case 8:
                System.out.println("El equivalente en n° romano es: VIII");
                break;
            case 9:
                System.out.println("El equivalente en n° romano es: IX");
                break;
            case 10:
                System.out.println("El equivalente en n° romano es: X");
        }
    }

}
