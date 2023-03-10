/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá 
mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse 
hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se 
sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package controlstructures;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2,menu;
        boolean salir;
        salir = true;
        String opcion;
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese dos números:");
        
        num1 = read.nextInt();
        num2 = read.nextInt();
        
        do {
        System.out.println("MENU:\n 1. SUMAR\n 2.RESTAR\n 3.MULTIPLICAR\n 4.DIVIDIR\n 5.SALIR\n");
        menu = read.nextInt();
        switch(menu){
            case 1:
                System.out.println("La suma de los numeros ingresados es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta de los numeros ingresados es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación de los numeros ingresados es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("La división de los numeros ingresados es: " + (num1 / num2));
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                opcion = read.next();
                if (opcion.equalsIgnoreCase("s")){
                    salir = false;
                }
                break;
            default:
                System.out.println("La opción ingresada es incorrecta, vuelva a intentarlo.");
                
        } 
    } while(salir);
    
}
}
