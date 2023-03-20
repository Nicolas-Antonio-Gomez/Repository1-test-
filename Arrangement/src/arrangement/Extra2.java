/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
*/

package arrangement;
import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los vectores a comparar:");
        int n = read.nextInt();

        int[] vec1 = new int[n];
        int[] vec2 = new int[n];

        System.out.println(" ");
        System.out.println("Ahora seleccione una opción:\n"
                + "1. Rellenar los vectores manualmente. \n2. Rellenar los vectores con númeos aleatorios"
                + "entre el 1 y el 9.");
        int option = read.nextInt();
        
        fill(vec1,vec2,n,option);
        boolean check = compare(vec1,vec2,n);
        
        System.out.println("¿Los vectores son iguales? " + compare(vec1,vec2,n));
    }

    public static void fill(int[] vec1, int[] vec2, int n, int option) {
        Scanner read = new Scanner(System.in);

        while(option != 1 && option != 2){
            System.out.println("La opción ingresada es incorrecta, intente nuevamente.");
            option = read.nextInt();
        }

        if (option == 1) {

            System.out.println("Ingrese los valores del vector 1 en orden:");

            for (int i = 0; i < n; i++) {
                int num = read.nextInt();
                vec1[i] = num;
            }

            System.out.println("Ahora, ingrese los valores del vector 2 en orden:");

            for (int i = 0; i < n; i++) {
                int num = read.nextInt();
                vec2[i] = num;
            }
        } else {
            for (int i = 0; i < n; i++) {
                vec1[i] = (int)(Math.random() * 10);
            }
            for (int i = 0; i < n; i++) {
                vec2[i] = (int)(Math.random() * 10);
            }
            System.out.println("Los vectores han sido rellenados.");
        }
    }
    
    public static boolean compare(int[]vec1,int[]vec2,int n){
        
        boolean check = true;
        for (int i = 0; i < n; i++) {
            if (vec1[i]!= vec2[i]) {
                check = false;
            }
        }
        return check;
    }
}
