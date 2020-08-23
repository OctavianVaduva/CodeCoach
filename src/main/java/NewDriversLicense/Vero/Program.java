package NewDriversLicense.Vero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter number of agents: ");
        int agents = Integer.parseInt(sc.nextLine());
        System.out.println("Enter all others names: ");
        String allNames = sc.nextLine();

        name = name.trim().toLowerCase();
        allNames = allNames.trim().toLowerCase();
        ArrayList<String> all = new ArrayList<>();
        String[] allNamesArray = allNames.split(" ");
        for (String i : allNamesArray) {
            all.add(i);
        }
        all.add(name);

        Collections.sort(all);
        System.out.println(all);

        int position = all.indexOf(name)+1;
        int t= 0;
        if (position < agents){
            t =20;
        }
        else{
            t = (int)Math.ceil(position/agents) * 20;
        }
        System.out.println(t);

    }
}
