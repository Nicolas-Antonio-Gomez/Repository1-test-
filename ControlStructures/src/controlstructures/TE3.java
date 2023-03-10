/*
 * Escriba un programa que valide si una nota está entre 0 y 10, 
 * sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea 
 * correcta.
 */

package controlstructures;

import java.util.Scanner;


public class TE3 {

   
    public static void main(String[] args) {
       
        int score;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una nota entre el 1 y el 10");
        
        score = read.nextInt();
        
        while (score<1 || score>10){
            System.out.println("La nota ingresada es incorrecta, intente nuevamente.");
            score = read.nextInt();
        }
    }
    
}
