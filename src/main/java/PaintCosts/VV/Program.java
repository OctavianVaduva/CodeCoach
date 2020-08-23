package PaintCosts.VV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Program
{
    public static void main(String[] args) {
        int colors = 0;
        //System.out.println("Please enter colors number ");
        try {
            //get the colors number from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            colors = Integer.parseInt(br.readLine());
            //if invalid value was entered
        } catch (NumberFormatException ne) {
            System.out.println("Invalid colors value" + ne);
        } catch (IOException ioe) {
            System.out.println("IO Error :" + ioe);
        }
        if(colors >= 0) {
            double price = Math.round(1.1 * (5 * colors + 40));
            System.out.println((int)price);
        }
    }
}
