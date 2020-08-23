package HalloweenCandy.VV;

import java.util.Scanner;
import java.lang.Math;

public class Program
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();
        System.out.println((int)Math.ceil(200.0/houses));
    }
}