package PasswordValidation.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        System.out.println("Numbers: " + countNumbers(x));
        System.out.println("Special Characters: " + countSpecialCharachters(x));

        if ((countNumbers(x) >=2) && (countSpecialCharachters(x) >=2) && (x.length()>=7)) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }

    }
    public static int countNumbers (String word) {
        int count =0;
        char[] ch = word.toCharArray();
        for(int i = 0; i < word.length(); i++) {

            if (Character.isDigit(ch[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countSpecialCharachters (String word) {
        int count =0;
        char[] ch = word.toCharArray();
        for(int i = 0; i < word.length(); i++) {

            if ((ch[i] == '!') || (ch[i] == '#') || (ch[i] == '@') || (ch[i] == '$') || (ch[i] == '%') || (ch[i] == '&') || (ch[i] == '*'))  {
                count++;
            }
        }
        return count;
    }
}
