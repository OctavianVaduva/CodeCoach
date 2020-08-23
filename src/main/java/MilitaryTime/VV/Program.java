package MilitaryTime.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String milHour = "";
        boolean isAM = false;
        String amPmHour = sc.nextLine();
        //  System.out.println(amPmHour);
        String[] hour = amPmHour.split(" ");
        if(hour[1].equals("AM")){
            isAM = true;
        }
        //  System.out.println(isAM);
        // milHour = hour[0];

        if(isAM){
            String[] temp = hour[0].split(":");
            if(temp[0].length() == 1) {
                milHour += "0";
            }
            milHour +=  (Integer.parseInt(temp[0]))%12 + ":" + temp[1];

        } else {
            String[] temp = hour[0].split(":");

            milHour += ((Integer.parseInt(temp[0]))%12 + 12) + ":" + temp[1];
        }
        System.out.println(milHour);
    }
}
