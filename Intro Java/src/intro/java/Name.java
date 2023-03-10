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
public class Name {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name;
        
        System.out.println("Ingrese su nombre completo:");
        
        Scanner leer = new Scanner(System.in);
        
        name = leer.nextLine();
        
        System.out.println("El usuario se identificó como: " + name);
    }
    
}
