/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
*/

package arrangement;
import java.util.Scanner;

public class Ejercicio4y5 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        //int aux;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat1[i][j] = (int) Math.floor(Math.random() * (10 - (-10) + 1) + (-10)); //rellena mat1.
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) { //rellena mat2.
                mat2[j][i] = mat1[i][j];
            }
        }
        
        /*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                aux = mat2[i][j];
                if (aux < 0) {
                    aux += (aux * (-2));   //genera la matriz antisimétrica.
                } else {
                    if (aux == 0) {
                        aux = 0;
                    } else {
                        aux -= (aux * 2);
                    }
                }
                mat2[i][j] = aux;
            }
        }
         */

        System.out.println("Matriz 1:");
        for (int i = 0; i < 4; i++) {
            System.out.print("\n");                         //imprime mat1.
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mat1[i][j] + "]");
            }
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 4; i++) {
            System.out.print("\n");                         //imprime mat2(transpuesta a mat1)
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + mat2[i][j] + "]");
            }
        }
        System.out.println(" ");
    }
}
