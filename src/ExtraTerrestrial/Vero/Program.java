package ExtraTerrestrial.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();


        String newWord="";

        for (int i=word.length()-1; i>=0; i--)
        {
            newWord+=word.charAt(i);
        }

        System.out.print(newWord);

    }
}
