package PaintCosts.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        double result = (no*5.0+40.00)*1.1;
        System.out.println((int)(Math.round(result)));
    }

}
