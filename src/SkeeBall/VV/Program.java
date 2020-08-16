package SkeeBall.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points = input.nextInt();
        int price = input.nextInt();

        if(points/12 >= price) {
            System.out.println("Buy it!");
        } else {
            System.out.println("Try again");
        }
    }
}
