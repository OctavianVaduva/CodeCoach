package Hovercraft.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        int profit = sales * 3000000;
        if(profit > 21000000) {
            System.out.println("Profit");
        } else if (profit == 21000000) {
            System.out.println("Broke Even");
        } else {
            System.out.println("Loss");
        }
    }
}