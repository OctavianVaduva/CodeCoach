package TheSpyLife.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String codedText = sc.nextLine();
        codedText = codedText.replaceAll("[^a-zA-Z\\s]", "");
        String decodedText = "";
        int max = codedText.length()-1;
        for (int i = max; i >= 0; --i) {
            decodedText += codedText.charAt(i);
        }
        System.out.println(decodedText);
    }
}