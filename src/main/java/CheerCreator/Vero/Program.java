package CheerCreator.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cheer = sc.nextInt();

        if (cheer < 1) {
            System.out.println("shh");
        } else if (cheer > 10) {
            System.out.println("High Five");
        } else {

            while (cheer >= 1) {
                System.out.print("Ra!");
                cheer--;

            }
        }
    }
}
