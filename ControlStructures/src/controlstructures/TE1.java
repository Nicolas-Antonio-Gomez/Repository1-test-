/*
 * Implementar un programa que le pida dos números enteros al usuario y determine 
 * si ambos o alguno de ellos es mayor a 25.
*/
package controlstructures;

import java.util.Scanner;


public class TE1 {

   
    public static void main(String[] args) {
        
        int num1,num2;
      
        System.out.println("Ingrese dos números:");
       
        Scanner read = new Scanner(System.in);
        
        num1 = read.nextInt();
        num2 = read.nextInt();
        
        if (num1 > 25 || num2 > 25) {
            System.out.println("Alguna de las variables es mayor al valor dado");
        } else {
            System.out.println("Ninguna de las variables es mayor al valor dado");
        }

    }
}
