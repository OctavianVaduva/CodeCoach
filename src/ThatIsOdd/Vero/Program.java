package ThatIsOdd.Vero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            int n = Integer.valueOf(sc.nextLine());

            int sum = 0;

            while (n != 0) {
                int r = Integer.valueOf(sc.nextLine());

                if (r % 2 == 0) {
                    sum += r;
                }

                n--;

            }

            System.out.print(sum);

        }


    }
