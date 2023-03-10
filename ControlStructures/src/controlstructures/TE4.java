/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se 
 * debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
 * El programa deberá calcular y mostrar el resultado de la suma de los números 
 * leídos, pero si el número es negativo no debe sumarse. 
 * Nota: recordar el uso de la sentencia break.
 */

package controlstructures;

import java.util.Scanner;


public class TE4 {

    
    public static void main(String[] args) {

        int num, summation, count;
        summation = 0;
        count = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese 20 números enteros:");

        do {
            num = read.nextInt();
            count++;
            if (num != 0) {
                if (num > 0) {
                    summation += num;
                }
            } else {
                System.out.println("Se ha encontrado el 0.");
                break;
            }
        } while (count < 20);

        System.out.println("La sumatoria de los números ingresados es: " + summation);

    }

}
