package MilitaryTime.Vero;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();

        DateTimeFormatter time = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        LocalTime t = LocalTime.parse(x,time);

        String newTime = String.valueOf(t);

        System.out.println(newTime);

    }
}
