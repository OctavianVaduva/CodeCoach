package Security.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ground = sc.next();
        ground = ground.replaceAll("x", "");
        ground = ground.replaceAll("T\\$", "Q");
        ground = ground.replaceAll("\\$T", "Q");
        //System.out.println(ground);

        if(ground.indexOf('Q') >= 0){
            System.out.println("ALARM");
        } else {
            System.out.print("quiet");
        }
    }
}