package GothamCity.VV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program
{
    public static void main(String[] args) {

        int criminals = 0;
        //System.out.println("Please enter the criminals number ");

        try {
            //get the criminals number from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            criminals = Integer.parseInt(br.readLine());
        }
        //if invalid value was entered
        catch (NumberFormatException ne) {
            System.out.println("Invalid criminals number value" + ne);
        } catch (IOException ioe) {
            System.out.println("IO Error :" + ioe);
        }
        // Calculate
        if(criminals > 10) {
            System.out.println("Good Luck out there!");
        } else if(criminals >= 5) {
            System.out.println("Help me Batman");
        } else {
            System.out.println("I got this!");
        }
    }
}
