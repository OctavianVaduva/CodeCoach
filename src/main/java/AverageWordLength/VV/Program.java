package AverageWordLength.VV;

import java.util.Scanner;
import java.lang.Math;

public class Program {
    public static void main(String[] args) {
        int wordsNo = 0;
        int charNo = 0;
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        words = words.replaceAll("\\p{Punct}", "");
        String[] wordsArr = words.split(" ");
        for(String word:wordsArr){
            wordsNo++;
            charNo += word.length();
        }
        System.out.println((int)Math.ceil((double)charNo/wordsNo));
    }
}
