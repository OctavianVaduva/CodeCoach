package GothamCity.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int criminals = sc.nextInt();

        if (criminals<5) {
            System.out.print("I got this!");
        }
        else if (criminals>10)
        {
            System.out.print("Good Luck out there!");
        }
        else System.out.print("Help me Batman");
    }

}
