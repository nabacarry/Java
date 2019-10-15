package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nNumbers = scanner.nextInt();
        int sumOddNumbers = 0;
        for (int i = 1 ; i <= nNumbers; i++)
        {
                System.out.println(((2*i)-1));
                sumOddNumbers += ((2*i)-1);

        }

        String textSum = String.format("Sum of odd numbers: %d", sumOddNumbers);
        System.out.println(textSum);
}
}
