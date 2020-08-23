package AverageWordLength.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x=x.replaceAll("\\p{Punct}", "");

        String[] xArray = x.split(" ");
        int sum = 0;
        int count = 0;
        for (String i : xArray){
            sum += i.length();
            count++;
        }

        double avg = ((double)sum)/((double)count);
        System.out.println((int)Math.ceil(avg));

    }
}
