package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--)
        {
            password += username.charAt(i);
        }

        String inputPassword = scanner.nextLine();
        int counter = 1;
        while (!password.equals(inputPassword) && counter < 4)
        {
            System.out.println("Incorrect password.Try again");
            inputPassword = scanner.nextLine();
            counter++;
        }
        if (password.equals(inputPassword))
        {
            System.out.printf("User %s logged in.",username);
        }else
        {
            System.out.printf("User %s blocked!",username);
        }
    }
}
