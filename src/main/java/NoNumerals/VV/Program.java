package NoNumerals.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();

        phrase = phrase.replaceAll("10", "ten");
        phrase = phrase.replaceAll("9", "nine");
        phrase = phrase.replaceAll("8", "eight");
        phrase = phrase.replaceAll("7", "seven");
        phrase = phrase.replaceAll("6", "six");
        phrase = phrase.replaceAll("5", "five");
        phrase = phrase.replaceAll("4", "four");
        phrase = phrase.replaceAll("3", "three");
        phrase = phrase.replaceAll("2", "two");
        phrase = phrase.replaceAll("1", "one");
        phrase = phrase.replaceAll("0", "zero");
        System.out.println(phrase);
    }
}
