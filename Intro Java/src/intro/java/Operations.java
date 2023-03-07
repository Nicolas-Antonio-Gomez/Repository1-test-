/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;
/**
 *
 * @author nicol
 */
public class Operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       float num;
       
        System.out.println("Ingrese un número:");
        
        Scanner read = new Scanner(System.in);
        
        num = read.nextFloat();
        
        System.out.println("El doble es: " + num*2);
        System.out.println("El triple es: " + num*3);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));
    }
    
}
