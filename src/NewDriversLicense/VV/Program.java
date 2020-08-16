package NewDriversLicense.VV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.next();//add my name
        int agentsNo = sc.nextInt();//number of agents
        int waitingTime = 0;//how long will it take me
        ArrayList <String> list = new ArrayList <> (5);
        //add other 4 names
        list.add(names);
        for (int i = 0; i < 4; i++)
            list.add(sc.next());
        //name sorting
        Collections.sort(list);
        //my position
        int myPosition = list.indexOf(names);
        //calculate waiting time
        waitingTime += 20 * (1 + myPosition / agentsNo);
        System.out.print(waitingTime);
    }
}