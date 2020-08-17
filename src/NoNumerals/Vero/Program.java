package NoNumerals.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        for (int i=0; i<x.length();i++){

            String a =""+x.charAt(i);

            if (a.equals("0")){x=x.replaceAll(a,"zero");}
            if (a.equals("1")){x=x.replaceAll(a,"one");}
            if (a.equals("2")){x=x.replaceAll(a,"two");}
            if (a.equals("3")){x=x.replaceAll(a,"three");}
            if (a.equals("4")){x =x.replaceAll(a,"four");}
            if (a.equals("5")){x=x.replaceAll(a,"five");}
            if (a.equals("6")){x=x.replaceAll(a,"six");}
            if (a.equals("7")){x =x.replaceAll(a,"seven");}
            if (a.equals("8")){x =x.replaceAll(a,"eight");}
            if (a.equals("9")){x=x.replaceAll(a,"nine");}
            if (a.equals("10")){x =x.replaceAll(a,"ten");

            }}


        x = x.replaceAll("onezero", "ten");

        System.out.println(x);
    }

}
