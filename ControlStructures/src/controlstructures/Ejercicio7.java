

package controlstructures;
import java.util.Scanner;

public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        public class Exercise7 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static final String FDE = "&&&&&";
	public static final String START = "X";
	public static final String END = "O";
	public static final int LENGTH = 5;
	
	public static void main(String[] args) {
		
		String message;
		int goodInputs = 0,
			badInputs = 0;
		
		System.out.print("Ingrese un mensaje: ");
		message = scan.next();
		
		while (!message.equals(FDE)) {
			
			if (message.substring(0, 1).equals(START) && message.substring(message.length() - 1, message.length()).equals(END) && message.length() == LENGTH) {
				goodInputs++;
			} else {
				badInputs++; //badInputs += 1 - badInputs = badInputs + 1
			}
			
			System.out.print("Ingrese el siguiente mensaje: "); //Escribir Sin Saltar "Ingrese el siguiente mensaje: "
			message = scan.next(); //Leer message
		}

//		while (true) {
//			System.out.print("Ingrese el siguiente mensaje: "); //Escribir Sin Saltar "Ingrese el siguiente mensaje: "
//			message = scan.next(); //Leer message
//			
//			if (!message.equals(FDE)) {
//				break;
//			}
//			
//			if (message.substring(0, 1).equals(START) && message.substring(message.length() - 1, message.length()).equals(END) && message.length() == LENGTH) {
//				goodInputs++;
//			} else {
//				badInputs++; //badInputs += 1 - badInputs = badInputs + 1
//			}
//		}
		
		System.out.printf("\nDe los %d mensajes recibidos:\n%d fueron correctos\n%d fueron incorrectos.\n\n", goodInputs + badInputs, goodInputs, badInputs);
	}
}
package ecx12;

import java.util.Scanner;

/*
	
	Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
	Las cadenas deben llegar con un formato fijo: tienen que ser de un mÃ¡ximo de 5 caracteres de largo, el primer carÃ¡cter tiene que ser X y
	el Ãºltimo tiene que ser una O. Las secuencias leÃ­das que respeten el formato se consideran correctas, la secuencia especial â€œ&&&&&â€  marca
	el final de los envÃ­os (llamÃ©️mosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta. Al finalizar
	el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberÃ¡
	investigar cÃ³mo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
*/
    }

}
