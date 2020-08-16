package ExtraTerrestrial.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String alienWord = "";
        int max = word.length()-1;

        for (int i = max; i >= 0; --i) {
            alienWord += word.charAt(i);
            //System.out.print(word.charAt(i));
        }
        System.out.println(alienWord);
    }
}