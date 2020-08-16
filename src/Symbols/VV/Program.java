package Symbols.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        //System.out.println(text);
        text = text.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println(text);
    }
}