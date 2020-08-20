package Argentina.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pricePesos = scanner.nextInt();
        int priceUSD = scanner.nextInt();

        if ((pricePesos*0.02)>priceUSD)
        { System.out.print("Dollars");}

        else System.out.print ("Pesos");
    }

}
