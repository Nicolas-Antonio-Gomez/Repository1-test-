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
public class UpperAndLower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase;
        
        System.out.println("Ingrese una frase:");
        
        Scanner read = new Scanner(System.in);
        
        frase = read.nextLine();
        
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
