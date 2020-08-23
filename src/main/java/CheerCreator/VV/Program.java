package CheerCreator.VV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program
{
    public static void main(String[] args) {

        int yards = 0;
        //System.out.println("Please enter yards number ");

        try {
            //get the yards from console
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            yards = Integer.parseInt(br.readLine());
        }
        //if invalid value was entered
        catch (NumberFormatException ne) {
            System.out.println("Invalid yards value" + ne);
        } catch (IOException ioe) {
            System.out.println("IO Error :" + ioe);
        }
        // Calculate
        if(yards > 10) {
            System.out.println("High Five");
        } else if(yards > 1) {
            for(int i=1; i <= yards; ++i){
                System.out.print("Ra!");
            }
            System.out.println();
        } else {
            System.out.println("shh");
        }
    }
}