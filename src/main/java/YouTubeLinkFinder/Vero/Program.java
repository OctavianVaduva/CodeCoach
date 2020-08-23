package YouTubeLinkFinder.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();

        String[] y =  x.split("/");
        String videoID = "";

        if ((y[y.length-1]).startsWith("watch")) {
            String[] i = y[y.length-1].split("=");
            videoID = i[i.length-1];
        }
        else
        {   videoID = y[y.length-1];}

        System.out.println(videoID);

    }
}
