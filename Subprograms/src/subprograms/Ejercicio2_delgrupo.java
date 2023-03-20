

package subprograms;
import java.util.Scanner;

public class Ejercicio2_delgrupo {

    
    public static void main(String[] args) {
        String nombre;
        int edad;
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        nombre = read.next();
        while (!(nombre.equals("NO"))) {
            System.out.println("Ingrese la edad de la persona");
            edad = read.nextInt();
            if (retorno(edad) == true) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }
            System.out.println("Ingrese el nombre");
            nombre = read.next();
        }

    }

    public static boolean retorno(int edad) {
        boolean respuesta;

        if (edad > 18) {
            respuesta = true;
        } else {
            respuesta = false;
        }
        return respuesta;
    }
}