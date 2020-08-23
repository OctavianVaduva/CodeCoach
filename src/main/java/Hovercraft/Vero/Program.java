package Hovercraft.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int hov = sc.nextInt();

        int result= -21000000+hov*3000000;

        if (result>0)
        {
            System.out.println("Profit");
        }
        else if (result<0)
        {
            System.out.print("Loss");
        }
        else System.out.print("Broke Even");


    }
}
