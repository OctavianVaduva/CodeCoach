package PigLatin.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        words = words.toLowerCase().replaceAll("\\p{Punct}", "");
        String[] wordsArr = words.split(" ");
        for(String word:wordsArr){
            word = word.substring(1) + word.charAt(0) + "ay";
            System.out.print(word + " ");
        }

    }
}
