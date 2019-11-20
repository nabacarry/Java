package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.next("\\w+");
        String secondWord = scanner.next("\\w+");
        int firstNumber = scanner.nextInt();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();
        scanner.nextLine();
        String thirdWord = scanner.nextLine();

        double sum = (firstNumber + secondNumber + thirdNumber);

        System.out.println(String.format(firstWord + ' ' + secondWord + ' ' + thirdWord + ' ' + (int)sum));

    }
}
