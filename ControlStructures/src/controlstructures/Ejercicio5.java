/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los numeros 
introducidos supere el límite inicial.

 */
package controlstructures;

import java.util.Scanner;


public class Ejercicio5 {

  
    public static void main(String[] args) {
       
        int lim,num,sumatoria;
        
        sumatoria = 0;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite(positivo):");
        
        lim = read.nextInt();
        
        System.out.println("Ingrese números:");
        
        do {
            num = read.nextInt();
            sumatoria += num;
        } while(sumatoria<=lim);
        
        System.out.println("La sumatoria de los valores ingresados es: " + sumatoria);
    }
    
}
