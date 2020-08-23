package DejaVu.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] char1 = text.toCharArray();

        int c=0;

        for (int i=0; i<char1.length; i++){
            for (int j=i+1; j<char1.length; j++){

                if (char1[i]== char1[j]) {
                    c+=1;
                }
                else continue;

            }
        }

        if (c>0)
        {System.out.print("Deja Vu");}
        else {System.out.print("Unique");}
    }

}
