package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("The number is:" + Math.abs(inputNumber));
            System.exit(0);
        }

        while (inputNumber % 2 != 0)
        {
                    System.out.println("Plese write an even number:");
                    inputNumber = scanner.nextInt();
        }

        System.out.println("The number is:" + Math.abs(inputNumber));

    }
}
