package PigLatin.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the text to be converted to PIG LATIN: ");

        String text = sc.nextLine();

        String[] words = text.split("\\s+");

        for (int i=0; i<words.length;i++){
            words[i]= words[i].substring(1)+words[i].charAt(0)+"ay";
        }

        for(String s : words){
            System.out.print(s+" ");
        }
    }
}
