package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nNumber = Integer.parseInt(scanner.nextLine());
        int nNumber2 = nNumber;
        int sum = 0;

        while (nNumber > 0)
        {
            int factorial = 1;
            int number = nNumber % 10;
            nNumber /= 10;

            for (int i = 2; i <= number; i++)
            {
                factorial *= i;
            }

            sum += factorial;
        }
        if (sum == nNumber2) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
