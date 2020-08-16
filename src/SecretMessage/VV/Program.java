package SecretMessage.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String message = sc.nextLine();
        message = message.toLowerCase();
        StringBuilder sentence = new StringBuilder(message);
        for (int i=0; i < message.length(); i++) {
            sentence.replace(i, i+1, encode(message.charAt(i)));
        }
        String output = sentence.toString();
        System.out.println(output);
    }
    public static String encode(char letter) {
        int ascii = letter;
        if(ascii>=97 && ascii<=122) {
            int temp=ascii-97;
            ascii=122-temp;
        }
        return Character.toString((char)ascii);
    }
}
