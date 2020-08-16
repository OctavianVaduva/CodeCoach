package PasswordValidation.VV;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        //System.out.println(password);
        int passLength = password.length();
        //System.out.println(passLength);

        int passNumNo = (password.replaceAll("[^0-9]", "")).length();
        //System.out.println(passNumNo);
        int passSpecNo = passLength - (password.replaceAll("[^A-Za-z0-9]", "").length());
        //System.out.println(passSpecNo);

        if(passLength >= 7 && (passNumNo >= 2 && passSpecNo >= 2)) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }

    }
}