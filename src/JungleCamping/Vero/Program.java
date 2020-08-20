package JungleCamping.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text  = sc.nextLine();
        String[] textarr=text.trim().split("\\s+");

        for(String s : textarr){

            if(s.equals("Grr"))
            {
                System.out.print("Lion ");
            }

            else if (s.equals("Rawr"))
            {
                System.out.print("Tiger ");
            }
            else if (s.equals("Ssss"))
            {
                System.out.print("Snake ");
            }
            else if (s.equals("Chirp")){System.out.print("Bird ");
            }

        }
    }
}
