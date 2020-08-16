package Convert_US_EU_date.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String euDate = "";
        Scanner sc = new Scanner(System.in);
        String usDate = sc.nextLine();
        if(usDate.indexOf("/") > 0){
            String[] date = usDate.split("/");
            euDate += date[1] + "/" + date[0] + "/" + date[2];
        }else{
            usDate = usDate.replaceAll("\\p{Punct}", "");
            String[] date = usDate.split(" ");
            switch(date[0]){
                case "January":
                    date[0] = "1";
                    break;
                case "February":
                    date[0] = "2";
                    break;
                case "March":
                    date[0] = "3";
                    break;
                case "April":
                    date[0] = "4";
                    break;
                case "May":
                    date[0] = "5";
                    break;
                case "June":
                    date[0] = "6";
                    break;
                case "July":
                    date[0] = "7";
                    break;
                case "August":
                    date[0] = "8";
                    break;
                case "September":
                    date[0] = "9";
                    break;
                case "October":
                    date[0] = "10";
                    break;
                case "November":
                    date[0] = "11";
                    break;
                case "December":
                    date[0] = "12";
                    break;
            }

            euDate += date[1] + "/" + date[0] + "/" + date[2];
        }
        System.out.println(euDate);
    }
}
