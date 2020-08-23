package Argentina.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesos = input.nextInt();
        int dollars = input.nextInt();

        if(pesos/50 < dollars) {
            System.out.println("Pesos");
        } else {
            System.out.println("Dollars");
        }
    }
}
