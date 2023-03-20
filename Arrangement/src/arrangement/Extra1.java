/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.
*/

package arrangement;
import java.util.Scanner;

public class Extra1 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector a rellenar:");
        int n = read.nextInt();
        int[] vec = new int[n];
        
        fill(vec,n);
        int sumatoria = sum(vec,n);
        
        System.out.println("La sumatoria de los numeros ingresados es: " + sumatoria);
    }
    
    public static void fill(int[] vec, int n){
        Scanner read = new Scanner(System.in);
        int num;
        System.out.println("Ahora, ingrese los números del vector:");
        for (int i = 0; i < n; i++) {
            num = read.nextInt();
            vec[i] = num;
        }
    }

    public static int sum(int[] vec,int n){
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += vec[i];
        }
        
        return sum;
    }
}
