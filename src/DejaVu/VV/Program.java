package DejaVu.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int sum = 0;
        for(int i=0; i < word.length()-2; i++) {
            if(word.charAt(i) == word.charAt(i+1)) {
                sum = 1;
                break;
            }
        }

        if (sum > 0) {
            System.out.println("Deja Vu");
        } else {
            System.out.println("Unique");
        }

    }
}
