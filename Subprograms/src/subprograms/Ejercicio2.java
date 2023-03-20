/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/

package subprograms;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

    }

    public static void list() {
        Scanner read = new Scanner(System.in);

        String name, option;
        int age;
        boolean sn, mde;
        mde = true;
        sn = true;

        do {
            System.out.println("Ingrese el nombre y la edad de la persona: ");
            name = read.nextLine();
            age = read.nextInt();

            if (age > 18) {
                System.out.println("Nombre: " + name + "\nEdad: " + age + "\n¿Mayor de edad?: " + mde);
            } else {
                System.out.println("Nombre: " + name + "\nEdad: " + age + "\n¿Mayor de edad?: " + !mde);
            }

            System.out.println("¿Quiere seguir mostrando personas? Si/No");
            option = read.nextLine();

            if (option.equals("No")) {
                sn = false;
            }

        } while (sn = true);

    }
}
