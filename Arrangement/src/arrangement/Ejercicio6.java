/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine 
si este cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
*/

package arrangement;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[][] magic = new int[3][3];

        fill(magic);
        System.out.println(" ");
        show(magic);
        System.out.println(" ");
        boolean check = ismagic(magic);
        
        System.out.println("¿Es la matriz ingresada una matriz mágica?: " + check);
        
    }

    public static void fill(int[][] magic) {
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Ingrese nueve números entre el 1 y el 9:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                                                           //rellena la matriz.
                num = read.nextInt();
                while (num < 1 || num > 9) {
                    System.out.println("El número ingresado es incorrecto, intente nuevamente.");
                    num = read.nextInt();
                }
                magic[i][j] = num;
            }
        }
    }

    public static void show(int[][] magic) {
        String aux;
        for (int[] fila : magic) {
            aux = "";
            for (int elemento : fila) {                  //imprime la matriz.
                aux += "" + "[" + elemento + "]";
            }
            System.out.println(aux);
        }
    }

    public static boolean ismagic(int[][] magic) {

        int[] vecaux;
        vecaux = new int[8];
        int sum, count;
        count = 0;
        int aux;
        boolean ismagic;
        ismagic = true;
        
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += magic[i][j];
            }
            vecaux[count] = sum;
            count++;
        }
        
        for (int j = 0; j < 3; j++) {
            sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += magic[i][j];
            }
            vecaux[count] = sum;
            count++;
        }
                                                //determina si la matriz es mágica.
        sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sum += magic[i][j];
                }
            }
        }
        vecaux[count] = sum;
        count++;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == (2)) {
                    sum += magic[i][j];
                }
            }
        }
        vecaux[count] = sum;
        aux = vecaux[0];
        
        for (int i = 0; i < 7; i++) {
            if (aux != vecaux[i]) {
                ismagic = false;
                break;
            }
        }
        return ismagic;
    }
}



