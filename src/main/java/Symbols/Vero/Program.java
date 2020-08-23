package Symbols.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();

        word=word.replaceAll("[^a-zA-Z0-9\\s]","");

        System.out.print(word);

    }
}
