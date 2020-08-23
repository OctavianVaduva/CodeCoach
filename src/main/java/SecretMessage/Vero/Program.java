package SecretMessage.Vero;

import java.util.Scanner;

public class Program {

    private static final String alpha="abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        System.out.println("Insert the text to reverse into Secret Message");
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        x = x.toLowerCase();

        String a = "";
        for (int i=0; i<x.length(); i++){
            if (alpha.contains(""+ x.charAt(i))) {
                int position = alpha.indexOf(x.charAt(i));
                a = a + alpha.charAt(alpha.length() - 1 - position);
            }
            else{
                a = a + x.charAt(i);}
        }

        System.out.println(a);

    }
}
