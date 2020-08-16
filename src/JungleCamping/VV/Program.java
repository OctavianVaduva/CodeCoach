package JungleCamping.VV;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String noises = sc.nextLine();
        String[] noise = noises.split(" ");
        for(String n : noise)
            switch(n){
                case "Grr": System.out.print("Lion ");
                    break;
                case "Rawr": System.out.print("Tiger ");
                    break;
                case "Ssss": System.out.print("Snake ");
                    break;
                case "Chirp": System.out.print("Bird ");
                    break;
            }
    }
}
