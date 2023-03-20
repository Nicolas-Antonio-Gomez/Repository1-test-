/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el 
cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

*/

package subprograms;
import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args){
        double cantidad;
        String moneda;
        System.out.println("Cantidad de euros a convertir:");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        cantidad = leer.nextDouble();
        System.out.println("Moneda a la que se lo desea convertir:");
        System.out.println("Libras \nDolar \nYenes");
        moneda = leer.next();
        cambio(moneda,cantidad);
        
    }
    public static void cambio(String moneda, double cantidad) {
        switch (moneda) {
            case "Libras":
                System.out.println(cantidad + " €  son " + (cantidad*0.86)+ " libras");
                break;
            case "Dolar":
                System.out.println(cantidad + " € son " + (cantidad*1.28611)+ " dolares");
                break;
            case "Yenes":
                System.out.println(cantidad + " € son " + (cantidad*129.852)+ " yenes");
                break;
        }
    }
}
