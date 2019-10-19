package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());
        int sumNumber = 0;

        for (int i = firstNumber; i <= lastNumber; i++)
        {
            System.out.print(i + " ");
            sumNumber += i;
        }
        System.out.printf("%nSum: %d", sumNumber);
    }
}
