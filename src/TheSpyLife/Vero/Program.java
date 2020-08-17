package TheSpyLife.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String word=scanner.nextLine();


        word=word.replaceAll("[+]","");

        word=word.replaceAll("[^a-zA-Z\\s+]","");

        String newWord="";

        for (int i=word.length()-1;i>=0;i--) {

            newWord+=word.charAt(i);
        }
        System.out.println(newWord);
    }
}
