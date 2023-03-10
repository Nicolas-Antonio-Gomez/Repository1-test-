

package controlstructures;
import java.util.Scanner;

public class Extra5 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int amount;
        String type;

        System.out.println("Ingrese el monto a pagar:");
        amount = read.nextInt();

        System.out.println("Ingrese la clase de socio(A, B o C):");
        type = read.next();
        type = type.toUpperCase();

        switch (type) {
            case "A":
                System.out.println("El socio debe pagar: " + (amount * 0.5));
                break;
            case "B":
                System.out.println("El socio debe pagar: " + (amount * 0.65));
                break;
            case "C":
                System.out.println("El socio debe pagar: " + amount);
                break;
            default:
                System.out.println("El tipo de socio indicado no figura en el sistema");
        }
    }

}
