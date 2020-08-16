package YouTubeLinkFinder.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String link = sc.nextLine();
        link = link.replace("https://www.youtube.com/watch?v=", "");
        link = link.replace("https://youtu.be/", "");
        System.out.println(link);
    }
}