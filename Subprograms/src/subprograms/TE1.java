

package subprograms;
import java.util.Scanner;

public class TE1 {

    
    public static void main(String[] args) {
        
        String frase;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de caracteres:");
        frase = read.nextLine();
        
        System.out.println("La frase ingresada es: " + frase);
        String convertion = frase2(frase);
        System.out.println("La frase modificada es: " + convertion );
    }

    public static String frase2(String frase) {
        
        String newfrase = frase.replace("a","@"); 
        String newfrase2 = newfrase.replace("e", "#");
        String newfrase3 = newfrase2.replace("i", "$");
        String newfrase4 = newfrase3.replace("o", "%");
        String newfrase5 = newfrase4.replace("u", "*");
        
        return newfrase5;
    }
}

