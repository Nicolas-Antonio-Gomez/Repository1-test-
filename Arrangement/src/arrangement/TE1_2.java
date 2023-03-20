

package arrangement;

import java.util.Scanner;

public class TE1_2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String[] team = new String[9];
        String classmate;

        for (int i = 0; i < team.length; i++) {
            System.out.println("Ingrese los nombres de sus compañeros de equipo:");
            classmate = read.nextLine();
            team[i] = classmate;

        }
        for (String team1 : team) {
            System.out.println("[" + team1 + "]");
        }
    }
}
