

package controlstructures;
import java.util.Scanner;

public class Extra8 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, par = 0, impar = 0, total = 0, sumatoria = 0;       
                
        do {
            System.out.println("ingresar una serie de numeros");

            n = read.nextInt();
            if (n % 5 == 0) {
                System.out.println("se ha encontrado el 5");
                break;
            } else {

                if (n > 0) {

                    if (n % 2 == 0) {
                        par++;
                    } else {
                        impar++;
                    }
                    sumatoria++;
                }
            }
        } while (n % 5 != 0);
        System.out.println("la cantidad de impares es: " + impar);
        System.out.println("la cantidad de pares es: " + par);
        System.out.println("la cantidad de nros leidos es: " + sumatoria);
    }

}

