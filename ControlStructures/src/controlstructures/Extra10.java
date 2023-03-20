

package controlstructures;
import java.util.Scanner;

public class Extra10 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
    int resultado, propuesta;
    int n1 = (int) (Math.random() * 11);
    int n2 = (int) (Math.random() * 11);
        
    resultado = n1 * n2;
    System.out.println("resultado: "+ resultado);
        System.out.println("adivine el numero misterioso: ");
        propuesta = read.nextInt();
        while (propuesta!=resultado){
            System.out.println("no es el correcto. Intente nuevamente");
             propuesta = read.nextInt();
            }
        System.out.println("HAS ADIVINADO!!!!!!!!!!!!!");
    }
    
    
}
    


