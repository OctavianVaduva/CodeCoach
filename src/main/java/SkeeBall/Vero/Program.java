package SkeeBall.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("points: ");
        int points=input.nextInt();

        System.out.println("cost of squirt gun: ");
        int cost = input.nextInt();

        if ((points/12) >= cost){
            System.out.print("Buy it!");

        }
        else System.out.println("Try again");

    }
}
