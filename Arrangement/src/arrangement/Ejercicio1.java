

package arrangement;
import java.util.Scanner;

public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector= new int[100];
        for (int i=0; i < vector.length; i++ ){
            vector[i]= i+1;
        }
        
        for (int i = vector.length-1; i >= 0; i--){
        
            System.out.println(" "+vector[i]+" ");
        }
    }

}
