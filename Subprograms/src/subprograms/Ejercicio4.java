/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe 
devolver true si es primo, sino false.
*/

package subprograms;
import java.util.Scanner;

public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int num,counter;
        counter = 0;
        System.out.println("Ingrese un número:");
        num = read.nextInt();
        
       /* for (int i = 2; i <= 100; i++) { //comprobación de los primos entre 1 y 100.
            if (prime(i)) {
                counter++;
            }
        }
        System.out.println(counter);*/
       
        if (prime(num)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }
    
    public static boolean prime(int num){
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
