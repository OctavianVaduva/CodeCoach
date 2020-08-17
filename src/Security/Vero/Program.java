package Security.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        char[] ch = x.toCharArray();
        x="";

        for (int i=0; i<ch.length; i++) {
            if (ch[i] != 'x'){
                x+=ch[i];
            }
        }

        char[] ch1 = x.toCharArray();
        boolean alarm = false;
        for (int i=0; i<ch1.length-1; i++) {
            if (((ch1[i]=='T') && (ch1[i+1]=='$')) || ((ch1[i]=='$') && (ch1[i+1]=='T'))) {
                alarm = true;
                break;
            }
        }

        if (alarm) {
            System.out.println("ALARM");
        } else {
            System.out.println("quiet");
        }

    }
}
