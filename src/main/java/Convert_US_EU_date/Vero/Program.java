package Convert_US_EU_date.Vero;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String date = input.nextLine();
        String euroDate="";

        if(date.contains("/"))
        {
            String[] arrDate=date.split("/");
            euroDate =arrDate[1]+"/"+arrDate[0]+"/"+arrDate[2];
        }
        else
        {
            String[] arrDate=new String[3];
            arrDate=date.split(" ");
            String monthNum= Integer.toString(getMonNum(arrDate[0]));
            euroDate=arrDate[1].substring(0,arrDate[1].length()-1)+"/"+monthNum+"/"+arrDate[2];

        }

        System.out.println(euroDate);

    }
    public static int getMonNum(String s)
    {
        ArrayList<String> Months =new ArrayList<String>();
        Months.add("January");
        Months.add("February");
        Months.add("March");
        Months.add("April");
        Months.add("May");
        Months.add("June");
        Months.add("July");
        Months.add("August");
        Months.add("September");
        Months.add("October");
        Months.add("November");
        Months.add("December");

        int ret=0;
        if(Months.contains(s))
            ret=Months.indexOf(s)+1;

        return ret;
    }

}
