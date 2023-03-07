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
public class ConvertionCtoF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float temp, convert;
        
        System.out.println("Ingrese una temperatura en C°:");
        
        Scanner read = new Scanner(System.in);
        
        temp = read.nextFloat();
        
        convert = (32 + (9 * temp/5));
        
        System.out.println("La temperatura en F° es de: " + convert + " grados.");
    }
    
}
