

package controlstructures;
import java.util.Scanner;

public class Extra5 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int amount;
        String type;

        System.out.println("Ingrese la clase de socio(A, B o C):");
        type = read.next();
        type = type.toUpperCase();
        
        System.out.println("Ingrese el monto a pagar:");
        amount = read.nextInt();

        switch (type) {
            case "A":
                System.out.println("El socio debe pagar una cuota de $1000, mas el monto con un descuento del 50% por un total de: " + ((amount * 0.5) + 1000));
                break;
            case "B":
                System.out.println("El socio debe pagar una cuota de $500, mas el monto con un descuento del 35% por un total de: " + ((amount * 0.65) + 500));
                break;
            case "C":
                System.out.println("El socio debe pagar una cuota de $250, mas el monto por un total de: " + (amount + 250));
                break;
            default:
                System.out.println("El tipo de socio indicado no figura en el sistema");
        }
    }

}
