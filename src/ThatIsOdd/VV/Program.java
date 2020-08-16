package ThatIsOdd.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        int numbersNo = sc.nextInt();//
        for(int i = 1; i <= numbersNo + 2; i++) {
            number =  sc.nextInt();
            int length = String.valueOf(number).length();
            i += length - 1;
            if(number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println(sum);
    }
}