package HalloweenCandy.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();

        //your code goes here

        if (houses>3) {
            System.out.print((int)Math.ceil(2.0/
                    houses*100));}

        else if(houses==3){

            System.out.print((int)Math.ceil((2/(double)houses)*100));

        }
    }
}
